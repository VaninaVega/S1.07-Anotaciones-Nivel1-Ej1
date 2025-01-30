//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        worker worker1 = new worker("Aiden","Pepee",1300);
        System.out.println("Salary: " + worker1.calculateSalary(160));

        onLineWorker onLineWorker1 = new onLineWorker("Markie","papaaaa", 1600);
        System.out.println("Salary: " + onLineWorker1.calculateSalary(160));

        onSiteWorker onSiteWorker1 = new onSiteWorker("Vani","Vega",1800);
        System.out.println("Salary: " + onSiteWorker1.calculateSalary(160));
        }
    }

