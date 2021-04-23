package HinhHoc;

public abstract class hinhhoc {
    String tenHinh;
    int socanh;

    public abstract void nhap();

    public void xuat()
    {
        System.out.println("Hinh hoc");
    }

    public String getTenHinh() {
        return tenHinh;
    }

    public void setTenHinh(String tenHinh) {
        this.tenHinh = tenHinh;
    }

    public int getSocanh() {
        return socanh;
    }

    public void setSocanh(int socanh) {
        this.socanh = socanh;
    }
}
