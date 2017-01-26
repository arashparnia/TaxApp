package TaxApp.rules.Abstraction;

import TaxApp.Company;
import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.core.BasicRule;

/**
 * Created by arash on 1/26/17.
 */
public class KvkLandbouwRule extends BasicRule {
    private Company company;


    public KvkLandbouwRule(Company company) {
        super("KvkLandbouwRule", " KvkLandbouwRule  ", 1);
        this.company = company;
    }

    @Condition
    public boolean evaluate() {
        return (
                company.kvk.sbi.section == "Landbouw, Bosbouw en Visserij"

        );
    }


    @Action
    public void execute(){
        System.out.println(" HAS-ABSTRACTION Company.KvK.SBI.Product.Tarif = High; ");
        company.kvk.sbi.product.tariff = "High";
    }

}
