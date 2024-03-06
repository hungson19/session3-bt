import java.util.Arrays;
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap so luong phan tu cua mang: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Moi ban nhap cac phan tu ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhap phan tu thu "+(i+1)+ ":");
            arr[i] = scanner.nextInt();
        }

        System.out.println("Cac phan tu trong mang"+(Arrays.toString(arr)));
        //System.out.println(Arrays.toString(arr));
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Phan tu nho nhat cua mang la " +min);
    }

}

