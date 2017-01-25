package TaxApp.rules;

import TaxApp.Company;
import TaxApp.KVK;
import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.core.BasicRule;

/**
 * Created by arash on 1/25/17.
 */
public class KvkServiceRule extends BasicRule {

    private Company company;


    public KvkServiceRule(Company company) {
        super("KvkServiceRule", "kvk service rule ", 1);
        this.company = company;
    }

    @Condition
    public boolean evaluate() {
        return (
                (company.kvk.sbi.activity ==9) ||
                (company.kvk.sbi.activity>=33 && company.kvk.sbi.activity<35) ||
                (company.kvk.sbi.activity >=37 && company.kvk.sbi.activity <41) ||
                (company.kvk.sbi.activity ==45) ||
                (company.kvk.sbi.activity  >=49 && company.kvk.sbi.activity <56) ||
                (company.kvk.sbi.activity >=57 && company.kvk.sbi.activity < 68) ||
                (company.kvk.sbi.activity>=69 && company.kvk.sbi.activity <77) ||
                (company.kvk.sbi.activity >77)
        );
    }


    @Action
    public void execute(){
        System.out.println("activity type: Service");
        company.kvk.sbi.activity_type = "service";
    }

}