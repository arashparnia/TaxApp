package TaxApp.rules.Regulation;

import TaxApp.Company;
import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.core.BasicRule;

/**
 * Created by arash on 1/26/17.
 */


public class Form3cRule  extends BasicRule {

    private Company company;


    public Form3cRule(Company company) {
        super("Form3cRule", "Form3cRule ", 2);
        this.company = company;
    }

    @Condition
    public boolean evaluate() {
        return ( !company.vatReturnClaim.vat_form_3c.isEmpty()  );

    }


    @Action
    public void execute(){
        System.out.println("INDICATES  Company.VAT-Return-Claim.Vat-Return-Claim-Truth-Value.3c = True;" );
        company.vatReturnClaim.truth_value_3c= true;
    }

}