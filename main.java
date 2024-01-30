import java.io.IOException;
public class main {
    public static void main(String[] args) throws IOException{
        int[][] fallafel = new int[5][];
        fallafel[0] = new int[1];
        fallafel[1] = new int[2];
        fallafel[2] = new int[3];
        fallafel[3] = new int[4];
        fallafel[4] = new int[5];
        int l = 76;
        int k = 7;
        for(int i = 0; i < fallafel.length; ++i){
            for(int j = 0; j < fallafel[i].length; ++j, l += 16, k += l){
                fallafel[i][j] = k;
                System.out.print(fallafel[i][j]);
            }
            System.out.println();
        }
    }
}
