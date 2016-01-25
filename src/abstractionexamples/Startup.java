package abstractionexamples;

/**
 *
 * @author Jennifer
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Banana banana = new Banana();
        // class reference, not object reference
        System.out.println(Banana.getGenus());
        //class reference
        System.out.println(Banana.getPLANT_TYPE());
        // why does it not want a class reference here? Domain is a static property like genus and planttype
        //banana inherits getDOMAIN from Fruit
        System.out.println(banana.getDOMAIN());
        banana.disperseSeeds();
        Apple apple = new Apple();
        apple.disperseSeeds();
        System.out.println(Apple.DOMAIN);
        Smaug smaug = new Smaug();
        smaug.setSpecies("Fire-Drake");
        smaug.getEra();
        System.out.println(smaug.getSpecies());
        System.out.println(smaug.getEra());
        smaug.setName("Name");
        System.out.println(smaug.getName());
        Dalek dalek = new Dalek(5, "Wisconsin", "1/2/2016", "base I don't recall", "origin, not sure", "Evil doers", "Dalek");
        dalek.isDangerous();
        System.out.println(dalek.getEnemy()); 
        LochNessMonster nessie = new LochNessMonster();
        System.out.println(nessie.isDomesticated());
        System.out.println(nessie.getHabitat());
        nessie.setEncounters(518);
        System.out.println(nessie.getEncounters());
    }

}
