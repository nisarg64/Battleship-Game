import java.util.Scanner;

/**
 * Created by nisarg on 10/31/15.
 */
public class BattleshipGame {
    public static int totalShips = 3;
    public static void main(String[] args) {
        Grid battlefield = new Grid(8,8);

        BattleShip[] battleships = new BattleShip[3];

        int[][] shipLocs1 = {{1,2}, {1,3}, {1,4}};
        battleships[0] = new BattleShip(shipLocs1, "Ship 1");

        int[][] shipLocs2 = {{3,2}, {4,2}, {5,2}};
        battleships[1] = new BattleShip(shipLocs2, "Ship 2");

        int[][] shipLocs3 = {{7,2}, {7,3}, {7,4}};
        battleships[2] = new BattleShip(shipLocs3, "Ship 3");

        Scanner inp = new Scanner(System.in);
        int x=0,y=0, cellValidity=0, count=0;
        boolean hitorkill = false;
        String status = "";
        System.out.println("Welcome to the 8*8 battlefield!!! Get ready tp battle with the best ships in the world!!");
        while(totalShips > 0){
            count++;
            hitorkill = false;
            System.out.println("\nEnter a battlefield co-ordinates to strike:");
            x = inp.nextInt();
            y = inp.nextInt();
            cellValidity = battlefield.checkGridCells(x,y);
            if(cellValidity==0){
                for(int i = 0; i < battleships.length; i++){
                    status = battleships[i].strikeStatus(x, y);
                    if(!status.equals("It's a Miss!")){
                        hitorkill = true;
                        System.out.println(status);
                        if(!status.equals("It's a Hit!")){
                            System.out.println("It's a Kill!");
                            System.out.println(totalShips + " ships left on the battlefield!");
                        }
                        break;
                    }
                }
                if(!hitorkill)
                    System.out.println("It's a Miss!");
            }else if(cellValidity == 1) {
                System.out.println("Co-ordinates already bombed!!");
            }else{
                System.out.println("Co-ordinates are out of bounds of the battlefield. Battlefield is an 8*8 grid with (x,y) co-ordinates from (1,1) to (8,8)!!");
            }
        }
        System.out.println("Congratulations! You have won this battle using "+count+" missiles!!");
        if(count>8){
            System.out.println("You can do better!! Try it again!!");
        }else{
            System.out.println("Wow you are awesome!!");
        }
    }
}
