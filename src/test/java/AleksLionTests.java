import com.example.AleksLion;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class AleksLionTests {
    private boolean expectDoesHaveMane = true;
    private List<String> expectListOfFriends = List.of("Марти", "Глория", "Мелман");
    private String expectPlaceOfLiving = "Нью-Йоркский зоопарк";
    private int expectKittensCount = 0;

    public AleksLionTests() throws Exception {
    }

    @Test
    public void checkHasMane()throws Exception{
        Assert.assertEquals("У Алекса должна быть грива!", new AleksLion().doesHaveMane(), expectDoesHaveMane);
    }

    @Test
    public void checkFriendsList()throws Exception{
        Assert.assertEquals("Список друзей Алекса неверный!", new AleksLion().getFriends(), expectListOfFriends);
    }

    @Test
    public void checkAdress() throws Exception{
        Assert.assertEquals("Лев Алекс живёт не здесь!!", new AleksLion().getPlaceOfLiving(), expectPlaceOfLiving);
    }

    @Test
    public void checkKittensCount()throws Exception{
        Assert.assertEquals("У льва Алекса нет котят!", new AleksLion().getKittens(), expectKittensCount);
    }
}