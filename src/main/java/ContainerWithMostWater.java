import java.util.ArrayList;
import java.util.HashMap;

public class ContainerWithMostWater {

    public static int maxArea(int[] height) {
        int maxWater = 0;
        for (int i = 0; i<height.length-1; i++){
            for(int k = i+1; k<height.length; k++){
                int minHeight = height[i]>height[k]?height[k]:height[i];
                int length = k-i;
                int Water = minHeight*length;
                maxWater = maxWater>Water?maxWater:Water;
            }
        }
        return maxWater;
    }
}
