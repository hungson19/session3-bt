import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Tạo 2 mảng số với kích thước cho trước và nhập giá trị cho các phần tử
        System.out.print("Nhập kích thước của mảng 1: ");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Nhập các phần tử của mảng 1:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }

        System.out.print("Nhập kích thước của mảng 2: ");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Nhập các phần tử của mảng 2:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }

        // Bước 3: Tạo mảng thứ 3 có kích thước bằng kích thước mảng 1 + kích thước mảng 2
        int[] arr3 = new int[n1 + n2];

        // Bước 4: Gán các phần tử của mảng 1 vào mảng thứ 3
        for (int i = 0; i < n1; i++) {
            arr3[i] = arr1[i];
        }

        // Bước 5: Gán các phần tử của mảng 2 vào mảng thứ 3
        for (int i = 0; i < n2; i++) {
            arr3[n1 + i] = arr2[i];
        }

        // Hiển thị mảng thứ 3 sau khi gộp
        System.out.println("Mảng thứ 3 sau khi gộp:");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}




