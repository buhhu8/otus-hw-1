package com.buhhu8.otushw1.controller;

import com.buhhu8.otushw1.dto.HealthResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/health")
public class HealthCheckController {

    @GetMapping
    public HealthResponse getHealthCheck(){
        return HealthResponse.builder().status("OK").build();
    }
}
