package TaxApp.rules.Regulation;

import TaxApp.Company;
import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.core.BasicRule;

/**
 * Created by arash on 1/26/17.
 */


public class Form4aRule  extends BasicRule {

    private Company company;


    public Form4aRule(Company company) {
        super("Form4aRule", "Form4aRule ", 2);
        this.company = company;
    }

    @Condition
    public boolean evaluate() {
        return ( !company.vatReturnClaim.vat_form_4a.isEmpty()  && company.customerRegistery.import_licence == true);

    }


    @Action
    public void execute(){
        System.out.println("INDICATES  Company.VAT-Return-Claim.Vat-Return-Claim-Truth-Value.4a = True;" );
        company.vatReturnClaim.truth_value_4a= true;
    }

}