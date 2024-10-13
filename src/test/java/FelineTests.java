import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class FelineTests {
    Feline feline = new Feline();

    @Test
    public void checkEatMeat() throws Exception {
        List<String> expectFoodList = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals("Хищники такое не едят!", feline.eatMeat(), expectFoodList);
    }

    @Test
    public void checkGetFamily(){
        String expectFamily = "Кошачьи";
        Assert.assertEquals("Неверно указано семейство!", feline.getFamily(),expectFamily);
    }

    @Test
    public void checkDefaultGetKittens(){
        int expectDefaultKittensCount = 1;
        Assert.assertEquals("Количество котят по-умолчанию неверное!", feline.getKittens(), expectDefaultKittensCount);
    }

    @Test
    public void checkGetKittens(){
        int expectKittensCount = 3;
        Assert.assertEquals("Количество котят неверное!", feline.getKittens(expectKittensCount), expectKittensCount);
    }
}
