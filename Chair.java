public class Chair implements Furniture {
    private String model;

    public Chair(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
    
    @Override
    public double accept(ShippingCostVisitor visitor) {
        return visitor.computeShipping(this);
    }
}
