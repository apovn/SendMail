package sendmail;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyLogger {

    public static final Logger logger = Logger.getLogger("MyLog");
    FileHandler fh;

    public MyLogger() {
        try {

            int limit = 10000000; // 10 Mb
            // This block configure the logger with handler and formatter
            fh = new FileHandler("SendMailLog.log", limit, 1, true);
            fh.setEncoding("UTF-8");
            logger.addHandler(fh);
            // logger.setLevel(Level.ALL);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);

            // the following statement is used to log any messages  
            //logger.info("My first log");  

        } catch (SecurityException | IOException e) {
        }
    }
}