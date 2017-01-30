package TaxApp.rules.Match;

import TaxApp.Company;
import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.core.BasicRule;

/**
 * Created by arash on 1/26/17.
 */


public class Truth5bRule  extends BasicRule {

    private Company company;


    public Truth5bRule(Company company) {
        super("Truth5bRule", "Truth5bRule ", 3);
        this.company = company;
    }

    @Condition
    public boolean evaluate() {
        return (company.vatReturnClaim.truth_value_5b == false);

    }


    @Action
    public void execute() {
        company.vatReturnClaim.questions = company.vatReturnClaim.questions + "\nQuestion 5b \n" +
                "5b Voorbelasting\n" +
                "1. Een specificatie van de voorbelasting (rubriek 5-b) waarop de BTW van elke factuur afzonderlijk zichtbaar is. \n" +
                "   Dat kan bijvoorbeeld in de vorm van een uitdraai van de grootboekrekening(en) van de voorbelasting zonder verdichtingen. \n" +
                "   Wanneer het bedrag van de voorbelasting van de aangifte niet aansluit bij de specificatie, \n" +
                "   verzoek ik u een verklaring te geven voor het verschil met daarbij de berekeningen.\n" +
                "2. Kopieën van de 10 facturen met de hoogst bedragen voorbelasting.\n" +
                "3. Wanneer de voorbelasting (ook) betrekking heeft op de aankoop van onroerende zaken, \n" +
                "   verzoek ik u het onderstaande (in kopie) te overleggen/op te geven:\n" +
                "   a.  De factuur van de verkoper aan de koper.\n"+
                "   b.  De notariële afrekening (deze kan niet als factuur dienen).\n"+
                "   c.  De definitieve door de notaris gewaarmerkte notariële eigendomsakte.\n"+
                "   e.  Waarvoor wordt/zal de zaak worden gebruikt?\n"+
                "   e. (verwachte) datum van de (sleutel)overdracht.\n";
    }
}






















