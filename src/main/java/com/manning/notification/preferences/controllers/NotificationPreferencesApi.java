package com.manning.notification.preferences.controllers;

import com.manning.notification.preferences.entities.NotificationPreferences;
import com.manning.notification.preferences.model.NotificationPreferencesRequest;
import com.manning.notification.preferences.services.NotificationPreferencesService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(("/notification/preferences"))
@AllArgsConstructor
public class NotificationPreferencesApi {
    private final NotificationPreferencesService notificationPreferencesService;

    @GetMapping
    public ResponseEntity<NotificationPreferences> getNotificationPreferences(@RequestBody NotificationPreferencesRequest request) {
        return notificationPreferencesService.getNotificationPreferenceByCustomerId(request.getCustomerId());
    }
}
