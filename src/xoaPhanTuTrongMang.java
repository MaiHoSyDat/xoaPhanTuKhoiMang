import java.util.Arrays;
import java.util.Scanner;

public class xoaPhanTuTrongMang {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 6, 9, 4};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập phần tử muốn xóa: ");
        int a = scanner.nextInt();
        int index = -1;
        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                index = i;
                check = true;
                break;
            }
        }
       if (check){
           System.out.println("Mảng ban đầu : " + Arrays.toString(arr));
           for (int i = index; i < arr.length - 1; i++) {
               arr[i] = arr[i + 1];
               index++;
           }
           arr[arr.length - 1] = 0;
           System.out.println("Mảng sau khi đã xóa phần tử " + a + ":" + Arrays.toString(arr));
       }else {
           System.out.println("Trong mảng không tìm thấy phần tử "+ a);
       }
    }
}
