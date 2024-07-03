import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TestException {

    private final String lionException;

    public TestException (String lionException) {
        this.lionException = lionException;
    }

    @Parameterized.Parameters
    public static Object[][] getSexData() {
        return new Object[][]{
                {"Другое"},
                {"Новый"},
        };
    }


    @Test(expected = Exception.class)
    public void whenExceptionThrown_thenItIsTrue() throws Exception {

        Feline feline = new Feline();
        Lion lion = new Lion(lionException, feline);
        lion.doesHaveMane();
    }
}

