package ro.ovidiuconeac.androidasynchronousmvpboilerpart.features.featurex.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by ovidiu on 1/2/17.
 */

public class XModelTest {

    private XModel model;

    @Before
    public void setUp() {
        model = new XModel();
    }

    @After
    public void tearDown() {
        model = null;
    }

    @Test
    public void testRequestAction1() {
        Result result = model.requestAction1();
        assertNotNull(result);
        assertNotNull(result.getResult());
    }

    @Test
    public void testRequestAction2() {
        Result result = model.requestAction2();
        assertNotNull(result);
        assertNotNull(result.getResult());    }

    @Test
    public void testRequestAction3() {
        Result result = model.requestAction3();
        assertNotNull(result);
        assertNotNull(result.getResult());
    }
}
