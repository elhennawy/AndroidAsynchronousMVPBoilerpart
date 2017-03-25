package ro.ovidiuconeac.androidasynchronousmvpboilerpart.features.featurex.presenter;

import ro.ovidiuconeac.androidasynchronousmvpboilerpart.features.Presenter;
import ro.ovidiuconeac.androidasynchronousmvpboilerpart.features.featurex.model.Result;

/**
 * Created by ovidiu on 12/29/16.
 */

public interface XPresenter extends Presenter {
    void requestAction1();
    void postResult1(Result result);
    void requestAction2();
    void postResult2(Result result);
    void requestAction3();
    void postResult3(Result result);
}
