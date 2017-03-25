package ro.ovidiuconeac.androidasynchronousmvpboilerpart.features.featurex.model;

/**
 * Created by www.ovidiuconeac.ro on 3/24/17.
 */

public final class Result {

    private String result;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Result result1 = (Result) o;

        return result != null ? result.equals(result1.result) : result1.result == null;

    }

    @Override
    public int hashCode() {
        return result != null ? result.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Result{" +
                "result='" + result + '\'' +
                '}';
    }
}
