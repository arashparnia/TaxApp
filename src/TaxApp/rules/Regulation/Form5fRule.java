package TaxApp.rules.Regulation;

import TaxApp.Company;
import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.core.BasicRule;

/**
 * Created by arash on 1/26/17.
 */


public class Form5fRule  extends BasicRule {

    private Company company;


    public Form5fRule(Company company) {
        super("Form5fRule", "Form5fRule ", 2);
        this.company = company;
    }

    @Condition
    public boolean evaluate() {
        if (company.vatReturnClaim.vat_form_5g.isEmpty() || company.vatReturnClaim.vat_form_5g == null)
            return
                    false;
        else
            return (
                    !company.vatReturnClaim.vat_form_5f.isEmpty()
                            &&
                            company.customerRegistery.est_permit == true
                            &&
                            Float.parseFloat(company.vatReturnClaim.vat_form_5g) >= 0
            );

    }


    @Action
    public void execute(){
        System.out.println("INDICATES  Company.VAT-Return-Claim.Vat-Return-Claim-Truth-Value.5f = True;" );
        company.vatReturnClaim.truth_value_5f= true;
    }

}