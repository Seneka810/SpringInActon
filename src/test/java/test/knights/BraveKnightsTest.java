package test.knights;

import com.spinginaction.knights.BraveKnight;
import com.spinginaction.knights.Quest;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class BraveKnightsTest {
    @Test
    public void knightShouldEmbarkOnQuest(){
        Quest mockQuest = mock(Quest.class);

        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();

        verify(mockQuest, times(1)).embark();
    }
}
