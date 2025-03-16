public class Table implements Furniture {
    private double weight;
    private double length;
    private double width;
    private double height;

    public Table(double weight, double length, double width, double height) {
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    
    @Override
    public double accept(ShippingCostVisitor visitor) {
        return visitor.computeShipping(this);
    }
}
