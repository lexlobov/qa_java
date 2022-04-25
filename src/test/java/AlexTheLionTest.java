import com.example.AlexTheLion;
import com.example.Feline;
import org.junit.Test;
import org.mockito.Mock;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AlexTheLionTest {
    @Mock
    Feline feline;
    @Test
    public void getFriendsReturnsCorrectList() throws Exception{
        List<String> expectedResult = List.of("зебра Марти", "бегемотиха Глория", "жираф Мелман");
        AlexTheLion alexTheLion = new AlexTheLion(feline);
        List<String> actualResult = alexTheLion.getFriends();
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getPlaceOfLivingReturnsNewYork() throws Exception{
        AlexTheLion alexTheLion = new AlexTheLion(feline);
        String actualResult = alexTheLion.getPlaceOfLiving();
        assertEquals("Нью-Йоркский зоопарк", actualResult);
    }
    @Test
    public void getKittensReturns0() throws Exception{
        AlexTheLion alexTheLion = new AlexTheLion(feline);
        int actualResult = alexTheLion.getKittens();
        assertEquals(0, actualResult);
    }
}
