import com.example.Feline;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;
public class FelineTest {

    @Test
    public void getFamilyReturnsFeline(){
        Feline feline = new Feline();
        String actualResult = feline.getFamily();
        assertEquals("Кошачьи", actualResult);
    }
    @Test
    public void getKittensReturns1(){
        Feline feline  = new Feline();
        int actualResult = feline.getKittens();
        assertEquals(1, actualResult);
    }
    @Test
    public void eatMeatReturnsPredatorList() throws Exception{
        Feline feline = new Feline();
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        List<String> actualResult = feline.eatMeat();
        assertEquals(expectedResult, actualResult);


    }

}
