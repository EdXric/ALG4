package fundamentals;

import edu.princeton.cs.algs4.In;

import java.util.Date;

/**
 * Created by Edric on 17/1/9.
 */
class SmartDate {
    private final int month;
    private final int day;
    private final int year;

    public SmartDate(int m, int d, int y) {
        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (d > 0 && d <= 31) {
                    month = m;
                    day = d;
                    year = y;
                } else {
                    throw new IllegalArgumentException("Illegal date");
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (d > 0 && d <= 30) {
                    month = m;
                    day = d;
                    year = y;
                } else {
                    throw new IllegalArgumentException("Illegal date");
                }
                break;
            case 2:
                if (d % 4 == 0 && d % 100 != 0 || d % 400 == 0) {
                    if (d > 0 && d <= 29) {
                        month = m;
                        day = d;
                        year = y;
                    } else {
                        throw new IllegalArgumentException("Illegal date");
                    }
                } else {
                    if (d > 0 && d <= 28) {
                        month = m;
                        day = d;
                        year = y;
                    } else {
                        throw new IllegalArgumentException("Illegal date");
                    }
                }
                break;
            default:
                throw new IllegalArgumentException("Illegal date");
        }
    }
    public int month() { return month; }
    public int day() { return day; }
    public int year() { return year; }
    public String toString() { return month() + "/" + day() + "/" + year(); }
    public boolean equals(Object x) {
        if (this == x) return true;
        if (x == null) return false;
        if (this.getClass() != x.getClass()) return false;
        SmartDate that = (SmartDate) x;
        if (this.day != that.day) return false;
        if (this.month != that.month) return false;
        if (this.year != that.year) return false;
        return true;
    }
}
public class E1_2_11_SmartDate {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);
        try {
            SmartDate date = new SmartDate(m, d, y);
            System.out.println(date);
            System.out.println();
        }catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
