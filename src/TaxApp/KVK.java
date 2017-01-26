package TaxApp;

/**
 * Created by arash on 1/24/17.
 */
public class KVK {
    public int rsin;
    public String id;
    public String legal_form;
    public String bussiness_address;
    public String registered_office;
    public int employee_count;
    public String url;
    public SBI sbi;


    public KVK() {
        this.sbi = new SBI();
    }
}
