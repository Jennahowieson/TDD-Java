import com.sun.xml.internal.ws.developer.MemberSubmissionAddressing;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterbottleTest {
    Waterbottle waterbottle;
    @Before
    public void before() {
        waterbottle = new Waterbottle();
    }

    @Test
    public void hasVolume100() {
        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void drinkReducesBy10() {
        waterbottle.drink();
        assertEquals(90, waterbottle.getVolume());
    }

    @Test
    public void emptySetsVolumeTo0() {
        waterbottle.empty();
        assertEquals(0, waterbottle.getVolume());
    }

    @Test
    public void fillSetsVolumeTo100() {
        waterbottle.fill();
        assertEquals(100, waterbottle.getVolume());
    }

}

