public class PieceworkPay extends Salary {
    public PieceworkPay(String surname, String name, String patronymic, String paySystem, int quantity, double [] payment) {
        super(surname, name, patronymic);
        PaySystem = "Сдельная";
        this.quantity = quantity;
        this.payment = payment;
    }
    public PieceworkPay() {
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
