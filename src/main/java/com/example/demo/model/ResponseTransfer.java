package com.example.demo.model;

public class ResponseTransfer {
    private String status;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }



    public ResponseTransfer()
    {

    }

    public ResponseTransfer(String status)
    {
        this.status = status;
    }

    public ResponseTransfer(String status, Object data) {
        this.status = status;
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // standard getters/setters
}
