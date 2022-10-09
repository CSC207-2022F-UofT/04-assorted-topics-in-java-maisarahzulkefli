/* TODO: Create a subclass of Trader named DrivableTrader
 * This class should be identical to Trader, except that it takes
 * only Drivable objects in its inventory, wishlist, etc.
 *
 * The sellingPrice returned should also be overridden. The selling price
 * should be equal to the:
 *     Object's price + Object's max speed
 * If the object is Tradable (and Tradable.MISSING_PRICE otherwise.)
 *
 * Look at DomesticatableTrader.java for an example.
 */

import java.util.List;
public class DrivableTrader extends Trader<Drivable> { //DrivableTrader  is subclass of Trader, but takes Drivable only
    //Note that all instances of <T> are now <Drivable>
    public DrivableTrader(List<Drivable> inventory, List<Drivable> wishlist,
                          int money) {
        super(inventory, wishlist, money);

    }

    public DrivableTrader(int i) {
        super(i);
    }

    @Override
    public int getSellingPrice(Drivable object) {
        int selling_price = super.getSellingPrice(object) + object.getMaxSpeed();

        if(object instanceof Tradable) {
            return selling_price;

        }
        return Tradable.MISSING_PRICE;
    }
}