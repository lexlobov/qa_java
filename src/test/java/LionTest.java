import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    private final String wrongSex = "1234";
    private final String maleSex = "Самец";
    @Mock
    Feline feline;
    @Test(expected = Exception.class)
    public void lionThrowsException() throws Exception{
        Lion lion = new Lion(wrongSex, feline);
    }
    @Test
    public void getKittensReturns1() throws Exception{
        Lion lion = new Lion(maleSex, feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actualResult = lion.getKittens();
        assertEquals(1, actualResult);
    }
    @Test
    public void getFoodReturnsPredatorList() throws Exception{
        Lion lion = new Lion(maleSex, feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actualResult = lion.getFood();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), actualResult);
    }
}
