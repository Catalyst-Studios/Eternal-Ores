package net.radzratz.eternalores.util;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.appender.FileAppender;
import org.apache.logging.log4j.core.config.Configuration;
import org.apache.logging.log4j.core.config.LoggerConfig;
import org.apache.logging.log4j.core.layout.PatternLayout;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class EOLoggers {
    private static final Map<String, Logger> BY_FILE = new ConcurrentHashMap<>();

    public static Logger get(String loggerName, String fileName) {
        return BY_FILE.computeIfAbsent(fileName, f -> create(loggerName, f));
    }

    private static Logger create(String loggerName, String fileName) {
        LoggerContext ctx = (LoggerContext) LogManager.getContext(false);
        Configuration config = ctx.getConfiguration();

        PatternLayout layout = PatternLayout.newBuilder()
                .withConfiguration(config)
                .withPattern("[%d{HH:mm:ss.SSS}] [%t/%level]: %msg%n")
                .build();

        FileAppender appender = FileAppender.newBuilder()
                .setName("EOFile_" + fileName)
                .withFileName("logs/eternalores/" + fileName + ".log")
                .withAppend(false)
                .setLayout(layout)
                .setConfiguration(config)
                .build();
        appender.start();
        config.addAppender(appender);

        LoggerConfig loggerConfig = new LoggerConfig(loggerName, Level.ALL, false);
        loggerConfig.addAppender(appender, Level.ALL, null);
        config.addLogger(loggerName, loggerConfig);

        ctx.updateLoggers();
        return LogManager.getLogger(loggerName);
    }
}