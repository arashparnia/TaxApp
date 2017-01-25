package TaxApp;

/**
 * Created by arash on 1/24/17.
 */
public class KVK {
    public int id;
    public String legal_form;
    public String address;
    public int employee_count;
    public String url;
    public SBI sbi;


    public KVK() {
        this.sbi = new SBI();
    }
}
