import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FelineGetKittensTest {
    @Test

    public void getKittensPositiveTest(){
        Feline feline = new Feline();

        int expectedResult = 1;
        int actualResult = feline.getKittens(1);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getKittensTest(){
        Feline feline = new Feline();

        int expectedResult = 1;
        int actualResult = feline.getKittens();
        assertEquals(expectedResult, actualResult);
    }

}
