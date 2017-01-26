package TaxApp;

import java.util.Vector;

/**
 * Created by arash on 1/24/17.
 */
public class Company {
    public int id;
    public String name ;
    public int RSIN;
    public Person employee;
    public CompanyCar comnpany_car;

    public KVK kvk;
    public CustomerRegistery customerRegistery;

    public Company() {
        super();
        this.kvk = new KVK();
        this.customerRegistery = new CustomerRegistery();
        this.employee = new Person();

    }
}
