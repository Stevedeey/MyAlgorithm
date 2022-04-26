import java.math.BigInteger;
import java.util.Stack;

public class AlgoChallenge {
     //"acc?7??sss?3rr1??????5"
    //"9???1???9??1???9"
    //"aa6?9"

   public static  String questionMarks(String str){
       StringBuilder sb = new StringBuilder();
       int count = 0;
       int questionNumber = str.indexOf("?");
       for(int i=0; i<str.length(); i++){
           if(str.charAt(i) == '?'){
               count++;
               sb.append(count);
           }else{
               count = 0;
           }
       }

       return sb.toString();
   }

    public static void main(String[] args) {

       // System.out.println(questionMarks("acc?7??sss?3rr1??????5"));
        System.out.println(questionMarks("9???1???9??1???9"));
       //System.out.println(questionMarks("aa6?9"));
    }





    }


