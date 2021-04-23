package HinhHoc;

public class TamGiac extends hinhhoc
{
    int a,b,c;

    public TamGiac() {
    }

    public TamGiac(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void tinhDienTich()
    {

    }
    public void tinhChuVi(){}
    @Override
    public void nhap() {

    }

    @Override
    public void xuat() {
        System.out.println("Tam giac");
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
