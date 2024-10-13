import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTests {

    @Mock
    Feline feline;

    @Test
    public void checkGetSound() {
        String expectedSound = "Мяу";
        Cat cat = new Cat(feline);
        Assert.assertEquals("Мяукают не так!", cat.getSound(), expectedSound);
    }

    @Test
    public void checkGetFood() throws Exception {
        Cat cat = new Cat(feline);
        List<String> expectFoodList = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(expectFoodList);
        Assert.assertEquals("Коты такое не едят!", cat.getFood(),(expectFoodList));
    }
}
