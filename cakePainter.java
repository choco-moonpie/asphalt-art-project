import org.code.neighborhood.*;

public class cakePainter extends PainterPlus {

/* ------------------ paintOuterLayers ------------------
   * 📄 Paints the lighter and outer layers of the cake by 
   *    moving horizontally and turning when necessary.
   * --------------------------------------------------
   */
  
  public void paintOuterLayers(String color){
    move();
    turnRight();
    move();
    move();
    move();
    move();
    move();
    paint(color);
    turnLeft();
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    turnRight();
    move();
    move();
    move();
    move();
    move();
    paint(color);
    turnRight();
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
  }

/* ------------------ paintInnerLayers ------------------
   * 📄 Paints the darker and inner layers of the cake,
   *    by between the lighter cake layers, moving 
   *    horizontally and turning when necessary.
   * --------------------------------------------------
   */
  
  public void paintInnerLayers(String color){
  turnRight();
  move();
  paint(color);
  turnRight();
  move();
  paint(color);
  move();
  paint(color);
  move();
  paint(color);
  move();
  paint(color);
  move();
  paint(color);
  move();
  paint(color);
  move();
  paint(color);
  move();
  paint(color);
  move();
  paint(color);
  turnLeft();
  move();
  move();
  move();
  turnLeft();
  paint(color);
  move();
  paint(color);
  move();
  paint(color);
  move();
  paint(color);
  move();
  paint(color);
  move();
  paint(color);
  move();
  paint(color);
  move();
  paint(color);
  move();
  paint(color);
  move();
  paint(color);
  }

/* ------------------ paintFilling ------------------
   * 📄 Paints the cream filling between the two cake
   *    layers by moving similarly to the cake layer
   *    methods, moving horizontally and turning when
   *    necessary,only,making a thicker layer that is 
   *    on top of one another.
   * --------------------------------------------------
   */
  
 public void paintFilling(String color){
  turnLeft();
  move();
  paint(color);
  turnLeft();
  move();
  paint(color);
  move();
  paint(color);
  move();
  paint(color);
  move();
  paint(color);
  move();
  paint(color);
  move();
  paint(color);
  move();
  paint(color);
  move();
  paint(color);
  move();
  paint(color);
  turnRight();
  move();
  turnRight();
  paint(color);
  move();
  paint(color);
  move();
  paint(color);
  move();
  paint(color);
  move();
  paint(color);
  move();
  paint(color);
  move();
  paint(color);
  move();
  paint(color);
  move();
  paint(color);
  move();
  paint(color); 
}

/* ------------------ paintBerryFilling ------------------
   * 📄 Paints three cut strawberries in the filling of 
   *    the cake by moving horizantally, painting dashes.
   * --------------------------------------------------
   */
  
public void paintBerryFilling(String color){
  turnAround();
  move();
  paint(color);
  move();
  paint(color);
  move();
  move();
  paint(color);
  move();
  paint(color);
  move();
  move();
  paint(color);
  move();
  paint(color);
  }

 /* ------------------ moveGoCorner ------------------
   * 📄 Moves the cakePainter to the bottom right corner.
   * --------------------------------------------------
   */
  
 public void moveGoCorner(){
  move();
  move();
  turnRight();
  move();
  move();
  move();
  turnRight();
  moveFast();
  turnAround();

}
}