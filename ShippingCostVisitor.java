public interface ShippingCostVisitor {
    double computeShipping(Chair chair);
    double computeShipping(Table table);
    double computeShipping(Sofa sofa);
}
