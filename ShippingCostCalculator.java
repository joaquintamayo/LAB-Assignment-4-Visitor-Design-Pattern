public class ShippingCostCalculator implements ShippingCostVisitor {

    @Override
    public double computeShipping(Chair chair) {
        return 10.0;
    }

    @Override
    public double computeShipping(Table table) {
        double baseCost = 15.0;
        double weightFactor = table.getWeight() * 0.5;
        double dimensionFactor = (table.getLength() + table.getWidth() + table.getHeight()) * 0.2;
        return baseCost + weightFactor + dimensionFactor;
    }

    @Override
    public double computeShipping(Sofa sofa) {
        double baseCost = 20.0;
        double distanceFactor = sofa.getDistance() * 1.5;
        return baseCost + distanceFactor;
    }
}
