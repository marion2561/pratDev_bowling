import com.example.ex_bowling.Game;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {
    @Test
    void process_given20and0_ShouldBe0(){
        int result = Game.process(20,0);
        Assertions.assertEquals(0,result);
    }
    @Test
    void process_given20and1_ShouldBe20(){
        int result = Game.process(20,1);
        Assertions.assertEquals(20,result);
    }
    @Test
    void process_givenSpare_and3_ShouldBe16(){
        int result = Game.process(2,5);
        result += Game.process(1,3);
        Assertions.assertEquals(16,result);
    }




}
