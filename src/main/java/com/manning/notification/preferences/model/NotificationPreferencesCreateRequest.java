package com.manning.notification.preferences.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotificationPreferencesCreateRequest {
    private String customerId;
    private boolean smsPreferenceFlag;
    private boolean emailPreferenceFlag;
    private String emailAddress;
    private String phoneNumber;
}

