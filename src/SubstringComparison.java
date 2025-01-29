
import java.util.Scanner;

public class SubstringComparison {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int length = s.length();

        String[] array = new String[length-k+1];
        int i = 0;
        while(i < length-k){
            array[i] = s.substring(i, i+k);
            i++;
        }
        array[i] = s.substring(i, i+k);

        smallest = array[0];
        largest = array[0];
        for(i = 1; i < array.length; i++){
            if(array[i].compareTo(smallest) <= 0){
                smallest = array[i];
            }
            if(array[i].compareTo(largest) >= 0){
                largest = array[i];
            }
        }


        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}