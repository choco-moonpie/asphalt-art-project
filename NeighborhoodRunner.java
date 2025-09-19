import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

    cakePainter c = new cakePainter();
    toppingPainter t = new toppingPainter();
    BackgroundPainter b = new BackgroundPainter();
    b.setPaint(1000);
    c.setPaint(20);
    c.setPaint(68);
    t.setPaint(9);

    b.paintBackground("pink");

    if(t.hasPaint()){
    t.paintTopping("red");
    t.paintSeeds("DarkRed");
    t.paintLeaf("DarkGreen");
  }
    t.moveCorner();

    if (c.hasPaint()){
     c.paintOuterLayers("Wheat");
     c.paintInnerLayers("BurlyWood");
     c.paintFilling("white");
     c.paintBerryFilling("red");
    }
    c.moveGoCorner();
  }
}