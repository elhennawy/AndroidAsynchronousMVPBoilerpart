package ro.ovidiuconeac.androidasynchronousmvpboilerpart.featurex.presenter;

/**
 * Created by ovidiu on 12/29/16.
 */

public interface XPresenter {
    void requestAction1();
    void postResult1(String result);
    void requestAction2();
    void postResult2(String result);
    void requestAction3();
    void postResult3(String result);
}