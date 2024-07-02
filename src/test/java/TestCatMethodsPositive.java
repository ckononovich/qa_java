import com.example.Cat;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import com.example.Feline;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)

public class TestCatMethodsPositive {

    @Spy

    Feline feline;

    @Test

    public void testGetSoundIsMeow(){

        Cat cat = new Cat(feline);
        cat.getSound();
        Assert.assertEquals("Мяу",cat.getSound());
    }

    @Test

    public void testGetFood() throws Exception {
        Cat cat = new Cat(feline);
        assertEquals(feline.getFood("Хищник"), cat.getFood());

    }

}
