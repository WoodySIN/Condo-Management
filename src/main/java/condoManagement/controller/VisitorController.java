package condoManagement.controller;

import condoManagement.model.SocialDistancingException;
import condoManagement.model.Visitor;
import condoManagement.model.VisitorList;

public class VisitorController{
    private final VisitorList visitorList;

    public VisitorController(VisitorList visitorList) {
        this.visitorList = visitorList;
    }

    public void addVisitor(Visitor visitor) throws SocialDistancingException {
        visitorList.add(visitor);
    }

    public void removeVisitor(Visitor target) {
        visitorList.remove(target);
    }

    public void editVisitor(Visitor target, Visitor updatedVisitor) {
        visitorList.setVisitor(target, updatedVisitor);
    }

    public VisitorList getVisitorList() {
        return visitorList;
    }
}
