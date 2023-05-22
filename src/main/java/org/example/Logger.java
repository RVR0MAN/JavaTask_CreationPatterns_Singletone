package org.example;


import java.util.Date;

public class Logger {

    private static Logger logger;
    protected int num = 1;

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void log(LogMessage msg) {
        System.out.print("[" + new Date() + " " + num++ + "] " + msg);
    }
}