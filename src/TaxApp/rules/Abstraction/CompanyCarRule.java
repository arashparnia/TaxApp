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

public class CompanyCarRule  extends BasicRule {

    private Company company;


    public CompanyCarRule(Company company) {
        super("CompanyCarRule", "CompanyCarRule ", 1);
        this.company = company;
    }

    @Condition
    public boolean evaluate() {
        return (
                company.comnpany_car.rdw.owner.equalsIgnoreCase(company.name)
        );
    }


    @Action
    public void execute(){
        System.out.println("Company.KvK.SBI.Product.PrivateUse =True;" );
        company.kvk.sbi.product.private_use =true;;

    }

}