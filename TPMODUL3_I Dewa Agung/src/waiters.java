public class waiters implements Runnable {

    private final int orderQty;
    private final int customerID;
    static int FoodPrice = 30000;

    public waiters(int customerID, int orderQty) {
        this.customerID = customerID;
        this.orderQty = orderQty;
    }



    @Override
    public void run() {
        while (true) {
            getFood();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void orderInfo() {
        System.out.println("========= EAD RESTAURANT ========");
        System.out.println("Customer ID: " + this.customerID);
        System.out.println("Numbeer of Coffee: " + this.orderQty);
        System.out.println("Total Price: " + this.orderQty * FoodPrice);
        System.out.println("=================================");
    }

    public void getFood() {
        synchronized(Restaurant.getLock()) {

            System.out.println("Waiter : Makanan Sudah diantar");
            Restaurant restoRestaurant = new Restaurant();
            restoRestaurant.setWaitingForPickup(false);

            if (Restaurant.getFoodNumber() == this.orderQty + 1) {
                orderInfo();
                System.exit(0);
            }
            Restaurant.getLock().notifyAll();
            System.out.println("Waiter: Bilang ke restaurant untuk membuat makanan lain\n");

        }
    }
}