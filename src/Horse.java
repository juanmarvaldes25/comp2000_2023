import java.awt.Color;
import java.awt.Graphics;

public class Horse extends Actor{
  Motif horseImage;
  Float phase;

  //constructor 
  public Horse(Cell inLoc, Boolean isHuman){
  super(inLoc, Color.BLUE, isHuman, 3);
  horseImage = new Motif("assets/Chess_tile_nl.png");
}

//paint method

public void paint(Graphics g){
  Float phase = AnimationBeat.getInstance().phaseCompletion() / 100.0f;
  horseImage.draw(g, (int) loc.getX(), (int) loc.getY(), Color.getHSBColor(phase, 0.5f, 1.0f));
}


protected void setPoly() {
  // TODO Auto-generated method stub
  phase = AnimationBeat.getInstance().phaseCompletion() / 100.0f;
}
}
