import java.util.*;
public class Patient{
    private HashMap<String,Integer> map;

    public Patient() {
        this.map = new HashMap<>();
    }

    public void enterRecord(String name, int sugarLevel) {
        if(!map.containsKey(name)) {
            map.put(name,sugarLevel);
        }
    }

    public int lookUp(String name) {
        if (map.containsKey(name)) {
            return map.get(name);
        } 
        return -1;
    }
    public static void main(String[] args) {
        Patient patient1 = new Patient();

        patient1.enterRecord("Apple",50);
        patient1.enterRecord("French Fries", 120);
        patient1.enterRecord("Hamburger", 170);
        System.out.println("Patient 1's food record: ");
        System.out.println("French Fries: " + patient1.lookUp("French Fries"));
        System.out.println("Apple: " + patient1.lookUp("Apple"));
        System.out.println("Hamburger: " + patient1.lookUp("Hamburger"));

        Patient patient2 = new Patient();

        patient2.enterRecord("Fried Chicken", 200);
        patient2.enterRecord("Banana", 70);
        patient2.enterRecord("Pizza",125);
        System.out.println("Patient 2 's food record: ");
        System.out.println("Pizza: " + patient2.lookUp("Pizza"));
        System.out.println("Banana: " + patient2.lookUp("Banana"));
        System.out.println("Fried Chicken: " + patient2.lookUp("Fried Chicken"));
    }
}
