
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

    synchronized public void addVegetable(String farmerName, String vegetable) throws InterruptedException {

        while ( this.vegetablesAvaliables.size() >= this.marketCapacity ) {
            wait();
        }
        this.vegetablesAvaliables.add(vegetable);
        System.out.println(farmerName + " ha producido : " + vegetable);
        notifyAll();

    }

    synchronized public String consumeVegetable(String clientName) throws InterruptedException {

        while ( vegetablesAvaliables.size() == 0 ){
            wait();
        }

        String vegetableToConsume = this.vegetablesAvaliables.remove(0);
        notifyAll();

        return vegetableToConsume;
    }

}
