package NPM07066soalPendahuluan4;

public class pegawai extends manusia {
    private int id;
    private String kataSandi;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setKataSandi(String kataSandi) {
        this.kataSandi = kataSandi;
    }

    public String getKataSandi() {
        return kataSandi;
    }
    @Override
    public  void print(){
        System.out.println("ID Pegawai : " + this.getId());
        System.out.println("Nama       : " + this.getNama());
        System.out.println("No HP      : " + this.getNoHp());
    }
}
