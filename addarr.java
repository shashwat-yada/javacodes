//import java.util.Scanner;

class addarr{
    public static void main(String[] args) {
        int arr1[]={2,3,45,5,6};
        int arr2[]={65,45,67,34,67};
        int sum=0;
        int temp=0;

        for(int i=1;i<arr1.length;i=i+1){
            sum=sum+arr1[i];
        }
        System.out.println(sum);
        for (int i = 0; i <arr2.length; i=i+1) {
            temp=temp+arr2[i];
        }
        System.out.println(temp);

        int sec=sum+temp;
        System.out.println("add:"+sec);
    }
}