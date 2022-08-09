package com.cb.notificationpreferencesservice.services;

import com.cb.notificationpreferencesservice.beans.NotificationPreference;
import com.cb.notificationpreferencesservice.beans.dto.NotificationPreferenceCreateRequest;
import com.cb.notificationpreferencesservice.repos.NotificationPreferencesRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class NotificationPreferencesService {
    private final NotificationPreferencesRepo repo;

    public NotificationPreference createNotificationPreference(NotificationPreferenceCreateRequest request) {
        NotificationPreference notificationPreference = request.createNotificationPreference();
        return repo.save(notificationPreference);
    }

    public NotificationPreference getNotificationPreference(String customerId) {
        return repo.findByCustomerId(customerId);
    }
}
