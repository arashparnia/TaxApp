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
                (company.kvk.sbi.product.activity >=1 && company.kvk.sbi.product.activity <9)  ||
                (company.kvk.sbi.product.activity >= 10 && company.kvk.sbi.product.activity <33) ||
                (company.kvk.sbi.product.activity >= 35 && company.kvk.sbi.product.activity <37) ||
                (company.kvk.sbi.product.activity >= 41 && company.kvk.sbi.product.activity <45) ||
                (company.kvk.sbi.product.activity >=46 && company.kvk.sbi.product.activity<49) ||
                (company.kvk.sbi.product.activity == 56 || company.kvk.sbi.product.activity == 68 ) ||
                (company.kvk.sbi.product.activity == 77 )
                );
    }


    @Action
    public void execute(){
        System.out.println("activity type: Supplies" );
        company.kvk.sbi.product.activity_type = "supplies";

    }

}