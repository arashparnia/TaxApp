package TaxApp.rules.Match;

import TaxApp.Company;
import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.core.BasicRule;

/**
 * Created by arash on 1/26/17.
 */


public class Truth3a1Rule  extends BasicRule {

    private Company company;


    public Truth3a1Rule(Company company) {
        super("Truth3a1Rule", "Truth3a1Rule ", 3);
        this.company = company;
    }

    @Condition
    public boolean evaluate() {
        return (company.vatReturnClaim.truth_value_3a1 == false);

    }


    @Action
    public void execute() {
        company.vatReturnClaim.questions = company.vatReturnClaim.questions + "\nQuestion 3a1 \n" +
                "3a-1 Leveringen naar landen buiten de EU (uitvoer)\n" +
                "1. Een specificatie van de omzet per factuur.\n" +
                "2. Ik verzoek u kopiefacturen van de 5 hoogste bedragen mee te zenden \n"+
                "3. Van deze Kopiën de afschriften van de uitvoer te overleggen zoals: CMR-vrachtbreven,\n " +
                "connossementen, uitvoeraangiften uit de EU, betalingsbewijzen van de buitenlandse afnemer.\n" ;
    }
}






