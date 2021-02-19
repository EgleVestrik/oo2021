public class House {
    //Street name
    public String streetName;
    //street nr
    public int streetnr;
    //Apartment number
    public int apartmentNr;
    //building color
    private String buildColor = "blue";

    //    public GameCharacter(String name, GameCharacterType gameCharacterType){
    public House(String streetName, int streetnr, int apartmentNr){
        this.streetName=streetName;

        this.streetnr=streetnr;
        this.apartmentNr=apartmentNr;
    }
    public String getSecret(){
        return buildColor;
    }
    
    public void setSecret(String buildColor){
      this.buildColor = buildColor;
    }
    
}
