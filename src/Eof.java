import java.util.Scanner;

public class Eof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long count = 1;

        while(sc.hasNext()){
            String input = sc.nextLine();
            System.out.println(count + " " + input);
            count++;
        }
        sc.close();
    }
}
