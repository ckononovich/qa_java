import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)

public class TestCatFoodPositive {

   @Spy

    Feline feline;

    @Test

    public void testGetFood() throws Exception {
        Cat cat = new Cat(feline);
        assertEquals(feline.getFood("Хищник"), cat.getFood());

    }

}

