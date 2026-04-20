//import java.util.Scanner;
class mularr{
    public static void main(String[] args) {
        int arr1[]={2,3,4,5,6,7};
        int arr2[]={23,23,45,565,7,8};
        int arr3[]=new int[arr1.length+arr2.length];

        //int sum=1;
        //int temp=1;
        
        int size=Math.min(arr1.length,arr2.length);
        for(int i=0;i<size;i++){

            arr3[i]=arr1[i]*arr2[i];
        }
        System.out.println("output");

        for(int i=0;i<size;i++){

            System.out.println(arr3[i]+"");
        }
        

       


    }
}