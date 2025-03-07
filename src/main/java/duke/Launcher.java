package duke;

import javafx.application.Application;

/**
 * A launcher class to workaround classpath issues.
 */
public class Launcher {
    /**
     * Launches the application with the given {@code args}.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Application.launch(Main.class, args);
    }
}
