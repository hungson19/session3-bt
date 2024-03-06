import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Khai báo và khởi tạo mảng số nguyên gồm N phần tử
        int[] arr = new int[10]; // Mảng gồm 10 phần tử, các phần tử mặc định là 0

        // Hiển thị mảng ban đầu
        System.out.print("Dòng value: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Bước 2: Nhập giá trị cần chèn từ bàn phím
        System.out.print("Nhập giá trị cần chèn: ");
        int X = scanner.nextInt();

        // Bước 3: Nhập vị trí index cần chèn X vào mảng
        System.out.print("Nhập vị trí index cần chèn X vào mảng: ");
        int index = scanner.nextInt();

        // Bước 4: Kiểm tra vị trí index hợp lệ
        if (index < 0 || index >= arr.length) {
            System.out.println("Không thể chèn phần tử vào mảng.");
            return;
        }

        // Bước 5: Chèn phần tử X vào mảng
        // Đẩy các phần tử sau index xuống phía sau để tạo chỗ trống cho X
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = X;

        // Bước 6: In ra mảng sau khi chèn
        System.out.print("new value: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

