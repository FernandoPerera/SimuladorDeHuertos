
public class Farmer extends Thread {

    private String name;
    private int maxGrowthTime;
    private int farmerProduction;
    private int maxVegetableProduced = 0;

    private Orchard orchard;

    private final String [] VEGETABLES = {
            "lettuce",
            "cabbage",
            "onion",
            "spinach",
            "potato",
            "celery",
            "asparagus",
            "radish",
            "broccoli",
            "artichoke",
            "tomato",
            "cucumber",
            "eggplant",
            "carrot",
            "green bean"
    };

    public Farmer(String name, int maxVegetableProduced, int maxGrowthTime, Orchard orchard) {
        this.name = name;
        this.maxVegetableProduced = maxVegetableProduced;
        this.farmerProduction = farmerProduction;
        this.maxGrowthTime = maxGrowthTime;
        this.orchard = orchard;
    }

    private String getVegetable() {
        return VEGETABLES[getRandomInt(VEGETABLES.length)];
    }

    private int getRandomGrowthTime() {
        return  (int) (Math.random() * ( this.maxGrowthTime - 1 ) + 1);
    }

    private int getRandomInt(int limitNumber){ return (int) Math.round((Math.random() * limitNumber)); }

    public void run() {

        System.out.println("\t *****************************************************");
        System.out.println("\t | Comenzando proceso de almacenamiento de vegetales |");
        System.out.println("\t *****************************************************\n");

        for (int i = 0; i < this.maxVegetableProduced; i++) {
            String vegetableProduced = this.getVegetable();

            try {
                Thread.sleep(this.getRandomGrowthTime() * 1000);
                this.orchard.addVegetable(this.name, vegetableProduced);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }

}