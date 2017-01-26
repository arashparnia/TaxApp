package TaxApp.rules.Abstraction;

import TaxApp.Company;
import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.core.BasicRule;

/**
 * Created by arash on 1/26/17.
 */
public class KvkAdviseringRule extends BasicRule {
    private Company company;


    public KvkAdviseringRule(Company company) {
        super("KvkAdviseringRule", " KvkAdviseringRule  ", 1);
        this.company = company;
    }

    @Condition
    public boolean evaluate() {
        return (
                company.kvk.sbi.section == "Advisering, onderzoek en overige specialistische zakelijke dienstverlening"
        );
    }


    @Action
    public void execute(){
        System.out.println(" HAS-ABSTRACTION Company.KvK.SBI.Product.Tarif = High; ");
        company.kvk.sbi.product.tarif = "High";
    }

}
