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
}
