package com.algorithmcat.billingsoftware.billingsoftware.dto;

public class ResponseDto<T> {

    T response;

    public T getResponse() {
        return response;
    }

    public void setResponse(T response) {
        this.response = response;
    }
}
