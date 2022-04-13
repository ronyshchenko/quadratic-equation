package quadratic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class QuadraticEquationTest {

    @Test
    public void discriminantIsMoreThenNull() {
        Assert.assertTrue(Solution.calculationRoot(1, -4, -5).getFirst() == 3, "Root found incorrectly");
        Assert.assertTrue(Solution.calculationRoot(1, -4, -5).getSecond() == -2, "Root found incorrectly");
    }

    @Test
    public void discriminantIsNull() {
        Assert.assertTrue(Solution.calculationRoot(1, 2, 1).getFirst() == -2, "Root found incorrectly");
        Assert.assertTrue(Solution.calculationRoot(1, 2, 1).getSecond() == -2, "Root found incorrectly");
    }

    @Test
    public void discriminantLessThenNull() {
        Assert.assertTrue(Solution.calculationRoot(3, -4, 2) != null, "Root found incorrectly");
    }
    }

