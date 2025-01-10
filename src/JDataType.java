import java.awt.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class JDataType {
    public static ArrayList<String> getDataTypes(long n){
        ArrayList<String> myResultList = new ArrayList<String>();
        if(n <= Byte.MAX_VALUE && n >= Byte.MIN_VALUE){
            myResultList.add("byte");
        }
        if(n <= Short.MAX_VALUE && n >= Short.MIN_VALUE){
            myResultList.add("short");
        }
        if(n <= Integer.MAX_VALUE && n >= Integer.MIN_VALUE){
            myResultList.add("int");
        }
        if(n <= Long.MAX_VALUE && n>= Long.MIN_VALUE){
            myResultList.add("long");
        }
        return myResultList;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < N; i++){
            String item="";
            try{
                item = sc.nextLine();
                long number = Long.parseLong(item);
                ArrayList<String> resultList = getDataTypes(number);
                System.out.println(String.format("%d can be fitted in:", number));
                for(int j = 0 ; j < resultList.size(); j++){
                    System.out.println("* " + resultList.get(j));
                }

            }catch(NumberFormatException e){
                System.out.println(String.format("%s can't be fitted anywhere.", item));
            }
        }
    }
}
