import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNot.not;

public class CanaryUnitTest {

    @Test //Hamcrest
    public void canaryTest() {
        assertThat(true, is(not(false)));
    }
}
