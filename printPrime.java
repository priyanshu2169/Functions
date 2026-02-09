import java.util.*;

public class printPrime {
    public static boolean checkPrime(int n){
        
        if(n < 2){
           System.out.println("1 is not a prime or not a composite");
           return false;
        }
        if(n==2){
            return true;
        }
        for(int i=2;i<=(n-1);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
        
    }
    public static void printP(int n){
        for(int i=2;i<=n;i++){
            if(checkPrime(i)){
                System.out.print(i+" ");
            }
            
        }
       
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number");
        int n=sc.nextInt();
        printP(n);
        sc.close();
    }
}
