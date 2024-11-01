package lab0;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import lab0.Variant5;

class Variant5Test {

    @Test
    public void testFibonacciSequence() {
        Assertions.assertArrayEquals(new int[]{1, 1, 2, 3, 5, 8}, Variant5.fibonacciSequence(6));
    }

    @Test
    public void testCheckInequalities() {
        Assertions.assertTrue(Variant5.checkInequalities(1, -3));
        Assertions.assertFalse(Variant5.checkInequalities(-1, -1));
    }

    @Test
    public void testPerformOperation() {
        Assertions.assertEquals(5, Variant5.performOperation(1, 2, 3));
        Assertions.assertEquals(-1, Variant5.performOperation(2, 2, 3));
        Assertions.assertEquals(6, Variant5.performOperation(3, 2, 3));
        Assertions.assertEquals(2, Variant5.performOperation(4, 6, 3));
    }

    @Test
    public void testCandyCost() {
        double[] expected = {0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9, 1.0};
        Assertions.assertArrayEquals(expected, Variant5.candyCost(1.0));
    }

    @Test
    public void testCountPositivesAndNegatives() {
        Assertions.assertArrayEquals(new int[]{2, 1}, Variant5.countPositivesAndNegatives(1, -1, 2));
        Assertions.assertArrayEquals(new int[]{0, 3}, Variant5.countPositivesAndNegatives(-1, -2, -3));
    }

    @Test
    public void testUnusedSegmentLength() {
        Assertions.assertEquals(1, Variant5.unusedSegmentLength(7, 3));
        Assertions.assertEquals(0, Variant5.unusedSegmentLength(6, 3));
    }

    @Test
    public void testCreateArithmeticProgressionMatrix() {
        int[][] expected = {{1, 3, 5}, {2, 4, 6}};
        int[] firstColumn = {1, 2};
        Assertions.assertArrayEquals(expected, Variant5.createArithmeticProgressionMatrix(2, 3, 2, firstColumn));
    }

    @Test
    public void testFindPowerOfTwoExponent() {
        Assertions.assertEquals(3, Variant5.findPowerOfTwoExponent(8));
        Assertions.assertEquals(4, Variant5.findPowerOfTwoExponent(16));
    }
}
