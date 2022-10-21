package org.predict.service;

import lombok.extern.log4j.Log4j2;
import org.predict.model.PredictGame;
import org.predict.model.dto.PredictGameDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.UUID;

@Service
@Log4j2
public class PredictService {

    @Autowired
    private Random random;

    public PredictGameDTO startGame() {
        PredictGame predictGame = createGame();
        log.info("Game Created : " + predictGame);
        return PredictGameDTO.builder()
                .gameId(predictGame.getGameId())
                .userId(predictGame.getUserId())
                .bound(predictGame.getBound() - 1)
                .origin(predictGame.getOrigin())
                .build();
    }

    public PredictGame createGame() {
        int origin = 1;
        int bound = 101;

        return PredictGame.builder()
                .gameId(generateGameId())
                .origin(origin)
                .bound(bound)
                .generatedRandomNumber(generateRandomNumber(origin, bound))
                .build();
    }

    public String generateGameId() {
        return UUID.randomUUID().toString();
    }


    private Integer generateRandomNumber(int origin, int bound) {
       return random.ints(1, 100).findFirst().getAsInt();
    }
}
