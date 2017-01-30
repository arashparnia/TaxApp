package TaxApp.rules.Match;

import TaxApp.Company;
import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.core.BasicRule;

/**
 * Created by arash on 1/26/17.
 */


public class Truth3cRule  extends BasicRule {

    private Company company;


    public Truth3cRule(Company company) {
        super("Truth3cRule", "Truth3cRule ", 3);
        this.company = company;
    }

    @Condition
    public boolean evaluate() {
        return (company.vatReturnClaim.truth_value_3c == false);

    }


    @Action
    public void execute() {
        company.vatReturnClaim.questions = company.vatReturnClaim.questions + "\nQuestion 3c \n" +
                "3c Installatie / afstandsverkopen in landen binnen de EU\n" +
                "1. een specificatie van de omzet per factuur\n" +
                "2. Ik verzoek u kopiefacturen van de 5 hoogste bedragen mee te zenden.\n";
    }
}












