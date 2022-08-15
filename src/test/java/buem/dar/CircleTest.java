package buem.dar;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class CircleTest {

    private static Circle circle;
    private static double area;
    private static double arcLength;
    private static double sectorArea;
    private static double chordLength;

    @BeforeClass
    public static void setCircleAreaArcLengthSectorAreaChordLength(){
        circle = new Circle(3, 0, 0);
        area = Math.PI * 3 * 3;
        arcLength = Math.PI * 3 * 30/180;
        sectorArea = arcLength * 3/2;
        chordLength = 2 * 3 * Math.sin((double) 30/2);
    }
    @Test
    public void testGetCircleAreaWhenRadiusIs3() {
        System.out.println("Inside testGetCircleArea()");
        assertEquals(area, circle.getCircleArea(), 0.1);
    }

    @Test
    public void testGetArcLengthWhenAngleIs30() {
        System.out.println("Inside testGetArcLength()");
        assertEquals(arcLength, circle.getArcLength(30), 0.1);
    }

    @Test
    public void testGetSectorAreaWhenAngleIs30(){
        System.out.println("Inside testGetSectorArea()");
        assertEquals(sectorArea, circle.getSectorArea(30), 0.1);
    }

    @Test
    public void testGetChordLengthWhenAngleIs30() {
        System.out.println("Inside testGetChordLength()");
        assertEquals(chordLength, circle.getChordLength(30), 0.1);
    }

    @Test
    public void testBelongToCircleWhenXIs2AndYIs2() {
        System.out.println("Inside testBelongToCircle()");
        assertTrue(circle.belongToCircle(2,2));
    }
}
