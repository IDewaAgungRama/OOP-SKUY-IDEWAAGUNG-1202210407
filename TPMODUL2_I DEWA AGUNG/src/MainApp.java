public class MainApp {
    public static void main(String[] args) {
        Perangkat Perangkat = new Perangkat("Adata", 2, 2.0F);
        Perangkat.informasi();
        System.out.println("");
        laptop provid = new laptop("provid", 10, 3.90F, true);
        provid.webcam = true;
        provid.informasi();
        provid.bukaGame("POINT BLANK, Valorant, zuma ");
        provid.kirimEmail("JAVA@GMAIL.COM");
        provid.kirimEmail("mahasiswa@gmail.com", "anonymos@gmail.com");
        System.out.println("");
        Handphone manage = new Handphone("snap", 3, 2.50F, false);
        manage.informasi();
        manage.telfon(812222223);
        manage.kirimSMS(812345678);
        manage.kirimSMS(819992202, 812330122);
    }

}
