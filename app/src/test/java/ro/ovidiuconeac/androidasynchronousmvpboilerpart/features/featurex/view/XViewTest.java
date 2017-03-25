package ro.ovidiuconeac.androidasynchronousmvpboilerpart.features.featurex.view;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ro.ovidiuconeac.androidasynchronousmvpboilerpart.features.Presenter;
import ro.ovidiuconeac.androidasynchronousmvpboilerpart.features.Screen;
import ro.ovidiuconeac.androidasynchronousmvpboilerpart.features.featurex.presenter.XPresenterImpl;

import java.util.UUID;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;

/**
 * Created by ovidiu on 1/2/17.
 */
public class XViewTest {

    private XActivity view;

    @Before
    public void setUp() {
        view = mock(XActivity.class);
    }

    @After
    public void tearDown() {
        view = null;
    }

    @Test
    public void testRequestAction1() {
        // Al least it tests that the method exists in the presenter
        // Assures interface consistency
        doNothing().when(view).requestAction1();
        view.requestAction1();
    }

    @Test
    public void testRequestAction2() {
        // Al least it tests that the method exists in the presenter
        // Assures interface consistency
        doNothing().when(view).requestAction2();
        view.requestAction2();
    }

    @Test
    public void testRequestAction3() {
        // Al least it tests that the method exists in the presenter
        // Assures interface consistency
        doNothing().when(view).requestAction3();
        view.requestAction3();
    }

    @Test
    public void testCachePresenter() {
        // Al least it tests that the method exists in the presenter
        // Assures interface consistency
        doNothing().when(view).cachePresenter(any(Presenter.class));
        view.cachePresenter(any(Presenter.class));
    }

    @Test
    public void testRestorePresenter() {
        // Al least it tests that the method exists in the presenter
        // Assures interface consistency
        doNothing().when(view).restorePresenter(any(UUID.class));
        view.restorePresenter(any(UUID.class));
    }
}
