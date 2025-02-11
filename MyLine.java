public class MyLine {
  private MyPoint begin = new MyPoint();
  private MyPoint end = new MyPoint();

  public MyLine(int x1, int y1, int x2, int y2) {
    begin.setXY(x1, y1);
    end.setXY(x2, y2);
  }

  public MyLine(MyPoint begin, MyPoint end) {
    this.begin = begin;
    this.end = end;
  }

  public MyPoint getBegin() {
    return begin;
  }

  public void setBegin(MyPoint begin) {
    this.begin = begin;
  }

  public MyPoint getEnd() {
    return end;
  }

  public void setEnd(MyPoint end) {
    this.end = end;
  }

  public int getBeginX() {
    return begin.getX();
  }

  public void setBeginX(int x) {
    begin.setX(x);
  }

  public int getBeginY() {
    return begin.getY();
  }

  public void setBeginY(int y) {
    begin.setY(y);
  }

  public int getEndX() {
    return end.getX();
  }

  public void setEndX(int x) {
    end.setX(x);
  }

  public int getEndY() {
    return end.getY();
  }

  public void setEndY(int y) {
    end.setY(y);
  }

  public int[] getBeginXY() {
    return begin.getXY();
  }

  public void setBeginXY(int x, int y) {
    begin.setXY(x, y);
  }

  public int[] getEndXY() {
    return end.getXY();
  }

  public void setEndXY(int x, int y) {
    end.setXY(x, y);
  }

  @Override
  public String toString() {
    return "MyLine[begin=" + begin + ",end=" + end + "]";
  }

  public double getLength() {
    return begin.distance(end);
  }

  public double getGradient() {
    return Math.atan2(end.getY() - begin.getY(), end.getX() - begin.getX());
  }

  public static void main(String[] args) {
    MyLine l1 = new MyLine(0, 0, 3, 4);
    System.out.println(l1);
    System.out.println("Length is: " + l1.getLength());
    System.out.println("Gradient is: " + l1.getGradient());
  }


}