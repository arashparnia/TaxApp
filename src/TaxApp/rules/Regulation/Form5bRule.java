package TaxApp.rules.Regulation;

import TaxApp.Company;
import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.core.BasicRule;

/**
 * Created by arash on 1/26/17.
 */


public class Form5bRule  extends BasicRule {

    private Company company;


    public Form5bRule(Company company) {
        super("Form5bRule", "Form5bRule ", 2);
        this.company = company;
    }

    @Condition
    public boolean evaluate() {
        return ( company.vatReturnClaim.vat_form_5b.isEmpty() );

    }


    @Action
    public void execute(){
        System.out.println("INDICATES  Company.VAT-Return-Claim.Vat-Return-Claim-Truth-Value.5b = True;" );
        company.vatReturnClaim.truth_value_5b= true;
    }

}