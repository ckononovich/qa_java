import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineMethodsTest {

    @Mock

    Feline feline;

    @Test

    public void testGetFoodFelinePositive() throws Exception {
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actualResult = feline.eatMeat();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test

    public void getFamilyFelinePositiveTest(){
        String expectedResult ="Кошачьи";
        Mockito.when(feline.getFamily()).thenReturn("Кошачьи");
        String actualResult = feline.getFamily();
        Assert.assertEquals(expectedResult,actualResult);
    }


}
