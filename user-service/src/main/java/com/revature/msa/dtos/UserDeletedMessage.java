package com.revature.msa.dtos;

public class UserDeletedMessage {

    private String operation;
    private String initiator;
    private int resourceId;

    public UserDeletedMessage() {
        super();
    }

    public String getOperation() {
        return operation;
    }

    public UserDeletedMessage setOperation(String operation) {
        this.operation = operation;
        return this;
    }

    public String getInitiator() {
        return initiator;
    }

    public UserDeletedMessage setInitiator(String initiator) {
        this.initiator = initiator;
        return this;
    }

    public int getResourceId() {
        return resourceId;
    }

    public UserDeletedMessage setResourceId(int resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    @Override
    public String toString() {
        return "UserDeletedMessage{" +
                "operation='" + operation + '\'' +
                ", initiator='" + initiator + '\'' +
                ", resourceId=" + resourceId +
                '}';
    }

}
