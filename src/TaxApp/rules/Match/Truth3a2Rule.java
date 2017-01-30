package TaxApp.rules.Match;

import TaxApp.Company;
import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.core.BasicRule;

/**
 * Created by arash on 1/26/17.
 */


public class Truth3a2Rule  extends BasicRule {

    private Company company;


    public Truth3a2Rule(Company company) {
        super("Truth3a2Rule", "Truth3a2Rule ", 3);
        this.company = company;
    }

    @Condition
    public boolean evaluate() {
        return (company.vatReturnClaim.truth_value_3a2 == false);

    }


    @Action
    public void execute() {
        company.vatReturnClaim.questions = company.vatReturnClaim.questions + "\nQuestion 3a2 \n" +
                "3a-2 Leveringen naar landen buiten de EU (uitvoer)\n" +
                "1.   Ik verzoek u om een korte omschrijving van de bedrijfsactiviteiten op te nemen,\n " +
                "     een kopie van het KvK uittreksel is niet voldoende.\n" ;
    }
}







