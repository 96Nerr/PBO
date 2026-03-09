public class GamePlayer {
    
    double height;
    double width;
    int positionX;
    int positionY;

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

    public void setDimension(double height, double width){
        this.height = height;
        this.width = width;
    }

    public void setPosition(int positionX, int positionY){
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public double getHeight(){
        return this.height;
    }

    public double getWidth(){
        return this.width;
    }

    public int getX(){
        return this.positionX;
    }

    public int getY(){
        return this.positionY;
    }

    public void Run(){
        System.out.println("Player is running");
    }

    public void Run(int incrementX){
        this.positionX += incrementX;
        System.out.println("Player still running..... current X position = " + this.positionX);
    }

}