public class GameEnemy {
    
    double height;
    double width;
    int positionX;
    int positionY;

    public GameEnemy(){

    }

    public GameEnemy(double height, double width){
        this.height = height;
        this.width = width;
    }

    public GameEnemy(double height, double width, int positionX, int positionY){
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

    public int getX(){
        return this.positionX;
    }

    public int getY(){
        return this.positionY;
    }

}