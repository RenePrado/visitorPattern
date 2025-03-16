public class ShippingCostCalculator implements FurnitureVisitor {
    private double totalShippingCost;

    @Override
    public double visit(Chair chair) {
        double shippingCost = chair.getWeight() * 0.15;
        System.out.println("Shipping cost for chair (Weight: " + chair.getWeight() + " kg): $" + String.format("%.2f", shippingCost));
        totalShippingCost += shippingCost;
        return shippingCost;
    }

    @Override
    public double visit(Table table) {
        double shippingCost = 10 + (table.getLength() * table.getWidth() * 0.05);
        shippingCost = Math.round(shippingCost * 100.0) / 100.0;
        System.out.println("Shipping cost for table (Size: " + table.getLength() + " x " + table.getWidth() + "): $" + String.format("%.2f", shippingCost));
        totalShippingCost += shippingCost;
        return shippingCost;
    }

    @Override
    public double visit(Sofa sofa) {
        double shippingCost = sofa.getDistance() * 0.1;
        System.out.println("Shipping cost for sofa (Distance: " + sofa.getDistance() + " miles): $" + String.format("%.2f", shippingCost));
        totalShippingCost += shippingCost;
        return shippingCost;
    }

    public double getTotalShippingCost() {
        return totalShippingCost;
    }
}
