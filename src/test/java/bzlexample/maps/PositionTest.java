package bzlexample.maps;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PositionTest {
    @Test
    public void should_true(){
        Position p=new Position("14","14");
        assertEquals(p.toString(),"14 14",p.toString());
    }
}
