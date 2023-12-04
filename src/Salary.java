public abstract class Salary extends Employee {

    public String PaySystem;
    public int quantity;
    public  double [] payment = new double[quantity];

    public  Salary(String surname, String name, String patronymic, String paySystem, int quantity, double[] payment) {
        super(surname, name, patronymic);
        PaySystem = paySystem;
        this.quantity = quantity;
        this.payment = payment;
    }


    public Salary() {
        super();
    }

    public Salary(String surname, String name, String patronymic) {
        this.Surname = surname;
        this.Name = name;
        this.Patronymic = patronymic;
    }

    public  String GetName() {

            return Surname + " " + Name + " " + Patronymic;
        }



    public  String GetPayment () {
        return PaySystem;
    }

    public double GetSalary() {
        double sum =0;
        for (double pay:payment) {
            sum+=pay;
        }
        return sum;
    }


    }


