import org.code.neighborhood.*;
public class toppingPainter extends PainterPlus {

  /* ------------------ paintTopping ------------------
   * 📄 Paints the topping/strawberry of of the cake by moving 
   *    in its predetermined directions (forward(move), left, 
   *    and right).
   * --------------------------------------------------
   */
  
  public void paintTopping(String color){
    move();
    move(); 
    move();
    move();
    move();
    move();
    turnRight();
    move();
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    turnLeft();
    move();
    paint(color);
    turnAround();
    move();
    turnRight();
    move();
    turnLeft();
    move();
    paint(color);
    move();
    turnLeft();
    move();
    paint(color);
    }

  /* ------------------ paintSeeds ------------------
   * 📄 Paints the seeds in the strawberry by filling
   *    in the missing spots in the strawberry.
   * --------------------------------------------------
   */
  
  public void paintSeeds(String color){
    turnLeft();
    move();
    paint(color);
    move();
    turnLeft();
    move();
    turnRight();
    move();
    paint(color);
    }

  /* ------------------ paintLeaf ------------------
   * 📄 Paints the leaf of the strawberry by moving
   *    and turning right to finish the cake topping.
   * --------------------------------------------------
   */
  
  public void paintLeaf(String color){
    move();
    turnRight();
    move();
    paint(color);
    }

 /* ------------------ moveCorner ------------------
   * 📄 Moves the toppingPainter to the bottom right corner.
   * --------------------------------------------------
   */
  
  public void moveCorner(){
    while (canMove()){
      move();
    }
    turnRight();
    moveFast();
    turnAround();
  }
}
  
