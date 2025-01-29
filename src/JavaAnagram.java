
import java.util.HashMap;
import java.util.Scanner;

public class JavaAnagram {

    static boolean isAnagram(String a, String b) {
        //procedures
        /**
         * 1.create frequency table for each one
         * 2.iterate anyone and check in another one
         * 3.if complete iteration passes then its anagram
         * 4.otherwise not
         */
        a = a.toLowerCase();
        b = b.toLowerCase();

        HashMap<Character, Integer> h1 = new HashMap<>();
        HashMap<Character, Integer> h2 = new HashMap<>();

        for(int i  = 0; i < a.length(); i++){
            char c = a.charAt(i);
            if(!h1.containsKey(c)){
                h1.put(c, 1);
            }else {
                int oldFrequency = h1.get(c);
                h1.put(c, ++oldFrequency);
            }
        }

        for(int i  = 0; i < b.length(); i++){
            char c = b.charAt(i);
            if(!h2.containsKey(c)){
                h2.put(c, 1);
            }else {
                int oldFrequency = h2.get(c);
                h2.put(c, ++oldFrequency);
            }
        }

        for(char c : h1.keySet()){
            if(h2.get(c) != h1.get(c)){
                return false;
            }
        }

        for(char c : h2.keySet()){
            if(h1.get(c) != h2.get(c)){
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        if(isAnagram(a,b)){
            System.out.println("Anagrams");
        }else{
            System.out.println("Not Anagrams");
        }
    }
}
