import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhận đầu vào từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Tỉ giá USD/VNĐ (có thể thay đổi tuỳ theo tỉ giá hiện tại)
        final double EXCHANGE_RATE = 23000.0; // Ví dụ: 1 USD = 23,000 VNĐ

        // Hiển thị yêu cầu người dùng nhập giá trị tiền USD
        System.out.print("Enter amount in USD: ");
        double usd = scanner.nextDouble();

        // Tính toán giá trị tiền VNĐ
        double vnd = usd * EXCHANGE_RATE;

        // Hiển thị kết quả
        System.out.printf("%.2f USD = %.2f VND%n", usd, vnd);

        // Đóng đối tượng Scanner
        scanner.close();
    }
}

