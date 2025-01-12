import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class HourGlass {
    public static int printHourGlass(int row, int col, int[][] twoDArray) {
        int sum = 0;
        int firstRow = row;
        int firstCol = col;

        for(int i = row; i <= row + 2; i++)
        {
            for(int j = col; j <= col + 2; j++) {
                if(i == firstRow || i == firstRow + 2) {
                    sum += twoDArray[i][j];
                }
                else if( i == firstRow + 1 && j == firstCol + 1){
                    sum += twoDArray[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
//        int[][] twoDArray = {
//                {1, 1, 1, 0, 0, 0},
//                {0, 1, 0, 0, 0, 0},
//                {1, 1, 1, 0, 0, 0},
//                {0, 0, 2, 4, 4, 0},
//                {0, 0, 0, 2, 0, 0},
//                {0, 0, 1, 2, 4, 0}
//        };
        Scanner in = new Scanner(System.in);
        int[][] twoDArray = new int[6][6];
        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < 6; j++) {
                twoDArray[i][j] = in.nextInt();
            }
        }

        ArrayList<Integer> sumList = new ArrayList<Integer>();


        for (int i = 0; i <= 3; i++) {
            for(int j = 0; j <= 3; j++){
                sumList.add(printHourGlass(i, j, twoDArray));
            }
        }
        int maxSum = Collections.max(sumList);
        System.out.println(maxSum);

    }
}
