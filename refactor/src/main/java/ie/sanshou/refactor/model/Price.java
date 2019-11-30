package ie.sanshou.refactor.model;

public abstract class Price {
    abstract int getPriceCode();

    public double getCharge(int daysRented) {
        double result = 0;
        switch (getPriceCode()) {
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

class RegularPrice extends Price {

    @Override
    int getPriceCode() {
        return Movie.REGULAR;
    }

    @Override
    public double getCharge(int daysRented) {
        int result = 2;
        if (daysRented > 2)
            result += (daysRented - 2) * 1.5;
        return result;
    }
}

class NewReleasePrice extends Price {

    @Override
    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }
}

class ChildrenPrice extends Price {

    @Override
    int getPriceCode() {
        return Movie.CHILDREN;
    }
}
