

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] arrOut =  inputArr();
        System.out.println(arrOut[0]);
        int[] arrRevert = revertArr(arrOut);
        System.out.println(arrRevert[0]);
        System.out.print(arrRevert[0] + "\t");
    }

    public static int[] inputArr(){
    int length;
    int [] arr1;
    Scanner input = new Scanner(System.in);
    System.out.println("Nhập độ dài mảng");
    length =input.nextInt();

    arr1 = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.printf("%-20s%d","Nhập phần tử mảng",+ i);
            arr1[i]=input.nextInt();

        }
    return arr1;

    }
    public static int[] revertArr( int [] arr) {
        for (int i = 0; i <arr.length/2 ; i++) {
                int temp = arr[i];
                arr[i]=arr[arr.length-1-i];
                arr[arr.length-1-i]= temp;
        }
        return arr;
    }
}
