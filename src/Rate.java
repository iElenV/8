import java.util.Arrays;


public class Rate extends Salary {


    public Rate(String surname, String name, String patronymic, String paySystem, int quantity, double PayPerDay) {
        super(surname, name, patronymic);
        PaySystem = "Ставка";
        this.quantity = quantity;
        payment = new double[quantity];
        Arrays.fill(payment, PayPerDay);
    }


    public Rate() {
    }
    public String GetName () {
        return super.GetName();
    }
    public String GetPayment() {
        return super.GetPayment();
    }

    public double GetSalary() {
        return super.GetSalary();
    }
}

