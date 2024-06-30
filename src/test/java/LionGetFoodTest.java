import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)

public class LionGetFoodTest {
    @Spy

    Feline feline;

    @Test

    public void getFoodTest() throws Exception {

        Lion lion = new Lion(feline);
        lion.getFood();
        Assert.assertEquals(lion.getFood(), feline.getFood("Хищник"));
    }

}
