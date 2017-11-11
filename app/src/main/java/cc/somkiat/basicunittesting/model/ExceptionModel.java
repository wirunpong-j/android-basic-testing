package cc.somkiat.basicunittesting.model;

/**
 * Created by BellKunG on 11/11/2017 AD.
 */

public class ExceptionModel {
    private String message;
    private boolean result;

    public ExceptionModel() {

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }
}
