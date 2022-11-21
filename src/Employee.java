import java.util.ArrayList;
import java.util.Scanner;
class Employe{
    int code;
    String name;
    String designation;
    double salary;
    String companyName;
    long phnNo;
    String emailId;
    public Employe(int code, String name, String designation, double salary, String companyName, long phnNo, String emailId)
    {
        this.code = code;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.companyName = companyName;
        this.phnNo = phnNo;
        this.emailId = emailId;
    }
}
public class Employee {
    public static void main(String[] args) {
        ArrayList<Employe> earr = new ArrayList<Employe>();
        while (true) {
            System.out.println("Select an option \n 1 - Add an Employee \n 2 - View Employee \n 3 - Search an Employee \n" +
                    "4 - Delete an Employee \n 5 - Exit");
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            if (n == 5) {
                System.out.println("You are exiting from the program");
                System.exit(0);
            } else {
            }

            switch (n) {

                case 1:
                    System.out.println("Enter employee details  ");
                    Scanner obj = new Scanner(System.in);
                    System.out.println("enter employee code");
                    int ec = obj.nextInt();
                    System.out.println("Enter employee name");
                    String en = obj.next();
                    System.out.println("employee designation");
                    String ed = obj.next();
                    System.out.println("Enter the salary");
                    double es = obj.nextDouble();
                    System.out.println("Enter company name");
                    String cn = obj.next();
                    System.out.println("Enter phn No");
                    long pn = obj.nextLong();
                    System.out.println("Enter email Id");
                    String emid = obj.next();

                    Employe e = new Employe(ec, en, ed, es, cn, pn, emid);
                    earr.add(e);
                    break;
                case 2:
                    System.out.println("Employee Details Showing");
                    for (Employe emp : earr) {
                        System.out.println("Printing details of employee ");
                        System.out.println(emp.code);
                        System.out.println(emp.name);
                        System.out.println(emp.designation);
                        System.out.println(emp.salary);
                        System.out.println(emp.companyName);
                        System.out.println(emp.phnNo);
                        System.out.println(emp.emailId);
                    }
                    break;
                case 3 :
                    System.out.println("Enter the employee code");
                    Scanner obj1 = new Scanner(System.in);
                    int ecode1 = obj1.nextInt();
                    for (Employe e1 : earr) {
                        if (ecode1 == e1.code){
                            System.out.println("Details of employee with employee code " + ecode1 + "is ");
                            System.out.println(e1.code);
                            System.out.println(e1.name);
                            System.out.println(e1.designation);
                            System.out.println(e1.salary);
                            System.out.println(e1.companyName);
                            System.out.println(e1.phnNo);
                            System.out.println(e1.emailId);
                            break;
                        }
                        else {
                            System.out.println("No such employee found");
                        }
                    }
                    break;
                case 4 :
                    System.out.println("Enter the employee code");
                    Scanner obj2 = new Scanner(System.in);
                    int ecode2 = obj2.nextInt();
                    for (Employe e1 : earr){
                        if (ecode2 == e1.code){
                            earr.remove(e1);
                        }
                    }
                    break;
            }
        }
    }
}

