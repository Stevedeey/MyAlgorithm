package tosinRepo;

import java.lang.reflect.GenericDeclaration;
import java.security.spec.PSSParameterSpec;

public class DNA {
    public static String dnaComplement(String dna) {
        String result = "";
        String[] arr = dna.split("");

        for (int i = 0; i < arr.length; i++) {

            switch (arr[i].toString()) {
                case "A":
                    result += "T";
                    break;
                case "C":
                    result += "G";
                    break;
                case "T":
                    result += "A";
                    break;
                case "G":
                    result += "C";
                    break;
                default:
                    result = "";
                    break;
            }

        }


        return result;

    }

    public  static  String doDNA(String str){

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'A'){
                builder.append("T");
            }else  if(str.charAt(i) == 'C'){
                builder.append("G");
            }
            else if(str.charAt(i) == 'T'){
                builder.append("A");
            }
            else if(str.charAt(i) == 'G'){
                builder.append("C");
            }
        }
        return builder.toString();
    }


    public static void main(String[] args) {
        System.out.println(dnaComplement("ACTG"));
        System.out.println("::String Builder::::"+doDNA("ACTG"));
    }
}
