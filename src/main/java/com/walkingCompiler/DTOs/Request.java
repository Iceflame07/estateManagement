package com.walkingCompiler.DTOs;

public class Request {

    private String request;
    private String message;
    private int OTP;

    public Request(String request, String message, int OTP) {
        this.request = request;
        this.message = message;
        this.OTP = OTP;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getOTP() {
        return OTP;
    }

    public void setOTP(int OTP) {
        this.OTP = OTP;
    }
}
