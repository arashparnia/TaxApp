package TaxApp;

/**
 * Created by arash on 1/24/17.
 */
public class Person {
    int id;
    String first_name;
    String last_name;
    String fucntion;

    public Person(int id, String first_name, String last_name, String fucntion) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.fucntion = fucntion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFucntion() {
        return fucntion;
    }

    public void setFucntion(String fucntion) {
        this.fucntion = fucntion;
    }
}
