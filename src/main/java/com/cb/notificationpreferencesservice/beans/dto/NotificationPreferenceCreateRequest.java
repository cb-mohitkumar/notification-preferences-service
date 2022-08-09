package com.cb.notificationpreferencesservice.beans.dto;

import com.cb.notificationpreferencesservice.beans.NotificationPreference;
import com.cb.notificationpreferencesservice.beans.enums.NotificationType;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

import static java.lang.System.currentTimeMillis;

@Data
public class NotificationPreferenceCreateRequest {
    @NotNull
    private String customerId;
    @NotBlank
    private List<NotificationType> preferredNotificationTypes;
    private boolean dnd;

    public NotificationPreference createNotificationPreference() {
        NotificationPreference notificationPreference = new NotificationPreference();
        notificationPreference.setCustomerId(customerId);
        notificationPreference.setDnd(dnd);
        notificationPreference.setPreferredNotificationTypes(preferredNotificationTypes);

        Long timestamp = currentTimeMillis();
        notificationPreference.setCreatedTime(timestamp);
        notificationPreference.setLastModifiedTime(timestamp);
        notificationPreference.setCreatedBy("Figure out the logged in user to implement this");
        notificationPreference.setLastModifiedBy("Figure out the logged in user to implement this");
        return notificationPreference;
    }
}
