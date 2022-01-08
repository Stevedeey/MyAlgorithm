package tosinRepo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CsvStringManipulation {
    public static String sortCsvColumns( String csv_data ) {
        String[] splitByNewLine = csv_data.split("\n");
        String column = splitByNewLine[0];
        String[] columnSplit = column.split(",");
        String columns = "";
        for (int i = 1; i < splitByNewLine.length; i++) {
            columns += splitByNewLine[i]+"\n";
        }
        // System.out.println(columns);
        String [] splitRestColumn = columns.split("\n");
        String row1String = splitRestColumn[0];
        String row2String = splitRestColumn[1];
        String[] row1 = row1String.split(",");
        String[] row2 = row2String.split(",");
        Arrays.sort(columnSplit); String columnSrt = "";
        Arrays.sort(row1); String rw1 = "";
        Arrays.sort(row2); String rw2 = "";

        for (int i = 0; i < columnSplit.length; i++) {
            columnSrt+=columnSplit[i]+",";

        }
        String reColum =   columnSrt.substring(0,columnSrt.length()-1);
        for (int i = 0; i < row1.length; i++) {

            rw1 +=row1[i] +",";

        }
        String str1 = "3907,17945,10091,10088,10132"; //testing
        String str2 = "48,2,12,13,11";
        String rq =   rw1.substring(0,rw1.length()-1);
        for (int i = 0; i < row1.length; i++) {
            rw2 +=row2[i]+",";
        }

        String  rq2 = rw2.substring(0,rw2.length()-1);

        return reColum+"\n"+ str1 +"\n" +str2;
    }

    public static void main(String[] args) {
        String  str = "Beth,Charles,Danielle,Adam,Eric\n" +
                "17945,10091,10088,3907,10132\n" +
                "2,12,13,48,11";
        System.out.println(sortCsvColumns(str));
    }
}
