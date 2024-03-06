import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Khởi tạo mảng
        int[] arr = {2, 4, 6, 7, 9};
        int n = arr.length;

        // Hiển thị mảng ban đầu
        System.out.print("Dòng value: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Nhập giá trị cần xóa từ bàn phím
        System.out.print("Nhập giá trị cần xóa: ");
        int x = scanner.nextInt();

        // Tìm vị trí của phần tử cần xóa
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                index = i;
                break;
            }
        }

        // Nếu phần tử cần xóa không tồn tại trong mảng
        if (index == -1) {
            System.out.println("Không tìm thấy phần tử cần xóa trong mảng.");
            return;
        }

        // Xóa phần tử và ghi đè phần tử sau lên
        for (int i = index; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        n--;

        // Hiển thị mảng mới
        System.out.print("new value: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


