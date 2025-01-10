import java.util.Scanner;

public class JLoop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < N; i++){
            String input = sc.nextLine();
            String[] inputs = input.split(" ");
            int[] integers = new int[3];
            for(int j = 0; j < 3; j++){
                integers[j] = Integer.parseInt(inputs[j]);
            }
            int a = integers[0];
            int b = integers[1];
            int n = integers[2];

            for(int k = 0; k < n; k++)
            {
                long sum = a;
                for(int l = 0; l <= k; l++){
                    sum += Math.pow(2, l) * b;
                }
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}
