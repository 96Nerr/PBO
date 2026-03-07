public class GamePlayer {
    
    double height;
    double width;

    public GamePlayer(){

    }

    public GamePlayer(double height, double width){
        this.height = height;
        this.width = width;
    }

    public GamePlayer(double height, double width, int positionX, int positionY){
        this.height = height;
        this.width = width;
        this.positionX = positionX;
        this.positionY = positionY;
    }

}