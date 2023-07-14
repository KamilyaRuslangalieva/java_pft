package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {
    @Test
    public void testDistance () {
        double p1 = Math.pow((7 -3), 2);
        double p2 = Math.pow((4 - 1), 2);

        double distance = Math.sqrt(p1 + p2);

        Assert.assertEquals(distance, 5.0);
    }
    {
        double x1=3;
        double x2=7;
        double y1=1;
        double y2=4;
        double distance = Math.sqrt ((x2-x1)*(x2-x1)+ (y2-y1)*(y2-y1));
        Assert.assertEquals(distance, 5.0);
    }
}
