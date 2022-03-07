package BankSystem;

import java.util.ArrayList;
import java.util.List;

public class Logger {
    private static final List<Log> logs = new ArrayList<>();
    private static Logger instance = new Logger();

    private Logger() {
    }

    public static Logger getInstance() {
        return instance;
    }

    public static List<Log> getLogs() {
        return logs;
    }

    public void addLog(Log log) {
        this.logs.add(log);
    }

    public void display() {
        System.out.println("----------------- Logger -----------------");
        for (Log log : logs) {
            System.out.println(log);
        }
        System.out.println("----------------- END -----------------");
    }

    @Override
    public String toString() {
        return "Logger{}";
    }
}
