package hw1;

import com.epam.tat.module4.Calculator;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Random;

public abstract class AbstractBinaryOpTest {

    protected Calculator calculator = new Calculator();

    private final Random random = new Random(0);

    private final Object[] possibleOptionsForLong =
            new Object[] {0L, -0L, Long.MAX_VALUE, Long.MIN_VALUE, Math.abs(random.nextLong()), -Math.abs(random.nextLong())};

    private final Object[] possibleOptionsForDouble =
            new Object[] {0., -0., Double.MAX_VALUE, Double.MIN_VALUE, Math.abs(random.nextDouble()), -Math.abs(random.nextDouble())};

    @Test
    public abstract void longTest(long a, long b);

    @Test
    public abstract void doubleTest(double a, double b);

    private Object[][] cartesianProduct(Object[] set) {
        Object[][] res = new Object[set.length * set.length][2]; //2 for pairs

        for (int indexLeft = 0; indexLeft < set.length; indexLeft++) {
            for (int indexRight = 0; indexRight < set.length; indexRight++) {
                Object[] re = res[indexLeft * set.length + indexRight];
                re[0] = set[indexLeft];
                re[1] = set[indexRight];
            }
        }

        return res;
    }

    @DataProvider(name = "long")
    public Object[][] createLongData() {
        return cartesianProduct(possibleOptionsForLong);
    }

    @DataProvider(name = "double")
    public Object[][] createDoubleData() {
        return cartesianProduct(possibleOptionsForDouble);
    }
}
