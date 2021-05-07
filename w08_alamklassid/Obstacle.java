public class Obstacle extends WorldObject{
    public GameCharacter(int x, int y , String name, char symbol){
        super(x,y,name,symbol);
    }

    @Override
    public String getDefiniion(){
        return "I'm an obstacle";
    }
}
