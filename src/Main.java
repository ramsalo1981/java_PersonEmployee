import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Salaried_Employee sal1 = new Salaried_Employee("rami",20,
                "jon","swe",1000,"dd","it",200,500);

        System.out.println(sal1.getSalary());
        }
    }
