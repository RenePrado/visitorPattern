public class ECommercePlatform {
    public static void main(String[] args) {
        Furniture chair = new Chair(60);
        Furniture table = new Table(10, 12);
        Furniture sofa = new Sofa(150);

        ShippingCostCalculator calculator = new ShippingCostCalculator();

        double chairCost = chair.accept(calculator);
        double tableCost = table.accept(calculator);
        double sofaCost = sofa.accept(calculator);

        System.out.println("\nTotal shipping cost for all items: $" + String.format("%.2f", calculator.getTotalShippingCost()));
    }
}
