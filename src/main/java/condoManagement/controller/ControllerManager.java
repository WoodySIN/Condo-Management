package condoManagement.controller;

import condoManagement.model.Model;
import condoManagement.model.Unit;
import condoManagement.model.Visitor;
import condoManagement.storage.Storage;
import javafx.collections.ObservableList;

public class ControllerManager implements Controller{
    public ControllerManager(Model model, Storage storage) {
    }

    // TODO: implement button on actions
    @Override
    public QueryResult execute(String commandText) {
        return null;
    }

    @Override
    public ObservableList<Unit> getFilteredUnitList() {
        return null;
    }

    @Override
    public ObservableList<Visitor> getFilteredVisitorList() {
        return null;
    }
}
