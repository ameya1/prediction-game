package org.predict;

import lombok.extern.log4j.Log4j2;
import java.util.Random;

@Log4j2
public class GameMain {
    public static void main(String[] args) {
        Random random = new Random();
        for(int i = 0; i < 100; i++)
            log.info(random.ints(1, 100).findFirst().getAsInt());
    }
}
