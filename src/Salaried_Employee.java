public class Salaried_Employee extends Employee{
    private double Bonus;
    private double Deduction;

    public Salaried_Employee(){

    }

    public Salaried_Employee(String name, int age, String address, String nationality,
                             double salary, String rank, String job, double bonus, double deduction) {
        super(name, age, address, nationality, salary, rank, job);
        Bonus = bonus;
        Deduction = deduction;
    }

    public void setBonus(double bonus) {
        Bonus = bonus;
    }

    public void setDeduction(double deduction) {
        Deduction = deduction;
    }

    public double getBonus() {
        return Bonus;
    }

    public double getDeduction() {
        return Deduction;
    }

    @Override
    public double getSalary() {
        return Salary + Bonus - Deduction;
    }
}
