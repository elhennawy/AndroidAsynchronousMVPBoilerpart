package ro.ovidiuconeac.androidasynchronousmvpboilerpart.feature.presenter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ro.ovidiuconeac.androidasynchronousmvpboilerpart.features.featurex.presenter.XPresenter;
import ro.ovidiuconeac.androidasynchronousmvpboilerpart.features.featurex.presenter.XPresenterImpl;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;

/**
 * Created by ovidiu on 1/2/17.
 */
public class XPresenterTest {

    private XPresenter presenter;

    @Before
    public void setUp() {
        presenter = mock(XPresenterImpl.class);
    }

    @After
    public void tearDown() {
        presenter = null;
    }

    @Test
    public void testRequestAction1() {
        doNothing().when(presenter).requestAction1();
        presenter.requestAction1();
    }

    @Test
    public void testRequestAction2() {
        doNothing().when(presenter).requestAction2();
        presenter.requestAction2();
    }

    @Test
    public void testRequestAction3() {
        doNothing().when(presenter).requestAction3();
        presenter.requestAction3();
    }
}
