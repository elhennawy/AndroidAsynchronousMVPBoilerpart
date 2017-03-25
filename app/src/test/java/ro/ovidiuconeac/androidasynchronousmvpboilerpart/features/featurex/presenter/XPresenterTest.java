package ro.ovidiuconeac.androidasynchronousmvpboilerpart.features.featurex.presenter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.UUID;

import ro.ovidiuconeac.androidasynchronousmvpboilerpart.features.Screen;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by ovidiu on 1/2/17.
 */
public class XPresenterTest {

    private XPresenter presenter;
    private Screen screen;

    @Before
    public void setUp() {
        presenter = mock(XPresenterImpl.class);
        screen = mock(Screen.class);
    }

    @After
    public void tearDown() {
        presenter = null;
    }

    @Test
    public void testRequestAction1() {
        // Al least it tests that the method exists in the presenter
        // Assures interface consistency
        doNothing().when(presenter).requestAction1();
        presenter.requestAction1();
    }

    @Test
    public void testRequestAction2() {
        // Al least it tests that the method exists in the presenter
        // Assures interface consistency
        doNothing().when(presenter).requestAction2();
        presenter.requestAction2();
    }

    @Test
    public void testRequestAction3() {
        // Al least it tests that the method exists in the presenter
        // Assures interface consistency
        doNothing().when(presenter).requestAction3();
        presenter.requestAction3();
    }

    @Test
    public void testSetScreen() {
        // Al least it tests that the method exists in the presenter
        // Assures interface consistency
        doNothing().when(presenter).setScreen(any(Screen.class));
        presenter.setScreen(screen);
    }

    @Test
    public void testGetUuid() {
        UUID uuid = UUID.randomUUID();
        when(presenter.getUuid()).thenReturn(uuid);
        UUID result = presenter.getUuid();
        assertNotNull(result);
        assertEquals(uuid, result);
    }
}
