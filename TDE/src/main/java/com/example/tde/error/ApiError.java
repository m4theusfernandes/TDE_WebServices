package com.example.tde.error;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.Instant;
import java.util.HashMap;

@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class ApiError {
    private int status;
    private String message;
    private Long timestamp;
    private String path;

    private HashMap<String, String> validacaoErrorCampos;

    public ApiError() {
    }

    public ApiError(int status, String message, String path) {
        this.status = status;
        this.message = message;
        this.path = path;
        this.timestamp = Instant.now().toEpochMilli();
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Long getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
    public String getPath() {
        return path;
    }
    public void setPath(String path) {
        this.path = path;
    }

    public HashMap<String, String> getValidacaoErrorCampos() {
        return validacaoErrorCampos;
    }

    public void setValidacaoErrorCampos(HashMap<String, String> validacaoErrorCampos) {
        this.validacaoErrorCampos = validacaoErrorCampos;
    }

}
