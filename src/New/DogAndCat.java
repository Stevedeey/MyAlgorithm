package New;

public class DogAndCat {
    public static void main(String[] args) {
        int arr[] = humanYearsCatYearsDogYears(10);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] humanYearsCatYearsDogYears1(final int hy) {

        int cy = 0;
        int dy = 0;

        if (hy >= 1) {
            cy += 15;
            dy += 15;
        }
        if (hy >= 2) {
            cy += 9;
            dy += 9;
        }

        for (int i = 2; i < hy; i++) {
            cy += 4;
            dy += 5;
        }
        int[] yy = new int[3];
        yy[0] = hy;
        yy[1] = cy;
        yy[2] = dy;
        return yy;
    }


    public static int[] humanYearsCatYearsDogYears(final int humanYears) {  //mine
        int[] arr = new int[3];
        int catYears = 0, dogYears = 0;
        int count = 0, count2 = 0;


        if (humanYears >= 1) {
            catYears += 15;
            dogYears += 15;

        }

        if (humanYears >= 2) {
            catYears += 9;
            dogYears += 9;
        }
        for (int i = humanYears - 2; i > 0; i--) { //first two years already catered for thus humansyears - 2
            catYears += 4;
            dogYears += 5;

        }
        return new int[]{humanYears, catYears, dogYears};
    }


    public static int[] humanYearsCatYearsDogYearsMine(final int humanYears) {

        int catYears = 0, dogYears = 0;
        int count = 0, count2 = 0;
        for (int i = humanYears; i > 0; i--) {

            if ((humanYears == 1 || humanYears == 2 || humanYears >= 3) && count == 0) {
                catYears += 15;
                dogYears += 15;
                count++;

            }

            if ((humanYears > 1 && humanYears >= 2) && count2 == 0) {
                catYears += 9;
                dogYears += 9;
                count2++;
            }

            if (humanYears >= 3) {
                catYears += 4;
                dogYears += 5;
                if (i == humanYears - 1 || i == humanYears) {
                    catYears -= 4;
                    dogYears -= 5;
                }
            }

        }
        return new int[]{humanYears, catYears, dogYears};
    }

}
