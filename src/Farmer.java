
public class Farmer extends Thread {

    private String name;
    private int maxGrowthTime;
    private int farmerProduction;
    private int maxVegetableProduced = 0;

    private Orchard orchart;

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
        this.orchart = orchart;
    }

}