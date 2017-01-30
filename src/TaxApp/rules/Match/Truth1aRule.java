package TaxApp.rules.Match;

import TaxApp.Company;
import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.core.BasicRule;

/**
 * Created by arash on 1/26/17.
 */


public class Truth1aRule  extends BasicRule {

    private Company company;


    public Truth1aRule(Company company) {
        super("Truth1aRule", "Truth1aRule ", 3);
        this.company = company;
    }

    @Condition
    public boolean evaluate() {
        return (company.vatReturnClaim.truth_value_1a == false);

    }


    @Action
    public void execute() {
        company.vatReturnClaim.questions = company.vatReturnClaim.questions +
                "\nQuestion 1a \n"+
                "1a Leveringen / diensten belast met laag tarief\n" +
                "1. Er is een bedrag aan negatieve omzet vermeld. Waar heeft het bedrag betrekking op?\n"+
                "2. Een specificatie van de omzet per factuur\n"+
                "3. Ik verzoek u kopieën van de oorspronkelijke en verbeterde facturen (creditnota’s) mee te zenden.\n"+
                "   Indien er creditnota’s zijn uitgereikt, zal ik contact opnemen met de \n "+
                "   wederpartij om de BTW-afdracht te verifiëren.";


    }
}