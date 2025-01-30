public class onSiteWorker extends worker{
    private static double gasoline = 26; //Static means shared by all on site workers.

    public onSiteWorker(String name, String surname, double price) {
        super(name, surname, price);
    }

    @Override
    public double calculateSalary(int hoursWorked) {
        return super.calculateSalary(hoursWorked) * gasoline;
    }
}
