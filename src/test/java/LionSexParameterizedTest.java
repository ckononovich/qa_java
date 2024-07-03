import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)

  public class LionSexParameterizedTest {

    private final String lionSex;

    public LionSexParameterizedTest(String lionSex) {
        this.lionSex = lionSex;
    }

    @Parameterized.Parameters
    public static Object[][] getSexData() {
        return new Object[][]{
                {"Самец"},
                {"Самка"},
        };
    }

    @Test

    public void correctSexIsDisplayed() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(lionSex, feline);
        boolean actualResult = lion.doesHaveMane();
        Assert.assertEquals(lion.doesHaveMane(), actualResult);
    }

}

