package TaxApp.rules.Regulation;

import TaxApp.Company;
import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.core.BasicRule;

/**
 * Created by arash on 1/26/17.
 */


public class Form1aRule  extends BasicRule {

    private Company company;


    public Form1aRule(Company company) {
        super("Form1aRule", "Form1aRule ", 2);
        this.company = company;
    }

    @Condition
    public boolean evaluate() {
        float c ;
        if (company.vatReturnClaim.vat_form_1a != null && !company.vatReturnClaim.vat_form_1a.isEmpty() ) {
            c = Float.parseFloat(company.vatReturnClaim.vat_form_1a);
            System.out.println(company.kvk.sbi.product.tariff);
            return (c > 0 && company.kvk.sbi.product.tariff.equalsIgnoreCase("high"));
        }
        else
            return false;


    }


    @Action
    public void execute(){
        System.out.println("INDICATES  Company.VAT-Return-Claim.Vat-Return-Claim-Truth-Value.1a = True;" );
        company.vatReturnClaim.truth_value_1a= true;
    }

}