package three;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;


public class SquareTrinomialTest {
    @Test
    void twoRoots(){
        double[] expected = {2, 1};
        double[] actual = new SquareTrinomial(1, -3, 2).solution();
        assertArrayEquals(expected, actual, 0.01);
    }

    @Test
    void oneRootAndAnother(){
        double[] expected = {1, 1};
        double[] actual = new SquareTrinomial(1, -2, 1).solution();
        assertArrayEquals(expected, actual, 0.01);
    }

    @Test
    void noRationalRoots() {
        assertThrows(IllegalArgumentException.class, ()->{new SquareTrinomial(2, 3, 4).solution();});
    }

    @Test
    void notTrinomial(){
        assertThrows(IllegalArgumentException.class, ()->{new SquareTrinomial(0, 3, 4).solution();});
    }
}
