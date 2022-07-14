package huoxingche;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class PositionTest {
    @Test
    public void should_true(){
        Position p=new Position("14","14");
        Assertions.assertEquals("14 14",p.toString());
    }
}
