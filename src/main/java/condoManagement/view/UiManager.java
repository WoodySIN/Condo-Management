package condoManagement.view;

import condoManagement.commons.Config;
import condoManagement.controller.Controller;
import javafx.stage.Stage;

public class UiManager implements Ui{
    private Controller controller;
    private MainWindow mainWindow;
    private Config config;

    public UiManager(Controller controller, Config config) {
        super();
        this.controller = controller;
        this.config = config;
    }

    @Override
    public void start(Stage primaryStage) {
        mainWindow = new MainWindow(primaryStage, controller, config);
        mainWindow.show();
        mainWindow.fillinnerParts();
    }
}
