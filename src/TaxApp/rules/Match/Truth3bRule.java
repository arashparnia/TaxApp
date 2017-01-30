package TaxApp.rules.Match;

import TaxApp.Company;
import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.core.BasicRule;

/**
 * Created by arash on 1/26/17.
 */


public class Truth3bRule  extends BasicRule {

    private Company company;


    public Truth3bRule(Company company) {
        super("Truth3bRule", "Truth3bRule ", 3);
        this.company = company;
    }

    @Condition
    public boolean evaluate() {
        return (company.vatReturnClaim.truth_value_3b == false);

    }


    @Action
    public void execute() {
        company.vatReturnClaim.questions = company.vatReturnClaim.questions + "\nQuestion 3b \n" +
                "3b Leveringen naar of diensten in landen binnen de EU\n" +
                "1. Een specificatie van de omzet per factuur\n" +
                "2. Ik verzoek u kopiefacturen van de 5 hoogste bedragen mee te zenden.\n";
    }
}









