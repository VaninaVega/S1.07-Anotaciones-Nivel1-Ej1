public class worker {
protected String name;
protected String surname;
protected double priceByHour;

    public worker(String name, String surname, double price) {
        this.name = name;
        this.surname = surname;
        this.priceByHour = price;
    }

    public double calculateSalary(int hoursWorked){
        double salary = hoursWorked * priceByHour;
        return salary;
    }


//atributos nombre, apellido, precio/hora, y el método calcularSou()
    // que recibe por parámetro el número de horas trabajadas y lo multiplica por el precio/hora.
    // Las clases hijas deben sobreescribirlo, empleando @Override.
}
