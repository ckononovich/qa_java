import com.example.Animal;
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

    Animal animal;

    @Test

    public void testGetFoodFelinePositive() throws Exception {
        Feline feline = new Feline();
        Mockito.when(animal.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actualResult = feline.eatMeat();
        Assert.assertEquals(animal.getFood("Хищник"), actualResult);
    }

    @Test

    public void getFamilyFelinePositiveTest(){
        Feline feline = new Feline();
        Mockito.when(animal.getFamily()).thenReturn("Кошачьи");
        String actualResult = feline.getFamily();
        Assert.assertEquals(animal.getFamily(),actualResult);
    }


}
