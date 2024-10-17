import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTests {
    List<String> expectFoodList = List.of("Животные", "Птицы", "Рыба");
    String expectFamily = "Кошачьи";
    int expectDefaultKittensCount = 1;
    int expectKittensCount = 3;

    @Test
    public void checkEatMeat() throws Exception {
        Assert.assertEquals("Хищники такое не едят!", expectFoodList, new Feline().eatMeat());
    }

    @Test
    public void checkGetFamily() {
        Assert.assertEquals("Неверно указано семейство!", expectFamily, new Feline().getFamily());
    }

    @Test
    public void checkDefaultGetKittens() {
        Assert.assertEquals("Количество котят по-умолчанию неверное!", expectDefaultKittensCount, new Feline().getKittens());
    }

    @Test
    public void checkGetKittens() {
        Assert.assertEquals("Количество котят неверное!", expectKittensCount, new Feline().getKittens(expectKittensCount));
    }
}
