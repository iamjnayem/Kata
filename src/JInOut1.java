import java.util.Scanner;

public class JInOut1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputs = new int[3];
        for(int i = 0; i < 3; i++){
            inputs[i] = sc.nextInt();
        }

        for(int i = 0; i < 3; i++){
            System.out.println(inputs[i]);
        }
    }
}
