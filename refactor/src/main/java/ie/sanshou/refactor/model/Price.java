package ie.sanshou.refactor.model;

public abstract class Price {
    abstract int getPriceCode();

    abstract double getCharge(int daysRented);
}

class RegularPrice extends Price {

    @Override
    int getPriceCode() {
        return Movie.REGULAR;
    }

    @Override
    public double getCharge(int daysRented) {
        return 2 + ((daysRented > 2) ? (daysRented - 2) * 1.5 : 0);
    }
}

class NewReleasePrice extends Price {

    @Override
    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    @Override
    public double getCharge(int daysRented) {
        return daysRented * 3;
    }
}

class ChildrenPrice extends Price {

    @Override
    int getPriceCode() {
        return Movie.CHILDREN;
    }

    @Override
    public double getCharge(int daysRented) {
        return 1.5 + ((daysRented > 3) ? (daysRented - 3) * 1.5 : 0);
    }
}
