package ro.ovidiuconeac.androidasynchronousmvpboilerpart.featurex.features.featurex.presenter;

import android.os.AsyncTask;

import java.util.UUID;

import ro.ovidiuconeac.androidasynchronousmvpboilerpart.featurex.features.Screen;
import ro.ovidiuconeac.androidasynchronousmvpboilerpart.featurex.features.featurex.model.XModel;
import ro.ovidiuconeac.androidasynchronousmvpboilerpart.featurex.features.featurex.view.XView;

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
        this.model = new XModel();
    }

    @Override
    public void requestAction1() {
        new AsyncTask<Void, Void, String>() {

            @Override
            protected String doInBackground(Void... params) {
                return model.requestAction1();
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                view.postResult1(s);
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }

    @Override
    public void requestAction2() {
        new AsyncTask<Void, Void, String>() {

            @Override
            protected String doInBackground(Void... params) {
                return model.requestAction2();
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                view.postResult2(s);
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }

    @Override
    public void requestAction3() {
        new AsyncTask<Void, Void, String>() {

            @Override
            protected String doInBackground(Void... params) {
                return model.requestAction3();
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                view.postResult3(s);
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
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
