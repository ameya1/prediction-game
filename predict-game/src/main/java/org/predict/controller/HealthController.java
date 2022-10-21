package org.predict.controller;

import org.predict.model.dto.HealthDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthController {

    @GetMapping("/")
    public ResponseEntity<HealthDTO> health() {
        HealthDTO healthDTO = HealthDTO.builder().message("Healthy").build();
        return ResponseEntity.ok(healthDTO);
    }
}
