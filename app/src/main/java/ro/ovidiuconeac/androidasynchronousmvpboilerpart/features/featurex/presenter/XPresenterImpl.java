package ro.ovidiuconeac.androidasynchronousmvpboilerpart.features.featurex.presenter;

import java.util.UUID;

import ro.ovidiuconeac.androidasynchronousmvpboilerpart.common.Util;
import ro.ovidiuconeac.androidasynchronousmvpboilerpart.features.Screen;
import ro.ovidiuconeac.androidasynchronousmvpboilerpart.features.featurex.model.Result;
import ro.ovidiuconeac.androidasynchronousmvpboilerpart.features.featurex.model.XModel;
import ro.ovidiuconeac.androidasynchronousmvpboilerpart.features.featurex.view.XView;

/**
 * Created by ovidiu on 12/29/16.
 */

public class XPresenterImpl implements XPresenter {

    private UUID uuid;
    private XView view;
    private XModel model;

    public XPresenterImpl(XView view) {
        this.uuid = UUID.randomUUID();
        this.view = view;
        this.model = new XModel(this);
    }

    @Override
    public void requestAction1() {
        Util.simulateNetworkLatency(2000);
        model.requestAction1();
    }

    @Override
    public void postResult1(Result result) {
        view.postResult1(result.getResult());
    }

    @Override
    public void requestAction2() {
        Util.simulateNetworkLatency(1500);
        model.requestAction2();
    }

    @Override
    public void postResult2(Result result) {
        view.postResult2(result.getResult());
    }

    @Override
    public void requestAction3() {
        Util.simulateNetworkLatency(3000);
        model.requestAction3();
    }

    @Override
    public void postResult3(Result result) {
        view.postResult3(result.getResult());
    }

    @Override
    public void setScreen(Screen screen) {
        this.view = (XView) screen;
    }

    @Override
    public UUID getUuid() {
        return uuid;
    }
}
