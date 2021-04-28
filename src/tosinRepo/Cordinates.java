package tosinRepo;

public class Cordinates {
//    2	2	[[1,1],[1,2],[1,3],[2,1],[2,3],[3,1],[3,2],[3,3]]
//            -17	7	[[-18,6],[-18,7],[-18,8],[-17,6],[-17,8],[-16,6],[-16,7],[-16,8]]


    public static int[][] cartesianNeighbor(int x, int y){
        int [][] twoDimm = new int[8][2];
        for (int i = 0; i < twoDimm.length; i++) {
            for (int j = 0; j < twoDimm[i].length; j++) {
                twoDimm[i][j] = i-1;
            }

        }
            return  twoDimm;
    }

    public static void main(String[] args) {
        System.out.println(cartesianNeighbor(2,2));
    }}
