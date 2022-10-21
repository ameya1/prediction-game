package org.predict.model;

import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@Builder
@ToString
public class PredictGame {
    private Long id;
    private String gameId;
    private Long userId;
    private LocalDateTime createdAt;
    private Integer generatedRandomNumber;
    private Integer origin;
    private Integer bound;
}
