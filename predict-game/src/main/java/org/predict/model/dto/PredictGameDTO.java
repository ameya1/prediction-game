package org.predict.model.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@Builder
@ToString
public class PredictGameDTO {
    private String gameId;
    private Long userId;
    private Integer origin;
    private Integer bound;
}
