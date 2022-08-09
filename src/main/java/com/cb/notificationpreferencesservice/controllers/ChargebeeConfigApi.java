package com.cb.notificationpreferencesservice.controllers;

import com.cb.notificationpreferencesservice.beans.config.CbConfig;
import com.cb.notificationpreferencesservice.beans.dto.config.ConfigCreateRequest;
import com.cb.notificationpreferencesservice.beans.enums.ConfigType;
import com.cb.notificationpreferencesservice.services.config.CbConfigService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/configs")
public class ChargebeeConfigApi {
    private final Logger logger = LoggerFactory.getLogger(ChargebeeConfigApi.class);
    private final CbConfigService configService;

    @PostMapping
    public ResponseEntity<CbConfig> createConfig(@RequestBody ConfigCreateRequest request) {
        logger.debug("Creating Chargebee config");
        return ResponseEntity.ok(configService.createCBEmailConfig(request));
    }

    @GetMapping("/type/{type}")
    public ResponseEntity<CbConfig> getConfigByType(@PathVariable ConfigType type) {
        logger.debug("Fetching Chargebee config for config Type: {}", type);
        return ResponseEntity.ok(configService.getConfig(type));
    }
}