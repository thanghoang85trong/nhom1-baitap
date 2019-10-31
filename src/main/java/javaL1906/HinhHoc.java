package javaL1906;

public class HinhHoc {
    interface Hinh{
        double tinhChuVi();
        double tinhDienTich();
    }
    static class hinhVuong implements Hinh{
        private double canh;

        public hinhVuong(double cach) {
        }

        @Override
        public double tinhChuVi() {
            System.out.println(4*canh);
            return (4*canh);
        }

        @Override
        public double tinhDienTich() {
            return (canh*canh);
        }
    }

    public static void main(String[] args) {
        double cach = 5;
        new hinhVuong(cach).tinhChuVi();
    }

}
