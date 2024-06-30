import com.example.Cat;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import com.example.Feline;

@RunWith(MockitoJUnitRunner.class)

public class TestCatSoundPositive {

    @Spy

    Feline feline;

    @Test

    public void testGetSoundIsMeow(){

        Cat cat = new Cat(feline);
        cat.getSound();
        Assert.assertEquals("Мяу",cat.getSound());
    }

}
