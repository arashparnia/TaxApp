package TaxApp.rules.Regulation;

import TaxApp.Company;
import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.core.BasicRule;

/**
 * Created by arash on 1/26/17.
 */


public class Form2aRule  extends BasicRule {

    private Company company;


    public Form2aRule(Company company) {
        super("Form2aRule", "Form2aRule ", 2);
        this.company = company;
    }

    @Condition
    public boolean evaluate() {
        return ( !company.vatReturnClaim.vat_form_1a.isEmpty() );

    }


    @Action
    public void execute(){
        System.out.println("INDICATES  Company.VAT-Return-Claim.Vat-Return-Claim-Truth-Value.2a = True;" );
        company.vatReturnClaim.truth_value_2a= true;
    }

}