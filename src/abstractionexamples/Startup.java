
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
    }
    
}

