package ge.softgen.softlab.tutorial.abstraction;

public abstract class BaseLogger implements Logger {
    protected final Level logLevel;

    protected BaseLogger(Level logLevel) {
        this.logLevel = logLevel;
    }
    @Override
    public Level getLogLevel() {
        return logLevel;
    }
    @Override
    public void info(Object object) {
        log (Level.INFO, object);
    }

    @Override
    public void warn(Object object) {
        log(Level.WARN, object);
    }

    @Override
    public void error(Object object) {
        log(Level.ERROR, object);
    }
}
