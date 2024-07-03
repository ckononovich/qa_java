import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)

public class TestCountCats {

    @Mock

    Feline feline;

    @Test

    public void countKittensAmountIsRight() throws Exception {
        Lion lion = new Lion("Самец",feline);
        int expectedResult = 1;
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actualResult = lion.countKittens();
        assertEquals(expectedResult,actualResult);
    }

}
