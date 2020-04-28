package primenumber;
import java.lang.*;
import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        int num,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to be checked");
        num=sc.nextInt();
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
                count+=1;
        }
        if(count==0)
            System.out.println("The entered number is a prime number");
        else
            System.out.println("The entered number is not a prime number");
    }   
}
