public class Sofa implements Furniture {
    private double distance;

    public Sofa(double distance) {
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }
    
    @Override
    public double accept(ShippingCostVisitor visitor) {
        return visitor.computeShipping(this);
    }
}
