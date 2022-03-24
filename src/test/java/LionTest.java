import com.example.Lion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LionTest {
    private final String wrongSex = "1234";
    @Test
    public void lionThrowsException(){
        try {
            Lion lion = new Lion(wrongSex);
        } catch (Exception exception){
            assertEquals("Используйте допустимые значения пола животного - самей или самка", exception.getMessage());
        }


    }
}
