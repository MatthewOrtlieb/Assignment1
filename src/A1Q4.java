
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ortlm8239
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create kitchener as a city
       City kitchener = new City();
       
       //create the two robots
       Robot matt = new Robot (kitchener,0,0,Direction.SOUTH);
       Robot tony = new Robot (kitchener,0,1,Direction.SOUTH);
        //create the walls
       new Wall(kitchener,0,1,Direction.WEST);
       new Wall(kitchener,1,1,Direction.WEST);
       new Wall(kitchener,1,1,Direction.SOUTH);
       //move robots
       matt.move();
       tony.move();
       matt.move();
       tony.turnLeft();
       matt.turnLeft();
       tony.move();
       matt.move();
       tony.turnLeft();
       tony.turnLeft();
       tony.turnLeft();
       tony.move();
       tony.turnLeft();
       tony.turnLeft();
       tony.turnLeft();
       tony.move();
       

       


       
       
      
      
              
       
       
       
       
       
       
       
       
       
       
       
    
      
    }
}
