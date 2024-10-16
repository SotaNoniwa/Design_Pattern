package org.example;

public abstract class Employee implements LeaveApprover {

    private String role;

    private LeaveApprover successor;

    public Employee(String role, LeaveApprover successor) {
        this.role = role;
        this.successor = successor;
    }

    @Override
    public String getApproverRole() {
        return role;
    }

    protected abstract boolean processRequest(LeaveApplication application);

    @Override
    public void processLeaveApplication(LeaveApplication application) {
        if (!processRequest(application) && successor != null) {
            successor.processLeaveApplication(application);
        }
    }
}
