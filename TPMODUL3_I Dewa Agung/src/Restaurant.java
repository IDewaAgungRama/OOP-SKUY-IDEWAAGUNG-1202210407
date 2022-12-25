
public class Restaurant implements Runnable {

    private boolean waitingForPickup = false;
    private static final Object lock = new Object();
    private static int FoodNumber = 1;

    @Override
    public void run() {
        while (true) {
            makeFood();
            try {
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setWaitingForPickup(boolean waitingForPickup) {
        this.waitingForPickup = waitingForPickup;
    }

    public static int getFoodNumber() {
        return FoodNumber;
    }

    public void makeFood() {
        synchronized(Restaurant.lock) {
            
            if (this.waitingForPickup) {
                try {
                    System.out.println("Restaurant : menunggu makanan untuk disajikan/diantarkan oleh pelayan");
                    Restaurant.lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

            waitingForPickup = true;
            System.out.println("Restaurant :  Membuat Nomor antrian makanan " + FoodNumber++);
            Restaurant.lock.notifyAll();
            System.out.println("Restaurant : Memeberitahu pelayan untuk menggambil makanan\n");
        }
    }

    public static Object getLock() {
        return lock;
    }
}