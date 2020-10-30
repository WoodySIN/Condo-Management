package condoManagement.commons;

import condoManagement.CondoManagementApplication;
import javafx.scene.image.Image;

import static java.util.Objects.requireNonNull;


public class AppUtil {
    public static Image getImage(String imagePath) {
        requireNonNull(imagePath);
        return new Image(CondoManagementApplication.class.getResourceAsStream(imagePath));
    }

    /**
     * Checks that {@code condition} is true. Used for validating arguments to methods.
     *
     * @throws IllegalArgumentException if {@code condition} is false.
     */
    public static void checkArgument(Boolean condition) {
        if (!condition) {
            throw new IllegalArgumentException();
        }
    }

    /**
     * Checks that {@code condition} is true. Used for validating arguments to methods.
     *
     * @throws IllegalArgumentException with {@code errorMessage} if {@code condition} is false.
     */
    public static void checkArgument(Boolean condition, String errorMessage) {
        if (!condition) {
            throw new IllegalArgumentException(errorMessage);
        }
    }
}
