package za.ac.sun.cs.one;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BillingTest {

    @Test
    void totalWithTax() {
        // 1 item @ 2.00c + 25% tax = 2.5c, expected to round to 3c.
        // Breaks under library-three 1.0.1 (banker's rounding -> 2c).
        assertEquals(3L, Billing.totalWithTax(1, 2.0, 0.25));
    }

    @Test
    void totalWithTax_noHalfBoundary() {
        // 2 items @ 2.00c + 10% tax = 4.4c -> 4c, unaffected by rounding mode.
        assertEquals(4L, Billing.totalWithTax(2, 2.0, 0.10));
    }
}
