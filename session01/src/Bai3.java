import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhận đầu vào từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Hiển thị yêu cầu người dùng nhập độ dài cạnh của hình vuông
        System.out.print("Nhập độ dài cạnh của hình vuông: ");
        double sideLength = scanner.nextDouble();

        // Tính toán chu vi và diện tích của hình vuông
        double perimeter = 4 * sideLength;
        double area = sideLength * sideLength;

        // Hiển thị kết quả
        System.out.printf("Chu vi hình vuông: %.2f%n", perimeter);
        System.out.printf("Diện tích hình vuông: %.2f%n", area);

        // Đóng đối tượng Scanner
        scanner.close();
    }
}

