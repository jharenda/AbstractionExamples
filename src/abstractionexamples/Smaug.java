
package abstractionexamples;

/**
 *
 * @author Jennifer
 */
public class Smaug extends Dragon {
    private String deathDate = "Novemeber, 1 TA 2770"; 
    private String vulnerability = "Underbelly";
    private String deathCause = "black arrow"; 
    
  

    public String getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(String deathDate) {
        this.deathDate = deathDate;
    }

    public String getVulnerability() {
        return vulnerability;
    }

    public void setVulnerability(String vulnerability) {
        this.vulnerability = vulnerability;
    }

    public String getDeathCause() {
        return deathCause;
    }

    public void setDeathCause(String deathCause) {
        this.deathCause = deathCause;
    }
    
    @Override 
    public void setName(String name){
        this.name = "Smaug";
    }
    @Override
    public void setIsWinged(boolean isWinged){
        isWinged = true; 
    }
    @Override
    public void setBreathType(String breathType){
        breathType = "fire";
    }
    @Override 
    public void setRealm(String realm){
        realm = "Lonely Mountain"; 
    }
    @Override
    public void setColor (String color){
        color = "red";
        
    }
    @Override 
    public void setEra (){
        era = "Third Age";
    }
    @Override
    public void performMagic(){
        System.out.println("Smaug-specific magic");
    }
    @Override
    public void setSpecies(String species){
        species = "Fire-Drake"; 
    }
   @Override public String getName(){
       return name; 
   }
    
    
}
