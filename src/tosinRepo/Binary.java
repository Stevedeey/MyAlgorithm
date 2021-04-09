package tosinRepo;
import java.util.List;
import java.util.Arrays;

public class Binary {
//    public static Integer arrayPacking( List<Integer> integers ) {
      //String [] numberArr = new String[4];
//       String M = "";
//       int toDecimal  =0;
//        for (int x:integers) {
//         String ss = Integer.toBinaryString(x);
//            M = M + ss;
//
//        // String s = x+"";
//            System.out.println(M);
//
//            toDecimal = Integer.parseInt(M,2);
//
//
//
//        }
//
//
//        return  toDecimal;
        public static Integer arrayPacking( List<Integer> integers ) {
            String g = "";
            double value = 0;
            for(int i = 0; i < integers.size(); i++){
                int num = integers.get(i);
                String convertToBin = Integer.toBinaryString(num);
                if(convertToBin.length() < 8){
                    int remainder = 8 - convertToBin.length();
                    String repeat = "0".repeat(remainder);
                    convertToBin = repeat+convertToBin;
                    g = convertToBin + g;
                }else if(convertToBin.length() > 8){
                    int remainder = 16 - convertToBin.length();
                    String repeat = "0".repeat(remainder);
                    convertToBin = repeat+convertToBin;
                    g = convertToBin + g;
                }else {
                    g = convertToBin + g;
                }
                System.out.println(convertToBin);
            }
            System.out.println(g);
            for(int j = 0; j < g.length(); j++){
                if(g.charAt(j) == '1'){
                    int diff = g.length() - (j+1);
                    value += Integer.parseInt(diff+"",2);
                }
            }
            int newValue = (int) value;
            return newValue;




    }

    public static void main(String[] args) {

        arrayPacking(List.of(24, 85, 0));
        System.out.println(Integer.toBinaryString(85));
    }
}
