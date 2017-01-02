package ro.ovidiuconeac.androidasynchronousmvpboilerpart.featurex;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ro.ovidiuconeac.androidasynchronousmvpboilerpart.featurex.model.XModel;

import static org.junit.Assert.assertEquals;
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
    public void testModelIsNotNull() {
        assertNotNull(model);
    }

    @Test
    public void testRequestAction1() {
        String result = model.requestAction1();
        assertNotNull(result);
        assertEquals("Response 1", result);
    }

    @Test
    public void testRequestAction2() {
        String result = model.requestAction2();
        assertNotNull(result);
        assertEquals("Response 2", result);
    }

    @Test
    public void testRequestAction3() {
        String result = model.requestAction3();
        assertNotNull(result);
        assertEquals("Response 3", result);
    }
}
