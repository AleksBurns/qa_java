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

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    public final String sex;
    public final boolean hasMane;
    List<String> expectFoodList;

    public LionParametrizedTests(String sex, boolean hasMane, List<String> expectFoodList){
        this.sex = sex;
        this.hasMane = hasMane;
        this.expectFoodList = expectFoodList;

    }
    @Parameterized.Parameters(name = "{0}")
    public static Object[][] lionParam(){
       return new Object[][]{
               {"Самец", true, List.of("Животные", "Птицы", "Рыба")},
               {"Самка", false, List.of("Животные", "Птицы", "Рыба")}
       };
    }

    @Test
    public void checkDoesHaveMane() throws Exception{
        Lion lion = new Lion(sex);
        Assert.assertEquals(lion.doesHaveMane(), hasMane);
    }

    @Test
    public void checkDefaultGetKittens()throws Exception{
        Lion lion = new Lion(sex);
        int expectDefaultKittensCount = 1;
        Assert.assertEquals("Количество котят по-умолчанию неверное!", lion.getKittens(), expectDefaultKittensCount);
    }

    @Mock
    Feline feline;

    @Test
    public void checkGetFood() throws Exception {
        Lion lion = new Lion(sex);
        Mockito.when(feline.eatMeat()).thenReturn(expectFoodList);
        Assert.assertEquals("Львы такое не едят!", lion.getFood(),expectFoodList);
    }

}
