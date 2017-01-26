package TaxApp.rules.Regulation;

import TaxApp.Company;
import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.core.BasicRule;

/**
 * Created by arash on 1/26/17.
 */


public class Form1dRule  extends BasicRule {

    private Company company;


    public Form1dRule(Company company) {
        super("Form1dRule", "Form1dRule ", 2);
        this.company = company;
    }

    @Condition
    public boolean evaluate() {
        float c ;
        if (company.vatReturnClaim.vat_form_1d != null && !company.vatReturnClaim.vat_form_1d.isEmpty() ) {
            c = Float.parseFloat(company.vatReturnClaim.vat_form_1d);
            return (
                    c > 0 && company.kvk.sbi.product.private_use == true

            );
        }
        else
            return false;


    }


    @Action
    public void execute(){
        System.out.println("INDICATES  Company.VAT-Return-Claim.Vat-Return-Claim-Truth-Value.1d = True;" );
        company.vatReturnClaim.truth_value_1d= true;
    }

}