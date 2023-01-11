
import java.util.ArrayList;

public class Orchard {

    private ArrayList<String> vegetablesAvaliables = new ArrayList<String>();
    private int marketCapacity;

    public Orchard(int marketCapacity) {
        this.marketCapacity = marketCapacity;
    }

    public ArrayList<String> getBasket() {

        return vegetablesAvaliables;
    }
    

}
