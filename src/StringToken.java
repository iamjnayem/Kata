import java.util.Scanner;

public class StringToken {

    static void getTokenLength(){

    }

    static String[] getTokens(String s){
        String delimeter = " !,?._'@+";

        char[] t1 = s.toCharArray();
        String[] s1 = new String[s.length()];
        int p = 0;
        boolean flag = false;

        for(int i =0 ; i< t1.length; i++){
            char currentChar = t1[i];
            if(delimeter.indexOf(currentChar) == -1){
                
                String token = s.substring(i);
                s1[p++] = token;
            }
            else continue;
        }

        return s1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String[] result = getTokens(s1);

        for(var item: result){
            System.out.println(item);
        }
    }
}
