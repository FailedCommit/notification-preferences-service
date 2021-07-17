package com.manning.notification.preferences.repositories;

import com.manning.notification.preferences.entities.NotificationPreferences;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationPreferencesRepo extends PagingAndSortingRepository<NotificationPreferences, String> {
    NotificationPreferences findByCustomerId(String customerId);
}
