import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)

public class TestCountCats {

    @Spy

    Feline feline;

    @Test

    public void countKittensAmountIsRight(){
        Lion lion = new Lion(feline);
        lion.countKittens();
        Assert.assertEquals(1,lion.countKittens());
    }

}
