package com.example.tcm.util;

public class ApiException extends Exception {
    private ErrorCodeTO error;

    public ApiException(ErrorCodeTO error) {
        this.error = error;
    }

    public ErrorCodeTO getError() {
        return error;
    }

    public void setError(ErrorCodeTO error) {
        this.error = error;
    }
}
