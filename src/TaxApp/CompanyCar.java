package TaxApp;

/**
 * Created by arash on 1/24/17.
 */
public class CompanyCar {
    public String licence_plate;
    public Person driven_by;
    public RDW rdw;

    public CompanyCar(){
        this.driven_by = new Person();
        this.rdw = new RDW();
    }

}
