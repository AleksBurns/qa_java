import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;

@RunWith(Parameterized.class)
public class LionParametrizedTests {
    @Mock
    Feline feline;
    private final String sex;
    private final boolean expectHasMane;
    private final List<String> expectFoodList;
    int expectDefaultKittensCount = 1;

    public LionParametrizedTests(String sex, boolean expectHasMane, List<String> expectFoodList) {
        this.sex = sex;
        this.expectHasMane = expectHasMane;
        this.expectFoodList = expectFoodList;
    }

    @Parameterized.Parameters(name = "{0}")
    public static Object[][] lionParam() {
        return new Object[][]{
                {"Самец", true, List.of("Животные", "Птицы", "Рыба")},
                {"Самка", false, List.of("Животные", "Птицы", "Рыба")}
        };
    }

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void checkDoesHaveMane() throws Exception {
        Assert.assertEquals("Параметр гривы неверный!", expectHasMane, new Lion(sex).doesHaveMane());
    }

    @Test
    public void checkDefaultGetKittens() throws Exception {
        Assert.assertEquals("Количество котят по-умолчанию неверное!", expectDefaultKittensCount, new Lion(sex).getKittens());
    }

    @Test
    public void checkGetFood() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(expectFoodList);
        Assert.assertEquals("Львы такое не едят!", expectFoodList, new Lion(sex).getFood());
    }

}
