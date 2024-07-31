import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhận đầu vào từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Hiển thị yêu cầu người dùng nhập tên
        System.out.print("Enter your name: ");

        // Đọc tên người dùng nhập vào
        String name = scanner.nextLine();

        // Hiển thị lời chào kèm theo tên của người dùng
        System.out.println("Hello: " + name);

        // Đóng đối tượng Scanner
        scanner.close();
    }
}
