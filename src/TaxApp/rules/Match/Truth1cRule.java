package TaxApp.rules.Match;

import TaxApp.Company;
import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.core.BasicRule;

/**
 * Created by arash on 1/26/17.
 */


public class Truth1cRule  extends BasicRule {

    private Company company;


    public Truth1cRule(Company company) {
        super("Truth1cRule", "Truth1cRule ", 3);
        this.company = company;
    }

    @Condition
    public boolean evaluate() {
        return (company.vatReturnClaim.truth_value_1c == false);

    }


    @Action
    public void execute() {
        company.vatReturnClaim.questions = company.vatReturnClaim.questions + "\nQuestion 1c \n"+
        "1c Leveringen / diensten belast met overige tarieven, behalve 0%\n"+
        "1. Een specificatie van de verschuldigde BTW per factuur.\n"+
        "2. Ik verzoek u kopiefacturen van de 5 hoogste bedragen aan BTW mee te zenden";


    }
}