package condoManagement.controller;

import condoManagement.model.Unit;
import condoManagement.model.UnitList;

public class UnitController{
    private final UnitList unitList;

    public UnitController(UnitList unitList) {
        this.unitList = unitList;
    }

    public void removeUnit(Unit target) {
        unitList.remove(target);
    }

    public void addUnit(Unit unit) {
        unitList.add(unit);
    }

    public void editUnit(Unit target, Unit updatedUnit) {
        unitList.setUnit(target, updatedUnit);
    }

    public UnitList getUnitList() {
        return unitList;
    }
}
