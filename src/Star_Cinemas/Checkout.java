package Star_Cinemas;

/**
 * Bill Calculations
 *
 * @author jacob.s
 */
public class Checkout {

    private double billTotal = 0.0;
    private double billingPrice = 0.0;
    private double finalTotal = 0.0;
    private double total = 0.0;
    private double newTotal = 0.0;
    private double ticketTotal = 0.0;
    private double completeTotal = 0.0;
    private int quantity = 0;

    public Checkout(double price, int quantity) {
        this.billingPrice = price;
        this.quantity = quantity;
    }

    public Checkout() {
    }

    /**
     * price * quantity of product for checkout calculation
     */
    public double checkoutCalculation(double price, int quantity) {
        this.billingPrice = price;
        this.quantity = quantity;
        billTotal = this.billingPrice * this.quantity;
        return billTotal;
    }

    /**
     * total + new total from additional products / movie tickets
     */
    public double addTotal(double total, double billTotal) {
        this.total = total;
        this.newTotal = billTotal;
        finalTotal = this.total + this.newTotal;
        return finalTotal;
    }

    /**
     * products bill total + tickets total bill for complete checkout total
     */
    public double billTotal(double billTotal, double ticketTotal) {
        this.billTotal = billTotal;
        this.ticketTotal = ticketTotal;
        completeTotal = this.billTotal + this.ticketTotal;
        return completeTotal;
    }

    public double getBillTotal() {
        return billTotal;
    }

    public double getFinalTotal() {
        return finalTotal;
    }

    public double getCompleteTotal() {
        return completeTotal;
    }

}
