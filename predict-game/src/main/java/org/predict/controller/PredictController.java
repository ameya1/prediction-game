package org.predict.controller;

import org.predict.model.dto.PredictGameDTO;
import org.predict.service.PredictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/predict")
public class PredictController {

    @Autowired
    private PredictService predictService;

    @PostMapping("/start")
    public ResponseEntity<PredictGameDTO> start() {
        PredictGameDTO predictGameDTO = predictService.startGame();
        return ResponseEntity.ok(predictGameDTO);
    }
}
