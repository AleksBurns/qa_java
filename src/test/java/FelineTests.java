import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class FelineTests {
    private List<String> expectFoodList = List.of("Животные", "Птицы", "Рыба");
    private String expectFamily = "Кошачьи";
    private int expectDefaultKittensCount = 1;
    private int expectKittensCount = 3;

    @Test
    public void checkEatMeat() throws Exception {
        Assert.assertEquals("Хищники такое не едят!", expectFoodList, new Feline().eatMeat());
    }

    @Test
    public void checkGetFamily(){
        Assert.assertEquals("Неверно указано семейство!", expectFamily, new Feline().getFamily());
    }

    @Test
    public void checkDefaultGetKittens(){
        Assert.assertEquals("Количество котят по-умолчанию неверное!", expectDefaultKittensCount, new Feline().getKittens());
    }

    @Test
    public void checkGetKittens(){
        Assert.assertEquals("Количество котят неверное!", expectKittensCount, new Feline().getKittens(expectKittensCount));
    }
}
