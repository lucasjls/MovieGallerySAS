package com.joaolucas.moviegalerysas.config.logger;

import com.joaolucas.moviegalerysas.config.logger.interfaces.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class LoggerImpl implements Logger {

    private final org.slf4j.Logger logger;

    public LoggerImpl(){
        this.logger = LoggerFactory.getLogger(this.getClass());
    }

    @Override
    public void info(String message) {
        logger.info(message);
    }

    @Override
    public void debug(String message) {
        logger.debug(message);
    }

    @Override
    public void error(String message) {
        logger.error(message);
    }
}