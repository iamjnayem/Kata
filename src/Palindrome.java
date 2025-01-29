import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String B = new StringBuilder(A).reverse().toString();

        if(B.equals(A)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
