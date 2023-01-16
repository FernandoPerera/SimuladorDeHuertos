public class Client extends Thread {

    private String clientName;
    private int maxToConsume;

    private final long CONSUMING_TIME;

    private Orchard orchard;

    public Client(String clientName, int maxToConsume, int CONSUMING_TIME, Orchard orchard) {
        this.clientName = clientName;
        this.maxToConsume = maxToConsume;
        this.orchard = orchard;
        this.CONSUMING_TIME = CONSUMING_TIME * 1000;
    }

    public void run() {

        for (int i = 0; i < this.maxToConsume; i++) {

            try {
                Thread.sleep(this.CONSUMING_TIME);
                this.orchard.consumeVegetable(this.clientName);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }

}
