import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParameterizedTest {

    private String sex;
    private boolean expectedResult;
    public LionParameterizedTest(String sex, boolean expectedResult){
        this.sex = sex;
        this.expectedResult = expectedResult;
    }
    @Parameterized.Parameters
    public static Object[][] lionData(){
        return new Object[][]{
                //actual    // expected
                {"Самец",   true},
                {"Самка",   false},
        };
    }
    @Test
    public void doesHaveManeReturnsBoolean() throws Exception{
        Lion lion = new Lion(sex);
        boolean actualResult = lion.doesHaveMane();
        assertEquals(expectedResult, actualResult);
    }

}
