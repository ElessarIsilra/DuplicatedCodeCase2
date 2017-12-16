package case2;

import java.util.Date;

public class Alert {
    public final static int HIGH = 1;
    public final static int NORMAL = 0;
    public final static int LOW = -1;

    private double average;
    private int rating;
    private Date expiry;
    private Date maturity;
    private final int level;

    public void SetAverageExpiryRating(double average, int rating, Date expiry){
        this.average=average;
        this.expiry=expiry;
        this.rating=rating;
    }
    public void SetMaturity(Date maturity){
        this.maturity=maturity;
    }
    public Alert(double average, int rating, Date expiry) {
        SetAverageExpiryRating(average,rating,expiry);
        this.maturity = null;
        this.level = NORMAL;
    }

    public Alert(double average, int rating, Date expiry, Date maturity) {
        SetAverageExpiryRating(average,rating,expiry);
        SetMaturity(maturity);
        this.level = NORMAL;
    }

    public Alert(double average, int rating, Date expiry, Date maturity, int level) {
        SetAverageExpiryRating(average,rating,expiry);
        SetMaturity(maturity);
        this.level = level;
    }

    public double getAverage() {
        return average;
    }

    public int getRating() {
        return rating;
    }

    public Date getExpiry() {
        return expiry;
    }

    public Date getMaturity() {
        return maturity;
    }

    public boolean isHighLevel() {
        return level == HIGH;
    }

    public boolean isNormalLevel() {
        return level == NORMAL;
    }

    public boolean isLowLevel() {
        return level == LOW;
    }

}