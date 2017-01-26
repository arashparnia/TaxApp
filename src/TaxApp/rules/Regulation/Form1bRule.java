package TaxApp.rules.Regulation;

import TaxApp.Company;
import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.core.BasicRule;

/**
 * Created by arash on 1/26/17.
 */


public class Form1bRule  extends BasicRule {

    private Company company;


    public Form1bRule(Company company) {
        super("Form1bRule", "Form1bRule ", 2);
        this.company = company;
    }

    @Condition
    public boolean evaluate() {
        float c ;
        if (company.vatReturnClaim.vat_form_1b != null && !company.vatReturnClaim.vat_form_1b.isEmpty() ){
            c = Float.parseFloat(company.vatReturnClaim.vat_form_1b );
            return ( c > 0 && company.kvk.sbi.product.tariff.equalsIgnoreCase("low"));
        }
        else
            return false;
    }


    @Action
    public void execute(){
        System.out.println("INDICATES  Company.VAT-Return-Claim.Vat-Return-Claim-Truth-Value.1b = True;" );
        company.vatReturnClaim.truth_value_1b= true;
    }

}