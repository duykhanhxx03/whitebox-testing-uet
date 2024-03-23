import java.util.Scanner;

public class HoaDon {
    /**
     * @param tuoi   Tuoi cua khach hang.
     * @param hoaDon So tien hoa don.
     * @return Phan tram giam gia, tra ve -1 neu tuoi<0 hoac hoaDon<0
     */
    public static double phanTramGiamGia(double tuoi, double hoaDon) {
        if (!isInteger(tuoi) || tuoi < 0 || tuoi > 120 || hoaDon < 0) {
            return -1; // Khong hop le
        }
        double giamGia = 0;
        if (tuoi < 7) {
            giamGia = 100; // Giam gia 100%
        } else if (hoaDon >= 5000000) {
            giamGia = 10; // Giam gia 10%
        } else if (hoaDon >= 1000000) {
            giamGia = 5; // Giam gia 5%
        }

        return giamGia;
    }

    public static boolean isInteger(double num) {
        return num % 1 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tuổi khách hàng: ");
        double x = scanner.nextDouble();

        System.out.print("Nhập hóa đơn phải trả: ");
        double y = scanner.nextDouble();

        double giamGia = phanTramGiamGia(x, y);

        System.out.println("Giảm giá số phần trăm là: " + giamGia);
    }
}
