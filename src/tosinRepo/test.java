package tosinRepo;
public class test {
    public static int[] withdraw(int amount) {
        int [] numArray= new int[3];
       int hundred = amount/100;
       numArray[0] = hundred;
     int  remainder1 = amount % 100;
        int fifty = remainder1 / 50;
        numArray[1] = fifty;
        int remainder2 = remainder1%50;
        if(remainder2/20==10)
        {
            int twenty =remainder2%20;
            numArray[1] = twenty;
        }


       return numArray;
    }

}
