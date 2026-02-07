
import java.util.*;

public class factorial {
    public static int Fact(int n){
        int fact=1;
        if(n==0){
            fact=1;
        }else if(n<0){
            System.out.println("factorial does not exit for negative number");
        }else{
            while(n>0){
                fact=fact*(n);
                n--;
            }
        }
        return fact;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=Fact(n);
        System.out.println(fact);
        sc.close();
    }
}
