package com.codingsaint.learning.rxjava.utils;

import observables.ObservableUsingJust;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerUtil {

    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(ObservableUsingJust.class);

    public static void info(String message) {
        LOGGER.info(message);
    }

    public static void info(String message, Object param) {
        LOGGER.info(message, param);
    }
}
