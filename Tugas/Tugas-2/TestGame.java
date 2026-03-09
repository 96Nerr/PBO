public class TestGame{
    public static void main(String [] args){

        GamePlayer Player1 = new GamePlayer();
        Player1.setDimension(150, 85);
        Player1.setPosition(10, 7);

        GameEnemy Enemy1 = new GameEnemy();
        Enemy1.setDimension(150, 85);
        Enemy1.setPosition(5, 5);

        Player1.Run(10);
        System.out.println("Player1 position X = " + Player1.getX() + " position Y = " + Player1.getY());

        Enemy1.Run();
        System.out.println("Enemy1 position X = " + Enemy1.getX() + " position Y = " + Enemy1.getY());

    }
}