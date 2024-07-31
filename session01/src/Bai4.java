import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhận đầu vào từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập điểm Toán
        System.out.print("Nhập điểm Toán: ");
        double toan = scanner.nextDouble();

        // Nhập điểm Văn
        System.out.print("Nhập điểm Văn: ");
        double van = scanner.nextDouble();

        // Nhập điểm Anh
        System.out.print("Nhập điểm Anh: ");
        double anh = scanner.nextDouble();

        // Tính trung bình cộng của ba điểm
        double average = (toan + van + anh) / 3;

        // Hiển thị kết quả
        System.out.printf("Điểm trung bình cộng của ba môn học là: %.2f%n", average);

        // Đóng đối tượng Scanner
        scanner.close();
    }
}

