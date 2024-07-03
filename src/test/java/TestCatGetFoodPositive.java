import com.example.Cat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import com.example.Feline;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)

public class TestCatGetFoodPositive {

    @Mock

    Feline feline;


    @Test

    public void testGetFood() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actualResult = cat.getFood();
        assertEquals(feline.eatMeat(), actualResult);

    }

}
