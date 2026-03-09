import java.util.ArrayList;

public class GameEnvironment {

    private double width;
    private double height;

    private ArrayList<GamePlayer> arrPlayer;
    private ArrayList<GameEnemy> arrEnemy;

    public GameEnvironment() {
        width = 999;
        height = 999;
        arrPlayer = new ArrayList<>();
        arrEnemy = new ArrayList<>();
    }

    public GameEnvironment(double width, double height) {
        this.width = width;
        this.height = height;
        arrPlayer = new ArrayList<>();
        arrEnemy = new ArrayList<>();
    }

    public void addPlayer(GamePlayer Kevin) {
        arrPlayer.add(Kevin);
    }

    public void removePlayer(GamePlayer Kevin) {
        arrPlayer.remove(Kevin);
    }

    public void getAllPlayer() {
        for (GamePlayer Kevin : arrPlayer) {
            System.out.println(Kevin);
        }
    }

    public void addEnemy(GameEnemy Ben) {
        arrEnemy.add(Ben);
    }

    public void removeEnemy(GameEnemy Ben) {
        arrEnemy.remove(Ben);
    }

    public void getAllEnemies() {
        for (GameEnemy Ben : arrEnemy) {
            System.out.println(Ben);
        }
    }

    public void Interaction() {
        if (arrPlayer == null || arrEnemy == null) {
            System.out.println("Player or enemy not sets");
        }
        for (int i = 0; i < arrPlayer.size(); i++) {
            for (int j = 0; j < arrEnemy.size(); j++) {
                if (arrPlayer.get(i).getY() != arrEnemy.get(j).getY()) {
                    System.out.println("Player: " + arrPlayer.get(i) + " and Enemy: " + arrEnemy.get(j) + "  not in the same Y position" );
                }
                if (EuclideanDistance(arrPlayer.get(i).getX(),arrPlayer.get(i).getY(),arrEnemy.get(j).getX(),arrEnemy.get(j).getY()) <2) {
                    System.out.println(
                        "Player: " + arrPlayer.get(i) + " Attacked"
                    );
                    System.out.println("Enemy: " + arrEnemy.get(j) + " loses");
                    removeEnemy(arrEnemy.get(j));
                } else {
                    System.out.println("==> Player " + arrPlayer.get(i));
                    arrPlayer.get(i).Run((int) Math.ceil(Math.random() * 10));
                    System.out.println("current x position =  " + arrPlayer.get(i).getX() + " <==" );
                }
            }
        }
    }

    public static int EuclideanDistance(int x1, int y1, int x2, int y2) {
        return (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}