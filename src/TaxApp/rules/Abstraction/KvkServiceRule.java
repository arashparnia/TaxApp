package TaxApp.rules.Abstraction;

import TaxApp.Company;
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
                (company.kvk.sbi.code ==9) ||
                (company.kvk.sbi.code>=33 && company.kvk.sbi.code<35) ||
                (company.kvk.sbi.code >=37 && company.kvk.sbi.code <41) ||
                (company.kvk.sbi.code ==45) ||
                (company.kvk.sbi.code  >=49 && company.kvk.sbi.code <56) ||
                (company.kvk.sbi.code >=57 && company.kvk.sbi.code < 68) ||
                (company.kvk.sbi.code>=69 && company.kvk.sbi.code <77) ||
                (company.kvk.sbi.code >77)
        );
    }


    @Action
    public void execute(){
        System.out.println("activity type: Service");
        company.kvk.sbi.product.activity_type = "service";
    }

}