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


    public static void main(String[] args) {
        System.out.println(dnaComplement("ACTG"));
    }
}

//System.out.println(arr[i]);
//        if(arr[i].equals("A")){
//        result += "T";
//        }else if(arr[i].equals("C")){
//        result += "G";
//        }else if(arr[i].equals("T")){
//        result += "A";
//        }else if(arr[i].equals("G")){
//        result += "C";
//        }