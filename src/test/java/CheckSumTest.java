import org.junit.Assert;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CheckSumTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void chkPair() {
        CheckSum chs = new CheckSum();
        int[] A = new int[]{12, 36, 22, 63, 19};
        Assert.assertEquals(1, chs.chkPair(A, 31));
    }

    @Test
    void chkPair1() {
        CheckSum chs = new CheckSum();
        int[] A = new int[]{12, 36, 22, 19, 63};
        Assert.assertEquals(1, chs.chkPair(A, 31));
    }

    @Test
    void chkPair2() {
        CheckSum chs = new CheckSum();
        int[] A = new int[]{1,1,11,2,46,22};
        Assert.assertEquals(-1, chs.chkPair(A, 31));
    }
    @Test
    void chkPair3() {
        CheckSum chs = new CheckSum();
        int[] A = new int[]{12, 3, 4, 1, 6, 9};
        Assert.assertEquals(1, chs.chkPair(A, 24));
    }
}