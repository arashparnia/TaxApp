package TaxApp;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;


/**
 * Created by arash on 1/25/17.
 */
@Rule(name = "my awesome rule" )
public class KvkRule {

    @Condition
    public boolean when() {
        return true;
    }

    @Action
    public void then() {
        System.out.println("Easy Rules rocks!");
    }
}