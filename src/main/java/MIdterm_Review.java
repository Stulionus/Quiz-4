import org.junit.Test;

import static org.junit.Assert.*;

public class MIdterm_Review {


    // Test if array is asymmetrical

    public static void main(String[] args) {

    }


    @Test
    public void Test(){
        int inputs[][] = {
                {},
                {3},
                {2, 2},
                {1, 2, 3, 2, 1},
                {8, 2, 3, 3, 2, 8},
                {2, 3},
                {1, 2, 3, 4},
                {1, 2, 3, 3, 1}
        };

        boolean expects[] = {
                true,
                false,
                false,
                false,
                false,
                true,
                true,
                true
        };

        for (int i = 0; i < inputs.length; i++) {
            assertEquals(expects[i],isAsymetrical(inputs[i]));
        }

    }
    public static boolean isAsymetrical(int[] data) {
        if (data.length == 0){return true;}

        for(int i = 0; i < data.length;i++){
            if (data[i] != data[data.length-(i+1)]){
                return true;
            }
        }
        return false;
    }
}
