import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }
}




//import java.util.Scanner;
//
//public class Bai4 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Bước 1: Tìm phần tử lớn nhất của ma trận có sẵn
//        // Khởi tạo ma trận
//        double[][] matrix = {
//                {1.5, 2.3, 4.0},
//                {0.5, 3.2, 1.7},
//                {2.8, 2.5, 3.9}
//        };
//
//        // Khởi tạo biến để lưu giá trị lớn nhất và tọa độ của nó
//        double maxElement = matrix[0][0];
//        int row = 0;
//        int column = 0;
//
//        // Duyệt qua ma trận để tìm giá trị lớn nhất và tọa độ của nó
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if (matrix[i][j] > maxElement) {
//                    maxElement = matrix[i][j];
//                    row = i;
//                    column = j;
//                }
//            }
//        }
//
//        // Hiển thị kết quả
//        System.out.println("Phần tử lớn nhất của ma trận có giá trị " + maxElement + " và có tọa độ là (" + row + ", " + column + ").");
//
//        // Bước 2: Thu thập đầu vào từ nhập liệu của người dùng và hoàn thành yêu cầu
//        System.out.print("Nhập số hàng của ma trận: ");
//        int numRows = scanner.nextInt();
//        System.out.print("Nhập số cột của ma trận: ");
//        int numColumns = scanner.nextInt();
//
//        // Khởi tạo ma trận mới từ dữ liệu nhập từ người dùng
//        double[][] userMatrix = new double[numRows][numColumns];
//
//        // Nhập giá trị cho ma trận từ người dùng
//        System.out.println("Nhập giá trị cho ma trận:");
//        for (int i = 0; i < numRows; i++) {
//            for (int j = 0; j < numColumns; j++) {
//                System.out.print("Nhập giá trị tại hàng " + (i + 1) + ", cột " + (j + 1) + ": ");
//                userMatrix[i][j] = scanner.nextDouble();
//            }
//        }
//
//        // Tìm phần tử lớn nhất trong ma trận nhập từ người dùng
//        double maxUserElement = userMatrix[0][0];
//        int userRow = 0;
//        int userColumn = 0;
//
//        // Duyệt qua ma trận để tìm giá trị lớn nhất và tọa độ của nó
//        for (int i = 0; i < userMatrix.length; i++) {
//            for (int j = 0; j < userMatrix[i].length; j++) {
//                if (userMatrix[i][j] > maxUserElement) {
//                    maxUserElement = userMatrix[i][j];
//                    userRow = i;
//                    userColumn = j;
//                }
//            }
//        }
//
//        // Hiển thị kết quả
//        System.out.println("Phần tử lớn nhất của ma trận bạn nhập có giá trị " + maxUserElement + " và có tọa độ là (" + userRow + ", " + userColumn + ").");
//
//        scanner.close();
//    }
//}
