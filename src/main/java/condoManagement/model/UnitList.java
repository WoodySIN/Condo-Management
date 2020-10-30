package condoManagement.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class UnitList {
    private final ObservableList<Unit> internalList = FXCollections.observableArrayList();

    public boolean contains(Unit toCheck) {
        return internalList.contains(toCheck);
    }

    public void add(Unit toAdd) {
        // need to implement exception if unit is already in the list
        internalList.add(toAdd);
    }

    public boolean remove(Unit toRemove) {
        return internalList.remove(toRemove);
    }

    public void setUnit(Unit target, Unit editedUnit) {
        internalList.set(internalList.indexOf(target), editedUnit);
    }

    public ObservableList<Unit> getInternalList() {
        return internalList;
    }

    @Override
    public int hashCode() {
        return internalList.hashCode();
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof UnitList // instanceof handles nulls
                && this.internalList.equals(((UnitList) other).internalList));

    }
}
