package TaxApp.rules.Match;

import TaxApp.Company;
import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.core.BasicRule;

/**
 * Created by arash on 1/26/17.
 */


public class Truth4aRule  extends BasicRule {

    private Company company;


    public Truth4aRule(Company company) {
        super("Truth4aRule", "Truth4aRule ", 3);
        this.company = company;
    }

    @Condition
    public boolean evaluate() {
        return (company.vatReturnClaim.truth_value_4a == false);

    }


    @Action
    public void execute() {
        company.vatReturnClaim.questions = company.vatReturnClaim.questions + "\nQuestion 4a \n" +
                "4a  Leveringen / diensten uit landen buiten de EU\n" +
                "1. Wat is de reden dat er een negatief bedrag is aangegeven?\n" +
                "2. Een specificatie van de omzet per factuur\n" +
                "3. Ik verzoek u kopiefacturen van de 5 hoogst inkomende facturen mee te zenden.\n " +
                "4. Van deze kopieën van de afschriften van de invoer te overleggen.\n";
    }
}

















