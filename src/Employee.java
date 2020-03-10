public class Employee{
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee (int id, String firstName, String lastName, int salary){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.salary=salary;
    }


    public int getId (){
        return this.id;
    }

    public String getFirstName (){
        return this.firstName;
    }

    public String getLastName (){
        return this.lastName;
    }

    public String getName (){
        return this.firstName+" "+this.lastName;
    }

    public int getSalary (){
        return this.salary;
    }

    public void setSalary (int salary){
        this.salary=salary;
    }

    public int getAnnualSalary (){
        return this.salary * 12;
    }

    public int raiseSalary (int percent){
        return this.salary+(this.salary * percent / 100);
    }

    @Override
    public String toString (){
        return "Employee {"+
                "id="+this.id+
                ", firstName='"+this.firstName+'\''+
                ", lastName='"+this.lastName+'\''+
                ", salary="+this.salary+
                "}\n";
    }
}
