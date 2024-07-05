import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

public class TestCatGetSound {

    @Test

    public void testGetSoundIsMeow(){
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        String expectedResult = "Мяу";
        String actualResult = cat.getSound();
        Assert.assertEquals(expectedResult,actualResult);
    }
}
