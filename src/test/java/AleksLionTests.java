import com.example.AleksLion;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class AleksLionTests {
    boolean expectDoesHaveMane = true;
    List<String> expectListOfFriends = List.of("Марти", "Глория", "Мелман");
    String expectPlaceOfLiving = "Нью-Йоркский зоопарк";
    int expectKittensCount = 0;

    public AleksLionTests() throws Exception {
    }

    @Test
    public void checkHasMane() throws Exception {
        Assert.assertEquals("У Алекса должна быть грива!", expectDoesHaveMane, new AleksLion().doesHaveMane());
    }

    @Test
    public void checkFriendsList() throws Exception {
        Assert.assertEquals("Список друзей Алекса неверный!", expectListOfFriends, new AleksLion().getFriends());
    }

    @Test
    public void checkAdress() throws Exception {
        Assert.assertEquals("Лев Алекс живёт не здесь!!", expectPlaceOfLiving, new AleksLion().getPlaceOfLiving());
    }

    @Test
    public void checkKittensCount() throws Exception {
        Assert.assertEquals("У льва Алекса нет котят!", expectKittensCount, new AleksLion().getKittens());
    }
}