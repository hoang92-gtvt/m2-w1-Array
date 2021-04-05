

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

//        int[] arrOut =  inputArr();
//        System.out.println(arrOut[0]);
//        int[] arrRevert = revertArr(arrOut);
//        System.out.println(arrRevert[0]);
//        System.out.print(arrRevert[0] + "\t");

          int[] arr3 = {1,2,3,5,4};
//          int k= getMax2(arr3);
//            System.out.println(k);
//            int[]arr4=deleElement(arr3,1);
//            System.out.println(arr4[1]);
              int[]arr5=addElement(arr3,2,8);
              System.out.println(arr5[2]);

            int[]arr6=concatArray(arr3,arr3);
            System.out.println(arr6[8]);
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

    public static String[] inputArr1(int _length){
        Scanner input2=new Scanner(System.in);
        String [] arr2 = new String [_length];
        for (int i = 0; i <_length ; i++) {
            arr2[i]=input2.nextLine();
        }

        return arr2;
    }

    public static int getValue(String [] arr){
        Scanner input=new Scanner(System.in);
        System.out.println("Nhập chuỗi cần tìm kiếm");
        String value=input.nextLine();
        int i=0;
        for(String element:arr){
            if(element==value) {
                System.out.println("Có tìm thấy chuỗi trong mảng "+ i);
                return i;
            }
            i++;
        }
        return i;
    }
    public static int getMax(int [] arr){
        int index=0;
        int max= arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]>max){
                max= arr[i];
                index=i;
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng là " + max + "tại vị trí thứ "+ index);
        return max;
//      return index;

    }
    public static int getMin(int[] arr){
        int index=0;
        int min=arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i]<min){
                min =arr[i];
                index = i;
            }

        }
        System.out.println("Giá trị nhỏ nhất trong mảng là "+ min + " tại vị trí " + index);
        return min;
//        return index;
    }
    public static int getMax2(int[] arr){
        int index1 =0;
        int index2 =1;
        int max1=arr[0];
        int max2=arr[1];
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]>max1){
                max2 = max1;
                max1= arr[i];
                index2=index1;
                index1=i;

            }else {
                if (arr[i]>max2){
                    max2= arr[i];
                    index2=i;
                }
            }
        }
        System.out.println("giá trị lớn thứ 2 trong dãy là" + max2 + "tại vị trí " + index2);
        return max2;
    }

    public static int[] deleElement(int[] arr,int index){
        int[] arr2 =new int [arr.length-1];
        for (int i = 0; i <index ; i++) {
            arr2[i]=arr[i];
        }

        for (int i = index; i <arr.length-1 ; i++) {
            arr2[i]=arr[i-1];
        }
        return arr2;

    }
    public static int[] addElement(int[]arr, int index, int value){
        int[] arrnew=new int[arr.length+1];
        if (index<0 && index>=arr.length){
            return arr;

        }else{
            for (int i = 0; i < index; i++) {
                arrnew[i] = arr[i];
            };

            arrnew[index] = value;

            for (int i = index + 1; i < arr.length + 1; i++) {
                arrnew[i] = arr[i-1];
            }
            return arrnew;
        }

    }
    public static int[] pushArray(int[]arr, int value){
        int[] arrnew=new int[arr.length+1];

        for (int i = 0; i < arr.length; i++) {
            arrnew[i] = arr[i];
        };

        arrnew[arr.length] = value;

        return arrnew;


    }
    public static int[] popArray(int[]arr){
        int[] arrnew=new int[arr.length-1];

        for (int i = 0; i < arr.length-1; i++) {
            arrnew[i] = arr[i];
        };
        return arrnew;
   }
    public static int[] concatArray(int[]arr,int[]arr2 ){
        int[] arrnew=new int[arr.length+arr2.length];
        System.out.println(arrnew.length);
        for (int i = 0; i < arr.length; i++) {
            arrnew[i] = arr[i];
        }
        for (int j = 0; j < arr2.length; j++) {
            arrnew[arr.length+j] = arr2[j];
        }

        return arrnew;
    }











}
