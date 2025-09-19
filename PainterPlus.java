import org.code.neighborhood.*;

public class PainterPlus extends Painter {
 // more methods to add here on tuesday

public void turnRight () {

turnLeft();
turnLeft();
turnLeft();

}  
  public void takeAllPaint() {
    while (isOnBucket()){
      takePaint();
    }
  
   }

  public void moveFast() {
    while (canMove()){
      move();

    }
  }

  public void paintToEmpty(String color) {
    while (hasPaint()){
    paint(color);
    move();  
    }
  }

  public void paintDonut(String color){
    while (hasPaint()){
    paint(color);
    move();
    paint(color);
    move();
    turnRight();

    }
  }
  public void turnAround() {
    turnLeft();
    turnLeft();
    }
  }
