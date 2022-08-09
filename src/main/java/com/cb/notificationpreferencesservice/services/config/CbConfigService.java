package com.cb.notificationpreferencesservice.services.config;

import com.cb.notificationpreferencesservice.beans.config.CbConfig;
import com.cb.notificationpreferencesservice.beans.dto.config.ConfigCreateRequest;
import com.cb.notificationpreferencesservice.beans.enums.ConfigType;
import com.cb.notificationpreferencesservice.repos.config.CbConfigRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CbConfigService {
    private final CbConfigRepo configRepo;

    public CbConfig createCBEmailConfig(ConfigCreateRequest request) {
        return configRepo.save(request.createCBConfig());
    }

    public CbConfig getConfig(ConfigType type) {
        return configRepo.findByType(type);
    }
}
