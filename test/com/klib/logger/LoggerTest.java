package com.klib.logger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LoggerTest {

    @Test
    public void testLogger() {
        Logger log = new Logger();
        log.info("test");
        assertEquals(1,1,"for trial only");
    }
}