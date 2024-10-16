package org.example;

import java.time.LocalDate;

public class Client {
    public static void main(String[] args) {
        LeaveApplication app = LeaveApplication.getBuilder().withType(LeaveApplication.Type.Sick)
                .from(LocalDate.now()).to(LocalDate.of(2024, 10, 17))
                .build();
        System.out.println(app);
        System.out.println("**********************");
        LeaveApprover approver = createChain();
        approver.processLeaveApplication(app);
        System.out.println(app);
    }

    // lead -> manager -> director
    private static LeaveApprover createChain() {
        Director director = new Director(null);
        Manager manager = new Manager(director);
        ProjectLead lead = new ProjectLead(manager);
        return lead;
    }
}