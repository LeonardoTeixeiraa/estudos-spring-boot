package com.leonardoteixeiraa.controle_de_usuarios.handler;

import java.util.Date;

public class ResponseError {
    private Date timestamp = new Date();
    private String status = "error";

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    private int statusCode = 404;
    private String error;
}
