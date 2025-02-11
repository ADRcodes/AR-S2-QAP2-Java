

public class TestMyLine {
  public static void main(String[] args) {
    MyPoint p1 = new MyPoint(3, 4);
    MyPoint p2 = new MyPoint(5, 6);
    MyLine l1 = new MyLine(p1, p2);
    
    System.err.println();
    System.out.println(l1);
    System.out.println("Length is: " + l1.getLength());
    System.out.println("Gradient is: " + l1.getGradient());
    System.err.println();
    System.out.println("Setting new values for the line:");
    l1.setBeginX(1);
    l1.setBeginY(2);
    l1.setEndX(10);
    l1.setEndY(20);
    System.out.println(l1);
    System.err.println();
    System.out.println("Setting new values for the line:");
    l1.setBeginXY(5, 6);
    l1.setEndXY(7, 8);
    System.out.println(l1);
    System.err.println();
  }
}
