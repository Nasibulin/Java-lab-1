import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * User: Nasibulin
 * Date: 28.09.18
 * Time: 8:41
 * To change this template use File | Settings | File Templates.
 */
public class CircleTest {
    @Test
    public void testDelta() throws Exception {
    assertEquals(0.15915494319051504,Circle.delta(1.0),0.00000000000000001);
    }
}
