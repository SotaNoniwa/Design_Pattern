package org.example;

public class Client {
    public static void main(String[] args) {
        /* Using Class/Two-way adapter **/
        EmployeeClassAdapter adapter = new EmployeeClassAdapter();

        // 1 way: Adapter as Employee since adapter class extends Employee class
        populateEmployeeData(adapter);

        BusinessCardDesigner designer = new BusinessCardDesigner();
        // 2 way: Adapter as Customer since adapter class implements Customer interface
        String card = designer.designCard(adapter);

        System.out.println(card);

        System.out.println("*************************");
        /* Using Object adapter (preferable) **/
        Employee employee = new Employee();
        populateEmployeeData(employee);
        EmployeeObjectAdapter objectAdapter = new EmployeeObjectAdapter(employee);
        card = designer.designCard(objectAdapter);
        System.out.println(card);
    }

    private static void populateEmployeeData(Employee employee) {
        employee.setFullName("Mad Hatter");
        employee.setJobTitle("Hat creator");
        employee.setOfficeLocation("New York");
    }
}