package TaxApp.rules.Abstraction;

import TaxApp.Company;
import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.core.BasicRule;

/**
 * Created by arash on 1/25/17.
 */
public class KvkDetailhandleRule extends BasicRule {

    private Company company;


    public KvkDetailhandleRule(Company company) {
        super("KvkDetailhandleRule", "KvkDetailhandleRule ", 1);
        this.company = company;
    }

    @Condition
    public boolean evaluate() {
        return (
                company.kvk.sbi.department == "Detailhandel (niet in auto’s)" && company.kvk.sbi.code <= 47.3
        );
    }


    @Action
    public void execute(){
        System.out.println(" HAS-ABSTRACTION Company.KvK.SBI.Product.Tarif = Low; ");
        company.kvk.sbi.product.tariff = "Low";
    }

}