import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhận đầu vào từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập bán kính đường tròn
        System.out.print("Nhập bán kính của đường tròn: ");
        double radius = scanner.nextDouble();

        // Định nghĩa hằng số pi
        final double PI = Math.PI;

        // Tính chu vi của đường tròn
        double circumference = 2 * PI * radius;

        // Tính diện tích của đường tròn
        double area = PI * radius * radius;

        // Hiển thị kết quả
        System.out.printf("Chu vi của đường tròn là: %.2f%n", circumference);
        System.out.printf("Diện tích của đường tròn là: %.2f%n", area);

        // Đóng đối tượng Scanner
        scanner.close();
    }
}
