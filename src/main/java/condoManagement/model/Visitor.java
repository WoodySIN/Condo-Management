package condoManagement.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Visitor {
    private String name;
    private String contact;
    private String visitingUnit;
    private String nRIC;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;

    public Visitor(String name, String contact, String visitingUnit,
                   String nRIC, LocalDateTime entryTime, LocalDateTime exitTime) {
        this.name = name;
        this.contact = contact;
        this.visitingUnit = visitingUnit;
        this.nRIC = nRIC;
        this.entryTime = entryTime;
        this.exitTime = exitTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getVisitingUnit() {
        return visitingUnit;
    }

    public void setVisitingUnit(String visitingUnit) {
        this.visitingUnit = visitingUnit;
    }

    public String getNRIC() {
        return nRIC;
    }

    public void setNRIC(String nRIC) {
        this.nRIC = nRIC;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Visitor visitor = (Visitor) o;
        return Objects.equals(contact, visitor.contact) &&
                Objects.equals(nRIC, visitor.nRIC);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contact, nRIC);
    }
}
