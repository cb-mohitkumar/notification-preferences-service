package com.cb.notificationpreferencesservice.repos.config;

import com.cb.notificationpreferencesservice.beans.config.CbConfig;
import com.cb.notificationpreferencesservice.beans.enums.ConfigType;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CbConfigRepo extends MongoRepository<CbConfig, String> {
    CbConfig findByType(ConfigType type);
}
