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
    String expectedSound = "Мяу";
    List<String> expectFoodList = List.of("Животные", "Птицы", "Рыба");

    @Test
    public void checkGetSound() throws Exception {
        Assert.assertEquals("Мяукают не так!", expectedSound, new Cat(feline).getSound());
    }

    @Test
    public void checkGetFood() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(expectFoodList);
        Assert.assertEquals("Коты такое не едят!", expectFoodList, new Cat(feline).getFood());
    }
}
