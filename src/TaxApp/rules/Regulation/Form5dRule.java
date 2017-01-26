package TaxApp.rules.Regulation;

import TaxApp.Company;
import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.core.BasicRule;

/**
 * Created by arash on 1/26/17.
 */


public class Form5dRule  extends BasicRule {

    private Company company;


    public Form5dRule(Company company) {
        super("Form5dRule", "Form5dRule ", 2);
        this.company = company;
    }

    @Condition
    public boolean evaluate() {
        if (company.vatReturnClaim.vat_form_5c.isEmpty() || company.vatReturnClaim.vat_form_5c == null)
            return
                    false;
        else
            return (


                company.kvk.legal_form.equalsIgnoreCase("Eenmanszaak")
                &&
                        company.kvk.legal_form.equalsIgnoreCase("Maatschap")
                &&
                        company.kvk.legal_form.equalsIgnoreCase("VOF")
                &&
                        Float.parseFloat(company.vatReturnClaim.vat_form_5c) < 1883.00
                &&
                        Float.parseFloat(company.vatReturnClaim.vat_form_5c) >= 0
                &&
                       company.kvk.registered_office.equalsIgnoreCase("netherlands")
        );

    }


    @Action
    public void execute(){
        System.out.println("INDICATES  Company.VAT-Return-Claim.Vat-Return-Claim-Truth-Value.5d = True;" );
        company.vatReturnClaim.truth_value_5d= true;
    }

}