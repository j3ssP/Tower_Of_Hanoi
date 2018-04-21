
package towersofhanoi;
import java.util.Scanner; 


public class TowersOfHanoi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.println("Enter number of disks: ");
        int n = input.nextInt();
        System.out.println("The moves are: ");
        moveDisks(n, 'A', 'B', 'C');
    }
    
    public static void moveDisks(int x, char fromTower, char toTower, char auxTower)
    {        
        
        if(x == 1)
        {            
            System.out.println("Move disk " + x + " from " + fromTower + " to "
            + toTower);
        }
        else
        {
            moveDisks(x - 1, fromTower, auxTower, toTower);           
            System.out.println("Move disk " + x + " from " + fromTower + " to " 
            + toTower);
            moveDisks(x - 1, auxTower, toTower, fromTower);
        }
    }
}