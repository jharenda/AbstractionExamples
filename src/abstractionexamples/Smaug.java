
package abstractionexamples;

/**
 *
 * @author Jennifer
 */
public class Smaug extends EuropeanDragon {
    private String deathDate = "Novemeber, 1 TA 2770"; 
    private String vulnerability = "Underbelly";
    private String deathCause = "black arrow"; 
    private String name; 
    private String breathType; 
    private boolean isWinged; 
    private String magicalQuality; 
    public String species; 

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
    public String getName() {
        return name; 
    }
    @Override
    public void setIsWinged(boolean isWinged){
        isWinged = true; 
    }
    @Override
    public boolean getIsWinged() {
        return isWinged; 
    }
    @Override
    public void setBreathType(String breathType){
        this.breathType = "fire";
    }
    @Override
    public String getBreathType() {
        return breathType; 
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
    public void performMagic(){
        System.out.println("Smaug-specific magic");
    }
    @Override
    public void setSpecies(String species){
        this.species = "Fire-Drake"; 
    }
    @Override
    public String getSpecies() {
        return species; 
    }
    @Override
    public void setMagicalQuality(String magicalQuality){
        this.magicalQuality = magicalQuality; 
    }
    @Override
    public String getMagicalQuality(){
        return magicalQuality; 
    }
  
}
