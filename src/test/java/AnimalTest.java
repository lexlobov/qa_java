import com.example.Animal;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AnimalTest {

    String wrongAnimalKind = "23423432";
    String predator = "Хищник";
    String carnivore = "Травоядное";
    @Test
    public void getFoodReturnsPredatorList() throws Exception{
        Animal animal = new Animal();
        List<String> actualResult = animal.getFood(predator);
        assertEquals(List.of("Животные", "Птицы", "Рыба"), actualResult);

    }
    @Test
    public void getFoodReturnsCarnivoreList() throws Exception{
        Animal animal = new Animal();
        List<String> actualResult = animal.getFood(carnivore);
        assertEquals(List.of("Трава", "Различные растения"), actualResult);

    }
    @Test(expected = Exception.class)
    public void getFoodThrowsException() throws Exception{
        Animal animal = new Animal();
        List<String> actualResult = animal.getFood(wrongAnimalKind);
    }
    @Test
    public void getFamilyReturnsCorrectText(){
        Animal animal =  new Animal();
        String actualResult = animal.getFamily();
        assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", actualResult);
    }
}
