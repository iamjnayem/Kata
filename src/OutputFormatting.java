import java.util.Scanner;

public class OutputFormatting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for(int i = 0; i < 3; i++){
            String input = sc.nextLine();
            String[] inputArray = input.split(" ");
            String firstWord = inputArray[0];
            int secondNumber = Integer.parseInt(inputArray[1]);
            System.out.println(String.format("%-15s", firstWord) + String.format("%03d",secondNumber));
        }
        System.out.println("================================");
    }
}
