package hw1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DivideTest extends AbstractBinaryOpTest {

    @Test(dataProvider = "long")
    public void divLongTest(long a, long b) {
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

    @Test(dataProvider = "double")
    public void divDoubleTest(double a, double b) {
        Assert.assertEquals(calculator.div(a,b), a / b);
    }
}
