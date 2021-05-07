public class GameCharacter extends WorldObject {
    public GameCharacter(int x, int y , String name, char symbol){
        super(x,y,name,symbol);
    }

    @Overridepublic String getDefinition(){
        return "I'm a game character";
    }
}
