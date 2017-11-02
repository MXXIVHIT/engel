package com.ksana.engel.common.model.response;

import lombok.Data;

@Data
public class OperationResponse {
    public enum ResponseStatusEnum {SUCCESS, ERROR, WARNING, NO_ACCESS};
    private ResponseStatusEnum  operationStatus;
    private String  operationMessage;
}
