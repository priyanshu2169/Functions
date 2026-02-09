import java.util.*;
public class binaryToDecimal {
    public static void binToDec(int binNum){
        int myNum=binNum;
        int pow=0;
        int decNum=0;
        while(binNum>0){
            int LD=binNum%10;
            decNum=decNum+(LD*(int)Math.pow(2, pow));
            pow++;
            binNum=binNum/10;
        }
        System.out.println("the decimal of "+myNum+" is "+ decNum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter binNum :");
        int binNum=sc.nextInt();
        binToDec(binNum);
        sc.close();

    }
    
}
