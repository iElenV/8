import java.util.Arrays;

public class HourlyPay extends Salary {


    public HourlyPay (String surname, String name, String patronymic, String paySystem, int quantity, double PayPerHour) {
        super(surname,name, patronymic);
        this.PaySystem = "Часовая";
        this.quantity = quantity;
        payment = new double[quantity];
        Arrays.fill(payment, PayPerHour);
    }
    public String GetName () {
        return super.GetName();
    }
    public String GetPayment() {
        return super.GetPayment();
    }
    @Override
    public double GetSalary() {
        return super.GetSalary();
    }
}
