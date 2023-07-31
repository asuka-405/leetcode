import java.util.Arrays;

public class SetMatrixZeroes {
    public static void setZeroes(int[][] m) {
        int rc = m.length;
        int cc = m[0].length;
        int zr = 1;

        for(int r = 0; r<rc; r++){
            for(int c = 0; c<cc; c++){
                if(m[r][c] == 0){
                    m[0][c] = 0;
                    if(r > 0)
                        m[r][0] = 0;
                    else zr = 0;
                }
            }
        }

        for(int r = 1; r<rc; r++){
            for(int c = 1; c<cc; c++)
                if(m[r][0] == 0 || m[0][c] == 0) m[r][c] = 0;
        }

        if(m[0][0] == 0)
            for(int r = 1; r < rc; r++)
                m[r][0] = 0;
        if(zr == 0)
            for(int c = 0; c < cc; c++)
                m[0][c] = 0;

        System.out.println(Arrays.deepToString(m));
    }

}
