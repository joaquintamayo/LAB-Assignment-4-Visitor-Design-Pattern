import java.util.ArrayList;
import java.util.List;

public class Shipping {
    public static void main(String[] args) {
        List<Furniture> furnitureItems = new ArrayList<>();
        furnitureItems.add(new Chair("Modern Chair"));
        furnitureItems.add(new Table(30.0, 2.0, 1.5, 1.0));
        furnitureItems.add(new Sofa(50.0));

        ShippingCostVisitor shippingVisitor = new ShippingCostCalculator();

        for (Furniture item : furnitureItems) {
            double shippingCost = item.accept(shippingVisitor);
            System.out.println("Shipping cost for " + item.getClass().getSimpleName() + ": $" + shippingCost);
        }
    }
}
