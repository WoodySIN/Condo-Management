package condoManagement.view;

import condoManagement.commons.Config;
import condoManagement.controller.Controller;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainWindow extends UiPart<Stage> {

    private static final String FXML = "MainWindow.fxml";
    private Stage stage;
    private Controller controller;
    private Config config;

    private ButtonListPane buttonListPane;
    private UnitListTable unitListTable;

    @FXML
    private StackPane buttonListPanePlaceholder;

    @FXML
    private StackPane unitListTablePlaceholder;

    public MainWindow(Stage primaryStage, Controller controller, Config config) {
        super(FXML, primaryStage);
        this.stage = primaryStage;
        this.controller = controller;
        this.config = config;

        setTitle(config.getAppTitle());
    }

    public Stage getPrimaryStage() {
        return stage;
    }

    void fillinnerParts() {
        buttonListPane = new ButtonListPane();
        buttonListPanePlaceholder.getChildren().add(buttonListPane.getRoot());
        unitListTable = new UnitListTable(controller.getFilteredUnitList());

    }
    private void setTitle(String appTitle) {
    }

    void show() {
        stage.show();
    }

}
