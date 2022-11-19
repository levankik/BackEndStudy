package ge.softgen.softlab.tutorial.impl.logger;

import ge.softgen.softlab.tutorial.abstraction.BaseLogger;

import java.time.LocalDate;

public class ConsoleLogger extends BaseLogger {


    public ConsoleLogger(Level logLevel) {
        super(logLevel);
    }

    @Override
    public void log(Level level, Object object) {
        if (level.ordinal() >= logLevel.ordinal()) {
            System.out.printf("%s - %s - %s", LocalDate.now(), level, object.toString());
        }
    }
}

