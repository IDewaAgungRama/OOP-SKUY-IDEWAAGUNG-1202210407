public class laptop extends Perangkat {
    protected boolean webcam;

    public laptop(String drive, int ram, float processor, boolean webcam) {
        super(drive, ram, processor);
        this.webcam = webcam;
    }

    @Override
    public void informasi() {
        if (webcam) {
            System.out.printf(
                    "Laptop ini memiliki drive tipe %s dengan ram sebesar %d GB dan processor secepat %.2f Ghz. laptop ini dilengkapi dengan Webcam sama dengan webcam Logitec \n",
                    this.drive, this.ram, this.processor);
        } else {
            System.out.printf(
                    "Laptop ini memiliki drive tipe %s dengan ram sebesar %d GB dan processor secepat %.2f Ghz. Laptop ini tidak dilengkapi Webcam \n",
                    this.drive, this.ram, this.processor);
        }
    }

    public void bukaGame(String nama_game) {
        System.out.printf("Laptop berhasil membuka game %s \n", nama_game);
    }

    public void kirimEmail(String email) {
        System.out.printf("Laptop berhasil mengirim Email ke %s \n", email);
    }

    public void kirimEmail(String email1, String email2) {
        System.out.printf("Laptop berhasil mengirim Email ke %s dan %s \n", email1, email2);
    }

}

