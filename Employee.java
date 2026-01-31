public class Employee{
    int id;
    String name;
    String designation;
    double bsal;
    double totalSalary;

    void calculateSalary() {
        double allowance = bsal * 0.20;
        totalSalary = bsal + allowance;
    }

    @Override
    public String toString() {
        return "Employee ID: " + id +
               "\nName: " + name +
               "\nDesignation: " + designation +
               "\nBasic Salary: " + bsal +
               "\nTotal Salary: " + totalSalary +
               "\n-----------------------";
    }
}
