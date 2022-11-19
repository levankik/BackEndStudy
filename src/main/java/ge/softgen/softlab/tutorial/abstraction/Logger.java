package ge.softgen.softlab.tutorial.abstraction;

import java.io.IOException;

public interface Logger {
    enum Level {
        INFO, WARN, ERROR
    }

    Level getLogLevel();

    void log(Level level, Object object);

    void info(Object object);

    void warn(Object object);

    void error(Object object);

}


