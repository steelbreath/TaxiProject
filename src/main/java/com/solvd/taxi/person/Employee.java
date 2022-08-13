package main.java.com.solvd.taxi.person;

public abstract class Employee extends Person {
    private int experience;
    private int salary;

    public Employee() {}

    public Employee(String fullName, String city, int experience, int salary) {
        super(fullName, city);
        if(experience<0){
            throw new ArithmeticException("Experience cannot be negative!");
        }else {
            this.experience = experience;
        }
        if(salary<0){
            throw new ArithmeticException("Salary cannot be negative!");
        }else {
            this.salary = salary;
        }
    }

    public void setExperience(int experience) {
        if(experience<0){
            throw new ArithmeticException("Experience cannot be negative!");
        }else {
            this.experience = experience;
        }
    }

    public int getExperience() {
        return experience;
    }

    public void setSalary(int salary) {
        if(salary<0){
            throw new ArithmeticException("Salary cannot be negative!");
        }else {
            this.salary = salary;
        }
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "experience=" + experience +
                ", salary=" + salary +
                "} " + super.toString();
    }
}
