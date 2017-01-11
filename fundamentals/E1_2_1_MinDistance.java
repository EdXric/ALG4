package fundamentals;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.Interval2D;
import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdDraw;

/**
 * Created by Edric on 17/1/9.
 */
public class E1_2_1_MinDistance {
    public static void main(String[] args) {
        int pointNum = Integer.parseInt(args[0]);

        Interval1D xinterval = new Interval1D(0, 1);
        Interval1D yinterval = new Interval1D(0, 1);
        Interval2D box = new Interval2D(xinterval, yinterval);
        box.draw();

        Point2D[] point2Ds = new Point2D[pointNum];

        for (int t = 0; t < pointNum; t++) {
            double x = Math.random();
            double y = Math.random();
            Point2D p = new Point2D(x, y);

            StdDraw.setPenColor(StdDraw.BLUE);
            StdDraw.setPenRadius(0.02);

            p.draw();

            point2Ds[t] = p;
        }

        double minDistance = point2Ds[1].distanceTo(point2Ds[0]);
        Point2D minDistancePoint1 = point2Ds[0];
        Point2D minDistancePoint2 = point2Ds[1];

        for (int t = 2; t < pointNum; t++) {
            for (int s = 0; s < t - 1; s++){
                double tempMinDistance = point2Ds[t].distanceTo(point2Ds[s]);
                if ( tempMinDistance < minDistance) {
                    minDistance = tempMinDistance;
                    minDistancePoint1 = point2Ds[s];
                    minDistancePoint2 = point2Ds[t];
                }
            }
        }
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.setPenRadius(0.005);
        minDistancePoint1.drawTo(minDistancePoint2);
        System.out.println(minDistance);
    }
}
