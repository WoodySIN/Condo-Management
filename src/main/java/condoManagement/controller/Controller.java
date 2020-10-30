package condoManagement.controller;

import condoManagement.model.Unit;
import condoManagement.model.Visitor;
import javafx.collections.ObservableList;

public interface Controller {

    QueryResult execute(String commandText);

    /** Returns an unmodifiable view of the filtered list of persons */
    ObservableList<Unit> getFilteredUnitList();

    /** Returns an unmodifiable view of the filtered list of tasks */
    ObservableList<Visitor> getFilteredVisitorList();

}
