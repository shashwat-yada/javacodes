
import java.util.Scanner;


class factorial{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the value:");
        int num=sc.nextInt();
        
        if(num<0){
            System.out.println("invalid");
            
        }
        else{
            int fact=1;
            while(num!=0){
                fact=fact*num;
                
                num=num-1;
                


            }
            System.out.println("factorial:"+fact);
        }

        

    }
}

