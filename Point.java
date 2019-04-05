/**
  Represent a point, using Cartesian coordinates
 */
public class Point implements Comparable{
    private double xcor;
    private double ycor;

    public int compareTo( Object otherObj){
        int distThis = (xcor * xcor) + (ycor * ycor);
	int distOther = (otherObj.xcor * otherObj.xcor) + (otherObj.ycor * otherObj.ycor);
	return distThis - distOther;
    }

    // -------- previously-written code ----------
    // constructor
    public Point( double xcor, double ycor) {
        this.xcor = xcor;
        this.ycor = ycor;
    }

    /**
      @return a string representation of this instance
     */
    public String toString() {
        return "(" + xcor + "," + ycor + ")";
    }

}
