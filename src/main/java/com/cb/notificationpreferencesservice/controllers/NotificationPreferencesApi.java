package com.cb.notificationpreferencesservice.controllers;

import com.cb.notificationpreferencesservice.beans.dto.NotificationPreferenceCreateRequest;
import com.cb.notificationpreferencesservice.beans.dto.NotificationPreferenceUpdateRequest;
import com.cb.notificationpreferencesservice.services.NotificationPreferencesService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/notification-preferences")
public class NotificationPreferencesApi {
    private final Logger logger = LoggerFactory.getLogger(NotificationPreferencesApi.class);
    private final NotificationPreferencesService preferencesService;

    @PostMapping
    public ResponseEntity<Object> create(@RequestBody NotificationPreferenceCreateRequest request) {
        logger.debug("Creating notification preferences for customerId: {}", request.getCustomerId());
        return ResponseEntity.ok(preferencesService.createNotificationPreference(request));
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<Object> get(@PathVariable String customerId) {
        logger.debug("Fetching notification preferences for customerId: {}", customerId);
        return ResponseEntity.ok(preferencesService.getNotificationPreference(customerId));
    }

    @PutMapping
    public ResponseEntity<Object> update(@RequestBody NotificationPreferenceUpdateRequest request) {
        logger.debug("Updating notification preferences for customerId: {}", request.getCustomerId());
        return ResponseEntity.ok(request.getPreferredNotificationTypes());
    }

    @DeleteMapping("/{customerId}")
    public ResponseEntity<Object> delete(@PathVariable String customerId) {
        logger.debug("Soft Deleting notification preferences for customerId: {}", customerId);
        return ResponseEntity.ok("Deleted Preferences for customerId: " + customerId);
    }
}
