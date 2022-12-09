public class MainApp {
    public static void main(String[] args) {
        kapal kapal = new kapal("kapal", 10, 15000);
        Perangkat.informasi();
        System.out.println("");
        Kapal provid = new Kapal("kapal", 10, 15000, true);
        provid.mesin = true;
       
    }

}
