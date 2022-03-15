package BankSystem;

import java.util.ArrayList;
import java.util.List;
//import java.util.concurrent.CopyOnWriteArrayList;


public class Logger {
    private static final List<Log> logs = new ArrayList<>();
    //    private static final List<Log> logs = new CopyOnWriteArrayList<>();
    private static Logger instance;

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public static List<Log> getLogs() {
        return logs;
    }

    public void addLog(Log log) {
        logs.add(log);
    }

    public void display() {
        System.out.println("----------------- Logger -----------------");
        for (int i = 0; i < logs.size(); i++) {
            System.out.println(logs.get(i));
        }
        // iterator for some reason crashes it?
//        for (Log log : logs) {
//            System.out.println(log);
//        }
//        for (Iterator<Log> iterator = logs.iterator(); iterator.hasNext(); ) {
//            Log log = iterator.next();
//            System.out.println(log);
//        }
        System.out.println("----------------- END -----------------");
    }

    @Override
    public String toString() {
        return "Logger{" +
                "logs=" + logs +
                '}';
    }
}
