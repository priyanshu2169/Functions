import java.util.*;
public class palindrome{
    public static boolean isPalindrome(int rev,int m){
        if(rev==m){
            return true;
        }else{
            return false;
        }
    }
    public static void reverseNum(int n){
        int m=n;
        int rev=0;
        while(n!=0){
            int last_digit=n%10;
            rev=(rev*10)+last_digit;
            n=n/10;
        }
        System.out.println(isPalindrome(rev,m));
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        reverseNum(n);
        sc.close();
    }
}