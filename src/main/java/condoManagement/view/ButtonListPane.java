package condoManagement.view;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Region;

public class ButtonListPane extends UiPart<Region>{
    private static final String FXML = "ButtonListPane.fxml";

    @FXML
    private Button addUnitBtn;

    @FXML
    private Button deleteUnitBtn;

    @FXML
    private Button visitorLogBtn;

    public ButtonListPane() {
        super(FXML);
        addUnitBtn = new Button("Add Unit");
        deleteUnitBtn = new Button("Remove Unit");
        visitorLogBtn = new Button("View Visitor Log");
    }
}
