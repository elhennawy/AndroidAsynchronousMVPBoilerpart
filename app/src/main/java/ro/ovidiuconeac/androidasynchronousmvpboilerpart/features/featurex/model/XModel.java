package ro.ovidiuconeac.androidasynchronousmvpboilerpart.features.featurex.model;

import java.util.Random;

import ro.ovidiuconeac.androidasynchronousmvpboilerpart.features.featurex.presenter.XPresenter;

/**
 * Created by ovidiu on 12/29/16.
 */

public class XModel {

    private XPresenter presenter;
    private Random random;

    public XModel(XPresenter presenter) {
        this.presenter = presenter;
        this.random = new Random();
    }

    // Use case "request action 1"
    public void requestAction1() {
        Result result = new Result();
        result.setResult("Response 1 - " + random.nextInt(1000));
        presenter.postResult1(result);
    }

    // Use case "request action 2"
    public void requestAction2() {
        Result result = new Result();
        result.setResult("Response 2 - " + random.nextInt(1000));
        presenter.postResult2(result);
    }

    // Use case "request action 3"
    public void requestAction3() {
        Result result = new Result();
        result.setResult("Response 3 - " + random.nextInt(1000));
        presenter.postResult3(result);
    }
}
