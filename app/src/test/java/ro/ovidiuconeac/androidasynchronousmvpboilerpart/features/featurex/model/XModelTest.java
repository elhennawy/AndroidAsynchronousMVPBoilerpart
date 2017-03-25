package ro.ovidiuconeac.androidasynchronousmvpboilerpart.features.featurex.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ro.ovidiuconeac.androidasynchronousmvpboilerpart.features.featurex.presenter.XPresenter;
import ro.ovidiuconeac.androidasynchronousmvpboilerpart.features.featurex.presenter.XPresenterImpl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by ovidiu on 1/2/17.
 */

public class XModelTest {

    private XPresenter presenter;
    private XModel model;

    @Before
    public void setUp() {
        presenter = mock(XPresenter.class);
        model = new XModel(presenter);
    }

    @After
    public void tearDown() {
        model = null;
    }

    @Test
    public void testRequestAction1() {
        model.requestAction1();
        verify(presenter, times(1)).postResult1(any(Result.class));
    }

    @Test
    public void testRequestAction2() {
        model.requestAction2();
        verify(presenter, times(1)).postResult2(any(Result.class));
    }

    @Test
    public void testRequestAction3() {
        model.requestAction3();
        verify(presenter, times(1)).postResult3(any(Result.class));    }
}
