package ie.sanshou.refactor;

import ie.sanshou.refactor.model.Customer;
import ie.sanshou.refactor.model.Movie;
import ie.sanshou.refactor.model.Rental;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {
    private static final Movie THE_HULK = new Movie("The Hulk", Movie.CHILDREN);
    private static final Movie IRON_MAN = new Movie("Iron Man 4", Movie.NEW_RELEASE);
    private static final Movie SPIDER_MAN = new Movie("Spiderman", Movie.REGULAR);

    private final Customer customer = new Customer("fred");

    @Test
    public void basicChildrenRental() {
        customer.addRental(new Rental(THE_HULK, 2));
        assertEquals(expectedMessageFor("The Hulk", 1.5, 1.5, 1), customer.statement());
    }

    @Test
    public void shouldDiscountChildrensRentals() {
        customer.addRental(new Rental(THE_HULK, 4));
        assertEquals(expectedMessageFor("The Hulk", 3.0, 3.0, 1), customer.statement());
    }

    @Test
    public void basicNewReleaseRental() {
        customer.addRental(new Rental(IRON_MAN, 1));
        assertEquals(expectedMessageFor("Iron Man 4", 3.0, 3.0, 1), customer.statement());

    }

    @Test
    public void shouldNotDiscountNewReleaseRentalsButBonusFrequentRenterPoints() {
        customer.addRental(new Rental(IRON_MAN, 4));
        assertEquals(expectedMessageFor("Iron Man 4", 12.0, 12.0, 2), customer.statement());
    }

    @Test
    public void basicRegularRental() {
        customer.addRental(new Rental(SPIDER_MAN, 2));
        assertEquals(expectedMessageFor("Spiderman", 2.0, 2.0, 1), customer.statement());
    }

    @Test
    public void shouldDiscountRegularRental() {
        customer.addRental(new Rental(SPIDER_MAN, 4));
        assertEquals(expectedMessageFor("Spiderman", 5.0, 5.0, 1), customer.statement());
    }

    @Test
    public void shouldSumVariousRentals() {
        customer.addRental(new Rental(THE_HULK, 2));
        customer.addRental(new Rental(SPIDER_MAN, 1));
        customer.addRental(new Rental(IRON_MAN, 3));
        assertEquals("Rental record for fred\n\tThe Hulk\t1.5\n\tSpiderman\t2.0\n\tIron Man 4\t9.0\nAmount owed is 12.5\nYou earned 4 frequent renter points", customer.statement());
    }

    private static String expectedMessageFor(String rental, double price, double total, int renterPointsEarned) {
        return "Rental record for fred\n\t" + rental + "\t" + price + "\nAmount owed is " + total + "\nYou earned " + renterPointsEarned + " frequent renter points";
    }

}
