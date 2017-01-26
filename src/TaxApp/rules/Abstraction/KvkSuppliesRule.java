package TaxApp.rules.Abstraction;

import TaxApp.Company;
import TaxApp.KVK;
import com.sun.deploy.security.ruleset.DefaultRule;
import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;
import org.easyrules.core.BasicRule;


/**
 * Created by arash on 1/25/17.
 */

public class KvkSuppliesRule  extends BasicRule {

    private Company company;


    public KvkSuppliesRule(Company company) {
        super("KvkSuppliesRule", "kvk supplies rule ", 1);
        this.company = company;
    }

    @Condition
    public boolean evaluate() {
        return (
                (company.kvk.sbi.code >=1 && company.kvk.sbi.code <9)  ||
                (company.kvk.sbi.code >= 10 && company.kvk.sbi.code <33) ||
                (company.kvk.sbi.code >= 35 && company.kvk.sbi.code <37) ||
                (company.kvk.sbi.code >= 41 && company.kvk.sbi.code <45) ||
                (company.kvk.sbi.code >=46 && company.kvk.sbi.code<49) ||
                (company.kvk.sbi.code == 56 || company.kvk.sbi.code == 68 ) ||
                (company.kvk.sbi.code == 77 )
                );
    }


    @Action
    public void execute(){
        System.out.println("activity type: Supplies" );
        company.kvk.sbi.product.activity_type = "supplies";

    }

}