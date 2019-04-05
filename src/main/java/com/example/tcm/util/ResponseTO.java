package com.example.tcm.util;

public class ResponseTO {
    private boolean success = true;
    private ErrorCodeTO error;
    private Object result;
    private String ticket;

    public ResponseTO() {
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public ErrorCodeTO getError() {
        return error;
    }

    public void setError(ErrorCodeTO error) {
        this.error = error;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }
}
