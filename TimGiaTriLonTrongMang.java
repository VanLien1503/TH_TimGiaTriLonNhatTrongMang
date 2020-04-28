package TH_TimGiaTriLonNhatTrongMang;

import java.util.Random;
import java.util.Scanner;

public class TimGiaTriLonTrongMang {
    public static void main(String[] args) {
        // khai báo biến kiểm tra kích thước của mảng
        int size;
        int[] array;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println(" Enter a size");
            size=scanner.nextInt();
            if (size>10){
                System.out.println("size  Nhỏ Hơn 10");
            }
        }while (size>10);
        //nhập các giá trị cho phần tử
        array=new int [size];
        int i=0;
        Random rd = new Random();
        int max=array[0];
        for (i=0;i<array.length;i++){
            array[i]=rd.nextInt(100)+50;
            System.out.print(array[i]+"\t");
            if (array[i]>max){
                max=array[i];
            }
        }
        System.out.println("phần tử lớn Nhất LÀ: ");
        System.out.println(max);

    }
}
