import org.junit.Test;
import org.junit.Assert;

public class TestSolution {
    @Test
    public void testSolutionMySqrtTest() throws Exception{
        Assert.assertEquals(2,Solution.mySqrtTest(4));
        Assert.assertEquals(2,Solution.mySqrtTest(8));
        Assert.assertEquals(4,Solution.mySqrtTest(17));
    }
    @Test
    public void testSolutionMySqrt() throws Exception{
        Assert.assertEquals(2,Solution.mySqrt(4));
        Assert.assertEquals(2,Solution.mySqrt(8));
        Assert.assertEquals(4,Solution.mySqrt(17));
    }
}
