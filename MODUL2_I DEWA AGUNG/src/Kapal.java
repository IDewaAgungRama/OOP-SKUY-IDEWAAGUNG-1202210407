public class Kapal extends TransportasiAir {
protected string mesin ;

    KapalKapal(int jumlahKursi, int biaya, String mesin) {
        super(jumlahKursi, biaya, mesin);
        this.mesin = mesin;
    }

    @Overload
    public void Informasi() {
        if (mesin) {
            System.out.printf(
                    "Transportasi Air jenis Kapal mempunyai mesin \n");
        } else {
            System.out.printf(
                    "Transportasi air dengan jenis ini tidak ada mesin\n",);
        }
    }

    public void informasi() {
        System.out.printf("Transportasi Air dengan jenis kapal sedang belayar menggunakan mesin turbo dengan kecepatan stabil);
    }

    public void berlayar() {
        System.out.printf("Transportasi Air dengan jenis kapal sedang belayar menggunakan mesin turbo dengan kecepatan stabil);
    }

    public void berlayar(int kecepatan) {
        System.out.printf("Transportasi Air dengan jenis kapal sedang belayar menggunakan mesin turbo dengan kecepatan stabil di kisaran %knot", , kecepatan);
    }
}

}