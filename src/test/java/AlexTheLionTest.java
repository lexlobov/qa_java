import com.example.AlexTheLion;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AlexTheLionTest {
    @Test
    public void getFriendsReturnsCorrectList() throws Exception{
        List<String> expectedResult = List.of("зебра Марти", "бегемотиха Глория", "жираф Мелман");
        AlexTheLion alexTheLion = new AlexTheLion();
        List<String> actualResult = alexTheLion.getFriends();
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getPlaceOfLivingReturnsNewYork() throws Exception{
        AlexTheLion alexTheLion = new AlexTheLion();
        String actualResult = alexTheLion.getPlaceOfLiving();
        assertEquals("Нью-Йоркский зоопарк", actualResult);
    }
    @Test
    public void getKittensReturns0() throws Exception{
        AlexTheLion alexTheLion = new AlexTheLion();
        int actualResult = alexTheLion.getKittens();
        assertEquals(0, actualResult);
    }
}
