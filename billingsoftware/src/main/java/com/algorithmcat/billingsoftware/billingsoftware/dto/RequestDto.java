package com.algorithmcat.billingsoftware.billingsoftware.dto;

import java.util.Map;

public class RequestDto {

    Map<String,?> request;

    public Map<String, ?> getRequest() {
        return request;
    }

    public void setRequest(Map<String, ?> request) {
        this.request = request;
    }


    public RequestDto(Map<String, ?> request) {
        this.request = request;
    }
}
