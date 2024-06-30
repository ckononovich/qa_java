import com.example.Animal;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FelineEatMeatTest {

    @Spy

    Animal animal;

    @Test

    public void testGetFoodFelinePositive() throws Exception {
        Feline feline = new Feline();
        Assert.assertEquals(animal.getFood("Хищник"), feline.eatMeat());
    }

}
