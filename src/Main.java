import com.solvd.taxi.person.Customer;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Customer customer=new Customer(380994542,"zlat",4.5f,"Pustovit Yevgeniy","Kiev");
        System.out.println(customer.getCity());
    }
}