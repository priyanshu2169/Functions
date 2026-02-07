
import java.util.*;

public class binomialCoeff {
     public static long Fact(int n){
        long fact=1;
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

public static long binomial_coff(int n,int r){


    if (n < r || r < 0) {
        return -1;
    }

    long n_fact = Fact(n);
    long r_fact = Fact(r);
    long nmr_fact = Fact(n - r);

    long b_c = n_fact / (r_fact * nmr_fact);
    return b_c;

}

    

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        long b_coff=binomial_coff(n,r);
        if(b_coff==-1){
            System.out.println("Not exist");
        }else{
        
        System.out.println("binomial cofficient is :"+b_coff);
        }
        
        sc.close();
    }
}
