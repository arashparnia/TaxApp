package TaxApp.rules.Regulation;

import TaxApp.Company;
import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.core.BasicRule;

/**
 * Created by arash on 1/26/17.
 */


public class Form1eRule  extends BasicRule {

    private Company company;


    public Form1eRule(Company company) {
        super("Form1eRule", "Form1eRule ", 2);
        this.company = company;
    }

    @Condition
    public boolean evaluate() {
        float c ;
        if (company.vatReturnClaim.vat_form_1e != null && !company.vatReturnClaim.vat_form_1e.isEmpty() ) {
            c = Float.parseFloat(company.vatReturnClaim.vat_form_1e);
            return (
                    c > 0 && (company.kvk.sbi.product.tariff.equalsIgnoreCase("none")  || company.kvk.sbi.code <= 3)

            );
        }
        else
            return false;


    }


    @Action
    public void execute(){
        System.out.println("INDICATES  Company.VAT-Return-Claim.Vat-Return-Claim-Truth-Value.1e = True;" );
        company.vatReturnClaim.truth_value_1e= true;
    }

}