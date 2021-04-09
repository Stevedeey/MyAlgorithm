package tosinRepo;

import java.util.ArrayList;

public class Bracket {
    public static boolean validBraces(String braces){
        ArrayList arrayList = new ArrayList();
        for(int i = 0; i < braces.length(); i++){
            if(braces.charAt(i) == '(' || braces.charAt(i) == '{' || braces.charAt(i) == '['){
                arrayList.add(braces.charAt(i));
            }else{
                if(arrayList.size() == 0) return false;
                String lastSym = arrayList.get(arrayList.size()-1).toString();
                if(braces.charAt(i) == ')'&& lastSym.equals("(") || braces.charAt(i) == ']'&& lastSym.equals("[")
                        || braces.charAt(i) == '}'&& lastSym.equals("{")){
                    arrayList.remove(arrayList.size()-1);
                }else{
                    break;
                }
            }
        }
        return arrayList.size() == 0;
    }
}
