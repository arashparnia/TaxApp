package TaxApp.rules.Abstraction;

import TaxApp.Company;
import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.core.BasicRule;

/**
 * Created by arash on 1/25/17.
 */
public class KvkInformatieRule extends BasicRule {

    private Company company;


    public KvkInformatieRule(Company company) {
        super("KvkInformatieRule", "KvkInformatieRule ", 1);
        this.company = company;
    }

    @Condition
    public boolean evaluate() {
        return (
                company.kvk.sbi.section == "Informatie en communicatie" && company.kvk.sbi.code <= 62.03
        );
    }


    @Action
    public void execute(){
        System.out.println(" HAS-ABSTRACTION Company.KvK.SBI.Product.Tarif = High ");
        company.kvk.sbi.product.tariff = "High";
    }

}