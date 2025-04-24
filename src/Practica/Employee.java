package Practica;

public class Employee extends Person{

    public int EmployeeID;
    public int Salary;
    public String Department;

    public Employee(String FirstName, String LastName, String Department, String Occupation,String Salary, int EmployeeID) {
        super(FirstName, LastName, Department, Occupation, EmployeeID);
    }


}
