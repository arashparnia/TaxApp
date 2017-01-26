package TaxApp.rules.Regulation;

import TaxApp.Company;
import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.core.BasicRule;

/**
 * Created by arash on 1/26/17.
 */


public class Form4bRule  extends BasicRule {

    private Company company;


    public Form4bRule(Company company) {
        super("Form4bRule", "Form4bRule ", 2);
        this.company = company;
    }

    @Condition
    public boolean evaluate() {
        return ( !company.vatReturnClaim.vat_form_4b.isEmpty() );

    }


    @Action
    public void execute(){
        System.out.println("INDICATES  Company.VAT-Return-Claim.Vat-Return-Claim-Truth-Value.4b = True;" );
        company.vatReturnClaim.truth_value_4b= true;
    }

}