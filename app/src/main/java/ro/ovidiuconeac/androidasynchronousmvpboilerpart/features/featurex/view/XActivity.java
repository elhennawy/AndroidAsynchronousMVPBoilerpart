package ro.ovidiuconeac.androidasynchronousmvpboilerpart.features.featurex.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.UUID;

import ro.ovidiuconeac.androidasynchronousmvpboilerpart.R;
import ro.ovidiuconeac.androidasynchronousmvpboilerpart.cache.Cache;
import ro.ovidiuconeac.androidasynchronousmvpboilerpart.features.Presenter;
import ro.ovidiuconeac.androidasynchronousmvpboilerpart.features.featurex.presenter.XPresenter;
import ro.ovidiuconeac.androidasynchronousmvpboilerpart.features.featurex.presenter.XPresenterImpl;

/**
 * Created by ovidiu on 12/29/16.
 */

public class XActivity extends AppCompatActivity implements XView {

    private final static String PRESENTER = "presenter";
    private final static String VIEW1 = "view1";
    private final static String VIEW2 = "view2";
    private final static String VIEW3 = "view3";

    private TextView view1;
    private TextView view2;
    private TextView view3;
    private XPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view1 = (TextView) findViewById(R.id.view1);
        view2 = (TextView) findViewById(R.id.view2);
        view3 = (TextView) findViewById(R.id.view3);
        presenter = new XPresenterImpl(this);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(VIEW1, view1.getText().toString());
        outState.putString(VIEW2, view2.getText().toString());
        outState.putString(VIEW3, view3.getText().toString());
        // Save presenter instance
        outState.putString(PRESENTER, presenter.getUuid().toString());
        cachePresenter(presenter);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        view1.setText(savedInstanceState.getString(VIEW1));
        view2.setText(savedInstanceState.getString(VIEW2));
        view3.setText(savedInstanceState.getString(VIEW3));
        // Restore presenter instance
        restorePresenter(UUID.fromString(savedInstanceState.getString(PRESENTER)));
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onResume() {
        super.onResume();
        this.requestAction1();
        this.requestAction2();
        this.requestAction3();
    }

    @Override
    public void requestAction1() {
        presenter.requestAction1();
    }

    @Override
    public void postResult1(String result) {
        view1.setText(result);
    }

    @Override
    public void requestAction2() {
        presenter.requestAction2();
    }

    @Override
    public void postResult2(String result) {
        view2.setText(result);
    }

    @Override
    public void requestAction3() {
        presenter.requestAction3();
    }

    @Override
    public void postResult3(String result) {
        view3.setText(result);
    }

    @Override
    public void cachePresenter(Presenter presenter) {
        Cache.getInstance().cachePresenterFor(presenter.getUuid(), presenter);
    }

    @Override
    public void restorePresenter(UUID uuid) {
        presenter = (XPresenter) Cache.getInstance().restorePresenterFor(uuid);
        presenter.setScreen(this);
    }
}