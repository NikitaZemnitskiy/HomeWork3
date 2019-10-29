import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest {



    @Test
    void ContainerWithMostWaterTest1() {
        int expected = 49;
        int actual = ContainerWithMostWater.maxArea(new int[] {1,8,6,2,5,4,8,3,7});
        assertEquals(expected, actual);
    }

    @Test
    void ContainerWithMostWaterTest2() {
        int expected = 1;
        int actual = ContainerWithMostWater.maxArea(new int[] {10,1});
        assertEquals(expected, actual);
    }

    @Test
    void ContainerWithMostWaterTest3() {
        int expected = 30;
        int actual = ContainerWithMostWater.maxArea(new int[] {100,1,15});
        assertEquals(expected, actual);
    }

    @Test
    void ContainerWithMostWaterTest4() {
        int expected = 300;
        int actual = ContainerWithMostWater.maxArea(new int[] {1,15,34,58,100,225,225,100,58,34,15,1});
        assertEquals(expected, actual);
    }

}