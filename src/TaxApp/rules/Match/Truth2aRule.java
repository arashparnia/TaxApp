package TaxApp.rules.Match;

import TaxApp.Company;
import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.core.BasicRule;

/**
 * Created by arash on 1/26/17.
 */


public class Truth2aRule  extends BasicRule {

    private Company company;


    public Truth2aRule(Company company) {
        super("Truth2aRule", "Truth2aRule ", 3);
        this.company = company;
    }

    @Condition
    public boolean evaluate() {
        return (company.vatReturnClaim.truth_value_2a == false);

    }


    @Action
    public void execute() {
        company.vatReturnClaim.questions = company.vatReturnClaim.questions + "\nQuestion 2a \n" +
                "2a Leveringen / diensten waarbij de heffing van omzetbelasting naar u is verlegd\n" +
                "1. Een specificatie van de omzet per factuur\n" +
                "2. Ik verzoek u kopiefacturen van de 10 hoogste bedragen aan BTW verlegd mee te zenden \n";
    }
}




