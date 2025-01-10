import java.util.Scanner;

public class Jsib {
    //Problem name is Java Static Initializer Block

    public static void main(String[] args) {
        int b,h;
        Scanner sc = new Scanner(System.in);
        b = sc.nextInt();
        h = sc.nextInt();
        if( b <= 0 || h <= 0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            return;
        }
        System.out.println(b*h);
        sc.close();
    }
}
