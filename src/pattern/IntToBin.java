package pattern;

public class IntToBin {

    public static String betterVersion(int n){
        StringBuilder result = new StringBuilder();
        if(n == 0){
            result.append(n);
            return result.toString();
        }

        while(n !=0){
            result.append(n%2);
            n /= 2;
        }
        return result.reverse().toString();
    }
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int n = 999999999;
        String binaryNumber = "";
        int r;
        while(n !=0){
            r = n % 2 ;
            binaryNumber += String.valueOf(r);
            n = n / 2;
        }
        System.out.println(new StringBuilder(binaryNumber).reverse().toString());
        long endTime = System.nanoTime();

        long elapsedTime = endTime - startTime;
        System.out.println("Execution time in milliseconds: " + elapsedTime / 1_000_000.0);

        startTime = System.nanoTime();
        n = 999999999;
        System.out.println(betterVersion(n));
        endTime=System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("Execution time in milliseconds: " + elapsedTime / 1_000_000.0);
    }
}
