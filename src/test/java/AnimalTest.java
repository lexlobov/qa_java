import com.example.Animal;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AnimalTest {

    @Test
    public void getFoodReturnsPredatorList() throws Exception{
        Animal animal = new Animal();
        List<String> actualResult = animal.getFood("Хищник");
        assertEquals(List.of("Животные", "Птицы", "Рыба"), actualResult);

    }
    @Test
    public void getFoodReturnsCarnivoreList() throws Exception{
        Animal animal = new Animal();
        List<String> actualResult = animal.getFood("Травоядное");
        assertEquals(List.of("Трава", "Различные растения"), actualResult);

    }
    @Test
    public void getFoodThrowsException() throws Exception{
        Animal animal = new Animal();
        try {
            List<String> actualResult = animal.getFood("32312");
        } catch (Exception exception){
            assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", exception.getMessage());
        }
    }
    @Test
    public void getFamilyReturnsCorrectText(){
        Animal animal =  new Animal();
        String actualResult = animal.getFamily();
        assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", actualResult);
    }
}
