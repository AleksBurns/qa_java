import com.example.Feline;
import com.example.Lion;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionTests {
    String expectExceptionText = "Используйте допустимые значения пола животного - самец или самка";
    int kittensCount = 42;

    @Rule
    public ExpectedException thrown = ExpectedException.none();
    @Mock
    Feline feline;

    @Test
    public void checkException() throws Exception {
        thrown.expect(Exception.class);
        thrown.expectMessage(expectExceptionText);
        new Lion("Лев-гермафродит");
        thrown = ExpectedException.none();
    }

    @Test
    public void checkKittensCount() {
        feline.getKittens(kittensCount);
        Mockito.verify(feline).getKittens(kittensCount);
    }

}
