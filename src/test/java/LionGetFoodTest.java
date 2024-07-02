import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)

public class LionGetFoodTest {

    @Mock

    Feline feline;

    @Test

    public void getFoodTest() throws Exception {

        Lion lion = new Lion(feline);
        List<String> values = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List <String> actualResult = lion.getFood();
        Assert.assertEquals(values, actualResult);
    }

}
