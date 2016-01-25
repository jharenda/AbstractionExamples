
package abstractionexamples;

/**
 *
 * @author Jennifer
 */
public class Dalek implements Alien, Cyborg, UndocumentedLife {
    private final static String STATUS = "Evil"; 
    private String villainType = "hostile species";
    private String enemy = "The Doctor";
    private String objective = "Universal Domination";
    private int encounters; 
    private String encounterLocation;
    private String creationDate;
    private String baseSpecies;
    private String originLocation;
    private String occupation;
    private String species; 

    public Dalek(int encounters, String encounterLocation, String creationDate, String baseSpecies, String originLocation, String occupation, String species) {
        this.encounters = encounters;
        this.encounterLocation = encounterLocation;
        this.creationDate = creationDate;
        this.baseSpecies = baseSpecies;
        this.originLocation = originLocation;
        this.occupation = occupation;
        this.species = species;
    }
    
    
    private void writePoetry(){
        System.out.println("Daleks like to write poetry.");
    }

    public String getVillainType() {
        return villainType;
    }

    public void setVillainType(String villainType) {
        this.villainType = villainType;
    }

    public String getEnemy() {
        return enemy;
    }

    public void setEnemy(String enemy) {
        this.enemy = enemy;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }
    @Override
    public void setEncounters(int encounters){
        this.encounters= encounters; 
    }
    @Override 
    public int getEncounters()
{
        return encounters; 
    }
    @Override
    public void setEncounterLocation(String encounterLocation){
        this.encounterLocation = encounterLocation; 
    }
    @Override
    public String getEncounterLocation() {
        return encounterLocation; 
    }
    @Override 
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
    @Override
    public String getCreationDate(){
        return creationDate; 
    }
    @Override
    public void setBaseSpecies(String baseSpecies) {
        this.baseSpecies = baseSpecies; 
    }
    @Override
    public String getBaseSpecies() {
        return baseSpecies; 
    }
    @Override
    public void setOriginLocation(String originLocation) {
        this.originLocation= originLocation; 
    }
    @Override
    public String getOriginLocation() {
        return originLocation; 
    }
    @Override
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    @Override
    public String getOccupation() {
        return occupation;
    }
    @Override
    public String getSpecies() {
        return species; 
    }
    @Override
    public void setSpecies(String species) {
        this.species = species; 
    }
    @Override
    public void isDangerous(){
        System.out.println("YES");
    }
    @Override
    public void visitEarth() {
        System.out.println("Dalek visits Earth");
    }
            
}
