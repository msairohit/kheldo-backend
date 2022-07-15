package com.play.games.kheldo.home.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.io.Serializable;

@JsonInclude(value = Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BaseResponse<T> implements Serializable {

    private static final long serialVersionUID = 4789817194546181984L;
    private String status;

    private String message;

    private String subCode;

    /*To Do
     if we want to send application error code and message then create errorVO object
     */
    private String error;

    private T response;

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public String getSubCode() {
        return subCode;
    }

    public String getError() {
        return error;
    }

    public T getResponse() {
        return response;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setSubCode(String subCode) {
        this.subCode = subCode;
    }

    public void setError(String error) {
        this.error = error;
    }

    public void setResponse(T response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "BaseResponse{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +
                ", subCode='" + subCode + '\'' +
                ", error='" + error + '\'' +
                ", response=" + response +
                '}';
    }
}
