package ro.ovidiuconeac.androidasynchronousmvpboilerpart.features.featurex.presenter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.UUID;

import ro.ovidiuconeac.androidasynchronousmvpboilerpart.features.Screen;
import ro.ovidiuconeac.androidasynchronousmvpboilerpart.features.featurex.view.XView;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by ovidiu on 1/2/17.
 */
public class XPresenterTest {

    private XView view;
    private XPresenterImpl presenter;

    @Before
    public void setUp() {
        view = mock(XView.class);
        presenter = new XPresenterImpl(view);
    }

    @After
    public void tearDown() {
        view = null;
        presenter = null;
    }

    @Test
    public void testRequestAction1() {
        presenter.requestAction1();
        verify(view, times(1)).postResult1(anyString());
    }

    @Test
    public void testRequestAction2() {
        presenter.requestAction2();
        verify(view, times(1)).postResult2(anyString());
    }

    @Test
    public void testRequestAction3() {
        presenter.requestAction3();
        verify(view, times(1)).postResult3(anyString());
    }

    @Test
    public void testSetScreen() {
        // Al least it tests that the method exists in the presenter
        // Assures interface consistency
        presenter.setScreen(view);
    }

    @Test
    public void testGetUuid() {
        // Al least it tests that the method exists in the presenter
        // Assures interface consistency
        presenter.getUuid();
    }
}
