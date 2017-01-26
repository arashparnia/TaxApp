package TaxApp.rules.Regulation;

import TaxApp.Company;
import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.core.BasicRule;

/**
 * Created by arash on 1/26/17.
 */


public class Form5eRule  extends BasicRule {

    private Company company;


    public Form5eRule(Company company) {
        super("Form5eRule", "Form5eRule ", 2);
        this.company = company;
    }

    @Condition
    public boolean evaluate() {
        if (company.vatReturnClaim.vat_form_5g.isEmpty() || company.vatReturnClaim.vat_form_5g == null)
            return
                    false;
        else
            return (
                        !company.vatReturnClaim.vat_form_5e.isEmpty()
                    &&
                        company.customerRegistery.est_permit == true
                    &&
                            Float.parseFloat(company.vatReturnClaim.vat_form_5g) >= 0
                    &&
                            company.customerRegistery.records !=null
            );

    }


    @Action
    public void execute(){
        System.out.println("INDICATES  Company.VAT-Return-Claim.Vat-Return-Claim-Truth-Value.5e = True;" );
        company.vatReturnClaim.truth_value_5e= true;
    }

}