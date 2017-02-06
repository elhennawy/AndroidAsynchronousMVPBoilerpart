package ro.ovidiuconeac.androidasynchronousmvpboilerpart;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import ro.ovidiuconeac.androidasynchronousmvpboilerpart.features.featurex.presenter.XPresenter;
import ro.ovidiuconeac.androidasynchronousmvpboilerpart.features.featurex.presenter.XPresenterImpl;
import ro.ovidiuconeac.androidasynchronousmvpboilerpart.features.featurex.view.XView;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by ovidiu on 1/2/17.
 */
@Ignore
public class XPresenterTest {

    private XView view;
    private XPresenter presenter;

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
    public void testViewIsNotNull() {
        assertNotNull(view);
    }

    @Test
    public void testPresenterIsNotNull() {
        assertNotNull(presenter);
    }

    @Test
    public void testRequestAction1() {
        presenter.requestAction1();
        verify(view, times(1)).postResult1("Response 1");
    }

    @Test
    public void testRequestAction2() {
        presenter.requestAction2();
        verify(view, times(1)).postResult2("Response 2");
    }

    @Test
    public void testRequestAction3() {
        presenter.requestAction3();
        verify(view, times(1)).postResult3("Response 3");
    }
}
