package ro.ovidiuconeac.androidasynchronousmvpboilerpart.features.featurex.model;

import java.util.Random;

/**
 * Created by ovidiu on 12/29/16.
 */

public class XModel {

    private Random random;

    public XModel() {
        this.random = new Random();
    }

    // Use case "request action 1"
    public Result requestAction1() {
        Result result = new Result();
        result.setResult("Response 1 - " + random.nextInt(1000));
        return result;
    }

    // Use case "request action 2"
    public Result requestAction2() {
        Result result = new Result();
        result.setResult("Response 2 - " + random.nextInt(1000));
        return result;
    }

    // Use case "request action 3"
    public Result requestAction3() {
        Result result = new Result();
        result.setResult("Response 3 - " + random.nextInt(1000));
        return result;
    }
}
