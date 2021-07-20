package com.manning.notification.preferences.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "notification_preferences")
public class NotificationPreferences {
    @Id
    @Column(name = "CUSTOMERID")
    private String customerId;
    @Column(name = "SMSPREFERENCEFLAG")
    private boolean smsPreferenceFlag;
    @Column(name = "EMAILPREFERENCEFLAG")
    private boolean emailPreferenceFlag;
    @Column(name = "EMAILADDRESS")
    private String emailAddress;
    @Column(name = "PHONENUMBER")
    private String phoneNumber;
}
