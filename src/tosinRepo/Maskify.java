package tosinRepo;

import java.util.Arrays;

public class Maskify {
    public static String maskify( String cc ) {
        if(cc.length() < 4 )return cc;
        else return "#".repeat(cc.length()-4)+cc.substring(cc.length()-4);
    }

    public static int[][] multi(int x, int y){
        int[][] numbers = new int[x][y];
        int data = 1;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                data++;
                numbers[i][j] = data;

            }

        }
        return numbers;
    }

    public static void main(String[] args) {
      var d =  Arrays.deepToString(multi(2,3));
        System.out.println(d);
        System.out.println( maskify("1234567890"));
    }
}
