public class TransportasiAir {
    int Jumlahkursi;
    int biaya;

    Perangkat(Int jumlhakursi, int biaya) {
        this.jumlahkursi = jumlhakursi;
        this.biaya = biaya;
    
    }

    public void informasi() {
        System.out.printf(
                "Transportasi Air jenis tidak diketahui dengan kursi berjumlah %d ditetapkan dengan biaya sebesar %\n",
                this.Jumlahkursi, this.biaya);
    }
    public void berlayar() {
        System.out.printf(
            "Transportasi Air dengan jenis tidak diketahui sedang berlayar\n");

    public void berlabuh() {
        System.out.printf(
               "Transportasi Air  dengan jenis yang tidak diketahui sedang berlayar\n");
    }

}