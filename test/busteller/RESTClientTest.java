package busteller;

import org.junit.*;

import static org.junit.Assert.*;

import java.util.*;

import play.mvc.*;
import play.libs.*;
import play.test.*;
import static play.test.Helpers.*;

import com.google.common.collect.ImmutableMap;

public class RESTClientTest extends WithApplication {

	@Test
	public void getData() {
		Result result = callAction(
				controllers.routes.ref.Application.index(),
				fakeRequest()
				);
		assertNotNull(result);
		
		
	}
}

