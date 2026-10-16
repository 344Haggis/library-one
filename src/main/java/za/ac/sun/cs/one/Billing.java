package za.ac.sun.cs.one;

import za.ac.sun.cs.three.Rounding;

/** Billing calculations built on library-three's numeric helpers. */
public final class Billing {

    private Billing() {}

    /**
     * Total for {@code count} items at {@code unitPriceCents} each, with tax applied,
     * rounded to whole cents.
     */
    public static long totalWithTax(long count, double unitPriceCents, double taxRate) {
        double subtotal = count * unitPriceCents;
        double withTax = subtotal * (1.0 + taxRate);
        return Rounding.round(withTax);
    }
}
