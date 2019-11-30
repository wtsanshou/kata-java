package ie.sanshou.refactor.model;

public class Movie {
    private int priceCode;
    private String title;

    public final static int REGULAR = 0;
    public final static int NEW_RELEASE = 1;
    public final static int CHILDREN = 2;

    public Movie(String title, int priceCode) {
        this.priceCode = priceCode;
        this.title = title;
    }

    public int getPriceCode() {
        return priceCode;
    }

    public String getTitle() {
        return title;
    }

    public double getCharge(int daysRented) {
        double result = 0;
        switch (getPriceCode()) {
            case Movie.REGULAR:
                result += 2;
                if (daysRented > 2)
                    result += (daysRented - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                result += daysRented * 3;
                break;
            case Movie.CHILDREN:
                result += 1.5;
                if (daysRented > 3)
                    result += (daysRented - 3) * 1.5;
                break;
        }
        return result;
    }
}
