package HinhHoc;

public class Main
{
    public static void main(String[] args) {
        HCN hcn = new HCN();
        hcn.socanh = 4;
        hcn.tenHinh = "HCN";
        System.out.println(hcn.getSocanh());
        hinhhoc hh = new TamGiac();
        hh.xuat();
    }
}
