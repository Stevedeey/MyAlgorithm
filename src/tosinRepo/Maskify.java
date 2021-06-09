package tosinRepo;

public class Maskify {
    public static String maskify( String cc ) {
        if(cc.length() < 4 )return cc;
        else return "#".repeat(cc.length()-4)+cc.substring(cc.length()-4);
    }
}
