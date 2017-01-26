package TaxApp;

/**
 * Created by arash on 1/24/17.
 */
public class CompanyCar {
    String licence_plate;
    Person driven_by;
    RDW rdw;

    public CompanyCar(){
        this.driven_by = new Person();
        this.rdw = new RDW();
    }

}
