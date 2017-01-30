package TaxApp.rules.Regulation;

import TaxApp.Company;
import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.core.BasicRule;

/**
 * Created by arash on 1/26/17.
 */


public class Form3a1Rule  extends BasicRule {

    private Company company;


    public Form3a1Rule(Company company) {
        super("Form3a1Rule", "Form3a1Rule ", 2);
        this.company = company;
    }

    @Condition
    public boolean evaluate() {
        return ( company.vatReturnClaim.vat_form_3a.isEmpty()  );

    }


    @Action
    public void execute(){
        System.out.println("INDICATES  Company.VAT-Return-Claim.Vat-Return-Claim-Truth-Value.3a2 = True;" );
        company.vatReturnClaim.truth_value_3a1= true;
    }

}