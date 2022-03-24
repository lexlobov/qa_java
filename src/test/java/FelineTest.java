import com.example.Animal;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
//@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

//    @Mock
//    Animal animal;

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
    public void eatMeatReturnsPredatorList(){
        Feline feline = new Feline();
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        try {
            List<String> actualResult = feline.eatMeat();
            assertEquals(expectedResult, actualResult);

        } catch (Exception exception){
            System.out.println("Неизвестный вид животного");
        }

    }

}
