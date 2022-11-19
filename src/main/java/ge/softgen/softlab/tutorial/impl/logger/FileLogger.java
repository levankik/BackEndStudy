package ge.softgen.softlab.tutorial.impl.logger;

import ge.softgen.softlab.tutorial.abstraction.BaseLogger;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class FileLogger extends BaseLogger {

    public final String filePath;

    public FileLogger(Level logLevel, String filePath) {
        super(logLevel);
        this.filePath = filePath;
    }



    @Override
    public void log(Level level, Object object) {
        if (level.ordinal() >= logLevel.ordinal()) {
            //System.out.printf("%s - %s - %s", LocalDate.now(), level, object.toString());
            FileWriter writer = null;
            try {
                writer = new FileWriter(filePath, true);
                writer.append(
                        String.format("%s - %s - %s\n", LocalDateTime.now(), level, object.toString())
                );
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    if (writer != null) {
                    writer.close();
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }


}
