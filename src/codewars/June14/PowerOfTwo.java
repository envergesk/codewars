package codewars.June14;
//done
public class PowerOfTwo {
    public static long[] powersOfTwo(int n){
        long[] answer = new long[n+1];
        for (int i = 0; i < n+1; i++) {
            answer[i] = (long)Math.pow(2, i);
        }
        return answer;
    }
}

//import org.junit.Test;
//        import org.junit.runners.JUnit4;
//        import static org.junit.Assert.assertArrayEquals;
//// TODO: Replace examples and use TDD by writing your own tests
//
//public class SolutionTest {
//    @Test
//    public void testSomething() {
//        assertArrayEquals(new long[]{1}, Kata.powersOfTwo(0));
//        assertArrayEquals(new long[]{1,2}, Kata.powersOfTwo(1));
//        assertArrayEquals(new long[]{1,2,4,8,16}, Kata.powersOfTwo(4));
//    }
//}
