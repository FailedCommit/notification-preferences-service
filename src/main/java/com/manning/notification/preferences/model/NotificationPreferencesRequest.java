package com.manning.notification.preferences.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotificationPreferencesRequest {
    private String customerId;

    @Override
    public String toString() {
        return "NotificationPreferencesRequest{" +
                "customerId='" + customerId + '\'' +
                '}';
    }
}

