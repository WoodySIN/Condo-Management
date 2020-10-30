package condoManagement.view;

import condoManagement.model.Unit;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;

public class UnitListTable extends UiPart<Region> {
    private static final String FXML = "UnitListTable.fxml";

    @FXML
    private TableView unitListTable;

    @FXML
    private TableColumn blockCol;

    @FXML
    private TableColumn unitCol;

    @FXML
    private TableColumn nameCol;

    @FXML
    private TableColumn contactCol;

    public UnitListTable(ObservableList<Unit> unitList) {
        super(FXML);
        unitListTable = new TableView<UnitEntry>();
        blockCol = new TableColumn("Block Number");
        blockCol.setCellValueFactory(new PropertyValueFactory<>("block"));
        unitCol = new TableColumn("Unit Number");
        unitCol.setCellValueFactory(new PropertyValueFactory<>("unit"));
        nameCol = new TableColumn("Resident Name");
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        contactCol = new TableColumn("Resident Contact");
        contactCol.setCellValueFactory(new PropertyValueFactory<>("contact"));
        unitListTable.setItems(unitList);

    }

}
