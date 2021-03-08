package hw1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DivideTest extends AbstractBinaryOpTest {

    @Override
    @Test(dataProvider = "long")
    public void longTest(long a, long b) {
        if (b == 0L) {
            try {
                calculator.div(a,b);
            }
            catch (NumberFormatException ex) {
                // Log maybe
            }
        }
        else {
            Assert.assertEquals(calculator.div(a,b), a / b);
        }
    }

    @Override
    @Test(dataProvider = "double")
    public void doubleTest(double a, double b) {
        Assert.assertEquals(calculator.div(a,b), a / b);
    }
}
