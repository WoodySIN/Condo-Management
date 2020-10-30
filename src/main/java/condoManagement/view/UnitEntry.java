package condoManagement.view;

import javafx.beans.property.SimpleStringProperty;

public class UnitEntry {
    SimpleStringProperty block;
    SimpleStringProperty unit;
    SimpleStringProperty name;
    SimpleStringProperty contact;

    public UnitEntry(String block, String unit, String name, String contact) {
        this.block = new SimpleStringProperty(block);
        this.unit = new SimpleStringProperty(unit);
        this.name = new SimpleStringProperty(name);
        this.contact = new SimpleStringProperty(contact);
    }

    public String getBlock() {
        return block.get();
    }

    public SimpleStringProperty blockProperty() {
        return block;
    }

    public void setBlock(String block) {
        this.block.set(block);
    }

    public String getUnit() {
        return unit.get();
    }

    public SimpleStringProperty unitProperty() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit.set(unit);
    }

    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getContact() {
        return contact.get();
    }

    public SimpleStringProperty contactProperty() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact.set(contact);
    }
}
