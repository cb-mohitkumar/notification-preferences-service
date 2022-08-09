package com.cb.notificationpreferencesservice.repos;

import com.cb.notificationpreferencesservice.beans.NotificationPreference;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NotificationPreferencesRepo extends MongoRepository<NotificationPreference, String> {
    NotificationPreference findByCustomerId(String customerId);
}
