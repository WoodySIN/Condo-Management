package condoManagement.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.time.LocalDateTime;
import java.util.stream.Collectors;

public class VisitorList {
    private final ObservableList<Visitor> internalList = FXCollections.observableArrayList();

    public VisitorList() {
        internalList.removeIf(visitor -> visitor.getExitTime().isBefore(LocalDateTime.now().minusMonths(3)));
    }

    public boolean contains(Visitor toCheck) {
        return internalList.contains(toCheck);
    }

    public void add(Visitor toAdd) throws SocialDistancingException {
        // need to implement exception if Visitor is already in the list
        if (getUnitCurrentVisitors(toAdd.getVisitingUnit()).size() >= 5) {
            throw new SocialDistancingException("Number of visitors should not exceed maximum of 5!");
        }
        internalList.add(toAdd);
    }

    public boolean remove(Visitor toRemove) {
        return internalList.remove(toRemove);
    }

    public void setVisitor(Visitor target, Visitor editedVisitor) {
        internalList.set(internalList.indexOf(target), editedVisitor);
    }

    public ObservableList<Visitor> getInternalList() {
        return internalList;
    }

    public ObservableList<Visitor> getUnitVisitors(String visitingUnit) {
        return internalList.stream().filter(visitor -> visitor.getVisitingUnit().equals(visitingUnit))
                .collect(Collectors.toCollection(FXCollections::observableArrayList));
    }

    public ObservableList<Visitor> getUnitCurrentVisitors(String visitingUnit) {
        return internalList.stream().filter(visitor -> visitor.getVisitingUnit().equals(visitingUnit)
                && visitor.getExitTime() == null)
                .collect(Collectors.toCollection(FXCollections::observableArrayList));
    }

    @Override
    public int hashCode() {
        return internalList.hashCode();
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof VisitorList // instanceof handles nulls
                && this.internalList.equals(((VisitorList) other).internalList));

    }
}
