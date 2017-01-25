package TaxApp.rules;

import TaxApp.Company;
import TaxApp.KVK;
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
                (company.kvk.sbi.activity >=1 && company.kvk.sbi.activity <9)  ||
                (company.kvk.sbi.activity >= 10 && company.kvk.sbi.activity <33) ||
                (company.kvk.sbi.activity >= 35 && company.kvk.sbi.activity <37) ||
                (company.kvk.sbi.activity >= 41 && company.kvk.sbi.activity <45) ||
                (company.kvk.sbi.activity >=46 && company.kvk.sbi.activity<49) ||
                (company.kvk.sbi.activity == 56 || company.kvk.sbi.activity == 68 ) ||
                (company.kvk.sbi.activity == 77 )
                );
    }


    @Action
    public void execute(){
        System.out.println("activity type: Supplies");
        company.kvk.sbi.activity_type = "supplies";
    }

}