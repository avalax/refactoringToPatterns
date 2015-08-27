package session.eightteen.logging;

import java.util.ArrayList;
import java.util.List;

public class Nsa {
    private static List<String> log = new ArrayList<String>();
    private static boolean enabled;

    public static List<String> accessLog() {
        return log;
    }

    public static void log(String message) {
        if (enabled) {
            log.add(message);
        }
    }

    public static void enableLogging() {
        enabled = true;
    }

    public static boolean loggingEnabled() {
        return enabled;
    }
}
