package za.ac.sun.cs.one;

/** Human-readable invoice labelling. Independent of any rounding logic. */
public final class Invoice {

    private Invoice() {}

    public static String header(String customer) {
        return "Invoice for " + customer;
    }
}
