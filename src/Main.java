import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Rate Elen  = new Rate ("Вавилова", "Елена","Федоровна","Ставка", 4, 60);
        Rate Ann  = new Rate ("Петрова", "Анна","Николаевна","Ставка", 3, 30);
        HourlyPay Petya = new HourlyPay("Смирнов", "Петр", "Петрович", "Часовая", 5,100);
        HourlyPay Petya1 = new HourlyPay("Смирнов1", "Петр1", "Петрович1", "Часовая", 2,100);
        PieceworkPay Nikita = new PieceworkPay("Янин", "Никита", "Николаевич", "Сдельная", 5, new double[]{300, 20, 10, 5, 600});
        ArrayList <Salary> salary = new ArrayList<>();
        salary.add(0,Elen);
        salary.add(1,Ann);
        salary.add(2,Petya);
        salary.add(3,Nikita);
        salary.add(4,Petya1);
        double summa = 0;
        for (int i=0; i< salary.size(); i++) {
            System.out.println( "ФИО: " + salary.get(i).GetName() + " Вид оплаты: " + salary.get(i).GetPayment() + " Сумма: " + salary.get(i).GetSalary());
        }
        for (int i=0; i< salary.size(); i++) {
            summa = summa +salary.get(i).GetSalary();

        }
        System.out.println( "Итого: " + summa);

    }
}