public class TestMyRect {
  public static void main(String[] args) {
    MyPoint p1 = new MyPoint(1, 1);
    MyPoint p2 = new MyPoint(4, 4);
    MyRectangle r1 = new MyRectangle(p1, p2);
    System.out.println();
    System.out.println(r1);
    System.out.println("Area is " + r1.getArea());
    System.out.println("Perimeter is " + r1.getPerimeter());
    System.out.println();
  }
}
