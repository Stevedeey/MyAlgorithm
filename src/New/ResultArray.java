package New;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ResultArray {
    public static void main(String[] args) {


        List<List<Integer>> listList = new ArrayList<>();
        listList.add(new ArrayList<>(List.of(-9, -9, -9, 1, 1, 1)));
        listList.add(new ArrayList<>(List.of(0, -9, 0, 4, 3, 2)));
        listList.add(new ArrayList<>(List.of(-9, -9, -9, 1, 2, 3)));
        listList.add(new ArrayList<>(List.of(0, 0, 8, 6, 6, 0)));
        listList.add(new ArrayList<>(List.of(0, 0, 0, -2, 0, 0)));
        listList.add(new ArrayList<>(List.of(0, 0, 1, 2, 4, 0)));

       System.out.println(hourglassSum2(listList));


    }



    public static int hourglassSum2(List<List<Integer>> arr) {
        List<Integer> list = new ArrayList<>();
        List<Integer> temp;
        int sum = 0;
        for (int i = 0; i < 4; i++) {

//            arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2]

            for (int j = 0; j < 4; j++) {
                sum = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2) + arr.get(i + 1).get(j + 1)
                        + arr.get(i + 2).get(j) + arr.get(i + 2).get(j+2);
                list.add(sum);
            }

        }

        Collections.sort(list);
        System.out.println(list);
        return list.get(list.size() - 1);
    }




    public static int hourglassSum(List<List<Integer>> arr) {
        int sum00 = 0; int sum01 = 0; int sum02 = 0; int sum03 = 0;
        int sum10 = 0; int sum11 = 0; int sum12 = 0; int sum23 = 0;
        int sum30 = 0; int sum31 = 0; int sum32 = 0; int sum33 = 0;

        int s = 0; int s2 = 0; int s3 = 0; int s4 = 0;
        List<Integer> temp;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 4; i++) {

            temp = arr.get(i);
            for (int j = 0; j < 4; j++) {

                if (i==0)
                {
                    if (j==0){
                        sum00 = sum00 + temp.get(j)
                                +temp.get(j+1)
                                +temp.get(j+2)
                                +arr.get(i+1).get(j+1) //row 2 ends
                                +arr.get(i+2).get(j)
                                +arr.get(i+2).get(j+1)
                                +arr.get(i+2).get(j+2);
                        list.add(sum00);

                    }
                    if (j==1){
                        sum01 = sum01 + temp.get(j)
                                +temp.get(j+1)
                                +temp.get(j+2)
                                +arr.get(i+1).get(j+1)
                                +arr.get(i+2).get(j)
                                +arr.get(i+2).get(j+1)
                                +arr.get(i+2).get(j+2);
                        list.add(sum01);
                    }
                    if (j==2){
                        sum02 = sum02 + temp.get(j)
                                +temp.get(j+1)
                                +temp.get(j+2)
                                +arr.get(i+1).get(j+1)
                                +arr.get(i+2).get(j)
                                + +arr.get(i+2).get(j+1)
                                + +arr.get(i+2).get(j+2);
                        list.add(sum02);

                    }
                    if (j==3){
                        sum03 = sum03 + temp.get(j)
                                +temp.get(j+1)
                                +temp.get(j+2)
                                +arr.get(i+1).get(j+1)
                                +arr.get(i+2).get(j)
                                + +arr.get(i+2).get(j+1)
                                + +arr.get(i+2).get(j+2);
                        list.add(sum03);
                    }

                }
                if (i==1){
                    if (j==0){
                        sum10 = sum10 + temp.get(j)
                                +temp.get(j+1)
                                +temp.get(j+2)
                                +arr.get(i+1).get(j+1) // check this next
                                +arr.get(i+2).get(j)
                                +arr.get(i+2).get(j+1)
                                +arr.get(i+2).get(j+2);
                        list.add(sum10);
                    }

                    if (j==1){
                        sum11 = sum11 + temp.get(j)
                                +temp.get(j+1)
                                +temp.get(j+2)
                                +arr.get(i+1).get(j+1)
                                +arr.get(i+2).get(j)
                                +arr.get(i+2).get(j+1)
                                +arr.get(i+2).get(j+2);
                        list.add(sum11);
                    }

                    if (j==2){
                        sum12 = sum12 + temp.get(j)
                                +temp.get(j+1)
                                +temp.get(j+2)
                                +arr.get(i+1).get(j+1)
                                +arr.get(i+2).get(j)
                                +arr.get(i+2).get(j+1)
                                +arr.get(i+2).get(j+2);
                        list.add(sum12);
                    }

                    if (j==3){
                        sum23 = sum23 + temp.get(j)
                                +temp.get(j+1)
                                +temp.get(j+2)
                                +arr.get(i+1).get(j+1)
                                +arr.get(i+2).get(j)
                                +arr.get(i+2).get(j+1)
                                +arr.get(i+2).get(j+2);
                        list.add(sum23);
                    }

                }
                if (i==2){
                    if (j==0){
                        sum30 = sum30 + temp.get(j)
                                +temp.get(j+1)
                                +temp.get(j+2)
                                +arr.get(i+1).get(j+1)
                                +arr.get(i+2).get(j)
                                +arr.get(i+2).get(j+1)
                                +arr.get(i+2).get(j+2);
                        list.add(sum30);
                    }

                    if (j==1){
                        sum31 = sum31 + temp.get(j)
                                +temp.get(j+1)
                                +temp.get(j+2)
                                +arr.get(i+1).get(j+1)
                                +arr.get(i+2).get(j)
                                +arr.get(i+2).get(j+1)
                                +arr.get(i+2).get(j+2);
                        list.add(sum31);
                    }

                    if (j==2){
                        sum32 = sum32 + temp.get(j)
                                +temp.get(j+1)
                                +temp.get(j+2)
                                +arr.get(i+1).get(j+1)
                                +arr.get(i+2).get(j)
                                +arr.get(i+2).get(j+1)
                                +arr.get(i+2).get(j+2);
                        list.add(sum32);
                    }

                    if (j==3){
                        sum33 = sum33 + temp.get(j)
                                +temp.get(j+1)
                                +temp.get(j+2)
                                +arr.get(i+1).get(j+1)
                                +arr.get(i+2).get(j)
                                +arr.get(i+2).get(j+1)
                                +arr.get(i+2).get(j+2);
                        list.add(sum33);
                    }
                }
                if (i==3){
                    if (j==0){
                        s = s + temp.get(j)
                                +temp.get(j+1)
                                +temp.get(j+2)
                                +arr.get(i+1).get(j+1)
                                +arr.get(i+2).get(j)
                                +arr.get(i+2).get(j+1)
                                +arr.get(i+2).get(j+2);
                        list.add(s);
                    }

                    if (j==1){
                        s2 = s2 + temp.get(j)
                                +temp.get(j+1)
                                +temp.get(j+2)
                                +arr.get(i+1).get(j+1)
                                +arr.get(i+2).get(j)
                                +arr.get(i+2).get(j+1)
                                +arr.get(i+2).get(j+2);
                        list.add(s2);
                    }

                    if (j==2){
                        s3 = s3 + temp.get(j)
                                +temp.get(j+1)
                                +temp.get(j+2)
                                +arr.get(i+1).get(j+1)
                                +arr.get(i+2).get(j)
                                +arr.get(i+2).get(j+1)
                                +arr.get(i+2).get(j+2);
                        list.add(s3);
                    }

                    if (j==3){
                        s4 = s4 + temp.get(j)
                                +temp.get(j+1)
                                +temp.get(j+2)
                                +arr.get(i+1).get(j+1)
                                +arr.get(i+2).get(j)
                                +arr.get(i+2).get(j+1)
                                +arr.get(i+2).get(j+2);
                        list.add(s4);
                    }
                }

            }
        }

        Collections.sort(list);

        return list.get(list.size()-1);

    }

}
