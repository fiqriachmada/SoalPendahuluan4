package NPM07066soalPendahuluan4;

public class cucian {
    private pegawai pegawai;
    private pelanggan pelanggan;
    private float berat, hargaTotal, perKilo = 5000;

    public void setPegawai(pegawai pegawai) {
        this.pegawai = pegawai;
    }

    private pegawai getPegawai() {
        return pegawai;
    }

    public void setPelanggan(pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    private pelanggan getPelanggan() {
        return pelanggan;
    }

    private float getBerat() {
        return berat;
    }

    private float getPerkilo() {
        return this.perKilo;
    }

    public float getHargaTotal(float berat) {
        this.berat = berat;
        return this.berat;
    }

    private float getHargaTotal(float berat, float perKilo) {
        return this.hargaTotal = berat * perKilo;
    }

    public void print() {
        System.out.println("Nama Pegawai            : " + this.getPegawai().getNama());
        System.out.println("Nama Pelanggan          : " + this.getPelanggan().getNama());
        System.out.println("Berat Cucian            : " + this.getBerat() + " KG.");
        System.out.println("Harga Total Cucian Rp.  : " + this.getHargaTotal(this.getHargaTotal(berat),this.getPerkilo()));
    }

}
