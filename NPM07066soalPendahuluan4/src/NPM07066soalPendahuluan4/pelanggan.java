package NPM07066soalPendahuluan4;

public class pelanggan extends manusia {
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    @Override
    public void print(){
        System.out.println("ID Pegawai : " + this.getId());
        System.out.println("Nama       : " + this.getNama());
        System.out.println("No HP      : " + this.getNoHp());
    }
}
