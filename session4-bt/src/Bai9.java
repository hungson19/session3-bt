import java.util.Arrays;

public class Bai9 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        //Sắp xếp theo thứ tự từ lớn đến nhỏ
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++)
                if (arr[j] < arr[j + 1]) {
                    int a = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = a;
                }
        }
        System.out.println("Số lớn thứ 2 là "+arr[1]);
    }
}
