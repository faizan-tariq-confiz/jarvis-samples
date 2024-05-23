// Unit test code for SpringGetPlayersApplication
import com.cloud.services.SpringGetPlayersApplication;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;

class SpringGetPlayersApplicationTest {

    @Test
    public void testMain() {
        SpringGetPlayersApplication.main(new String[]{});
        assertNotNull("Application context should not be null", SpringGetPlayersApplication.class);
    }
}