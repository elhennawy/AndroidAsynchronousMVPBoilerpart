package ro.ovidiuconeac.androidasynchronousmvpboilerpart.featurex.presenter;

import ro.ovidiuconeac.androidasynchronousmvpboilerpart.featurex.model.XModel;
import ro.ovidiuconeac.androidasynchronousmvpboilerpart.featurex.view.XView;

/**
 * Created by ovidiu on 12/29/16.
 */

public class XPresenterImpl implements XPresenter {

    private XView view;
    private XModel model;

    public XPresenterImpl(XView view) {
        this.view = view;
        this.model = new XModel();
    }

    @Override
    public void requestAction1() {
        view.postResult1(model.requestAction1());
    }

    @Override
    public void requestAction2() {
        view.postResult2(model.requestAction2());
    }

    @Override
    public void requestAction3() {
        view.postResult3(model.requestAction3());
    }
}
