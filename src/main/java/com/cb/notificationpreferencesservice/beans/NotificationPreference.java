package com.cb.notificationpreferencesservice.beans;

import com.cb.notificationpreferencesservice.beans.enums.NotificationType;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class NotificationPreference {
    @Id
    private String id;
    private String customerId;
    private List<NotificationType> preferredNotificationTypes;

    private Long preferredNotificationTime;
    private boolean dnd;
    //    private NotificationFrequency notificationFrequency;
    // Repetitive in every entity
    private Long createdTime;
    private Long lastModifiedTime;
    private String createdBy;
    private String lastModifiedBy;
}
