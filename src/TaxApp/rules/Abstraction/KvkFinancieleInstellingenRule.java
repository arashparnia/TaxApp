package TaxApp.rules.Abstraction;

import TaxApp.Company;
import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.core.BasicRule;

/**
 * Created by arash on 1/26/17.
 */
public class KvkFinancieleInstellingenRule extends BasicRule {
    private Company company;


    public KvkFinancieleInstellingenRule(Company company) {
        super("KvkFinancieleInstellingenRule", "kvk service rule ", 1);
        this.company = company;
    }

    @Condition
    public boolean evaluate() {
        return (
                company.kvk.sbi.section == "Financiële Instellingen"
        );
    }


    @Action
    public void execute(){
        System.out.println(" HAS-ABSTRACTION company.kvk.sbi.product.tarif = High ");
        company.kvk.sbi.product.tariff = "High";
    }

}
