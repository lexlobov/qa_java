import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline feline;
    @Test
    public void getSoundReturnsMew(){
        Cat cat = new Cat(feline);
        String actualResult = cat.getSound();
        assertEquals("Мяу", actualResult);
    }
    @Test
    public void getFoodReturnsPredatorFood() throws Exception{
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        Cat cat = new Cat(feline);

            Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
            assertEquals(expectedResult, cat.getFood());

            System.out.println("указан неверный тип животного");


    }
}
