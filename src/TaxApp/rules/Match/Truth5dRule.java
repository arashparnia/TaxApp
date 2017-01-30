package TaxApp.rules.Match;

import TaxApp.Company;
import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.core.BasicRule;

/**
 * Created by arash on 1/26/17.
 */


public class Truth5dRule  extends BasicRule {

    private Company company;


    public Truth5dRule(Company company) {
        super("Truth5dRule", "Truth5dRule ", 3);
        this.company = company;
    }

    @Condition
    public boolean evaluate() {
        return (company.vatReturnClaim.truth_value_5d == false);

    }


    @Action
    public void execute() {
        company.vatReturnClaim.questions = company.vatReturnClaim.questions + "\nQuestion 5d \n" +
                "5d Vermindering volgens de kleineondernemersregeling\n" +
                "1.  In de aangifte omzetbelasting is door u de vermindering volgens kleineondernemersregeling (hierna: KOR) toegepast.\n " +
                "Het toepassen van de KOR kan tot een vermindering van het bedrag aan af te dragen omzetbelasting leiden.\n " +
                "Om te toetsen of de KOR op een juiste wijze is toegepast verzoek \n" +
                "ik u om aan te geven waarom u denkt recht te hebben op de aftrek en hoe u aan het bedrag komt wat aangegeven staat. \n" ;
    }
}























