import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;
@RunWith(Parameterized.class)
public class FelineParameterizedGetKittensTest {


    private int kittensCount;
    private int expectedResult;
    public FelineParameterizedGetKittensTest(int kittensCount, int expectedResult){
        this.kittensCount = kittensCount;
        this.expectedResult = expectedResult;
    }
    @Parameterized.Parameters
    public static Object[][] getKittensData(){
        return new Object[][]{
                //actual    // expected
                {1,         1},
                {0,         0},
                {100,       100},
                {-6,        -6},
        };
    }
    @Test
    public void getKittensReturnsKittensCount(){
        Feline feline = new Feline();
        int actualResult = feline.getKittens(kittensCount);
        assertEquals(expectedResult, actualResult);
    }
}
