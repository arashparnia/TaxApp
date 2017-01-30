package TaxApp.rules.Match;

import TaxApp.Company;
import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.core.BasicRule;

/**
 * Created by arash on 1/26/17.
 */


public class Truth1eRule  extends BasicRule {

    private Company company;


    public Truth1eRule(Company company) {
        super("Truth1eRule", "Truth1eRule ", 3);
        this.company = company;
    }

    @Condition
    public boolean evaluate() {
        return (company.vatReturnClaim.truth_value_1e == false);

    }


    @Action
    public void execute() {
        company.vatReturnClaim.questions = company.vatReturnClaim.questions + "\nQuestion 1e \n" +
                "1e Leveringen / diensten belast met 0% of niet bij u belast\n" +
                "1. Een specificatie van de omzet per factuur\n" +
                "2. Ik verzoek u kopiefacturen van de 10 hoogste bedragen mee te zenden. \n";
    }
}