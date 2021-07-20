package com.manning.notification.preferences.services;

import com.manning.notification.preferences.entities.NotificationPreferences;
import com.manning.notification.preferences.repositories.NotificationPreferencesRepo;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@Data
@AllArgsConstructor
public class NotificationPreferencesService {

    private final NotificationPreferencesRepo preferencesRepo;

    public ResponseEntity<NotificationPreferences> getNotificationPreferenceByCustomerId(String id) {
        final NotificationPreferences notificationPreferences = preferencesRepo.findByCustomerId(id);
        return ResponseEntity.ok(notificationPreferences);
    }
}
