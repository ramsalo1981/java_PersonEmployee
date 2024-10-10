public class Employee extends Person{

double Salary;
 String Rank;
 String Job;

public Employee(){

}

    public Employee(String name, int age, String address, String nationality,
                    double salary, String rank, String job) {
        super(name, age, address, nationality);
        Salary = salary;
        Rank = rank;
        Job = job;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public void setRank(String rank) {
        Rank = rank;
    }

    public void setJob(String job) {
        Job = job;
    }

    public double getSalary() {
        return Salary;
    }

    //final to prevent to override the method
    /*public final double  getSalary() {
        return Salary;
    }*/

    public String getRank() {
        return Rank;
    }

    public String getJob() {
        return Job;
    }
}
