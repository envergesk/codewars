package codewars.June14;
//done
public class MaxMin {

    public int min(int[] list) {
        int min = list[0];
        for (int i : list) {
            if (i < min) {
                min = i;
            }
        }
            return min;
    }

    public int max(int[] list) {
        int max = list[0];
        for (int i : list) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}

//import org.junit.Test;
//        import static org.junit.Assert.assertEquals;
//        import org.junit.runners.JUnit4;
//
//// TODO: Replace examples and use TDD development by writing your own tests
//
//public class SolutionTest {
//
//    private Kata kata = new Kata();
//
//    @Test
//    public void testExamples() {
//        assertEquals(-110, kata.min(new int[]{-52, 56, 30, 29, -54, 0, -110}));
//        assertEquals(0, kata.min(new int[]{42, 54, 65, 87, 0}));
//        assertEquals(566, kata.max(new int[]{4,6,2,1,9,63,-134,566}));
//        assertEquals(5, kata.max(new int[]{5}));
//    }
//}
