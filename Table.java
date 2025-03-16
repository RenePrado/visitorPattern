public class Table implements Furniture {
    private double length;
    private double width;

    public Table(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double accept(FurnitureVisitor visitor) {
        return visitor.visit(this);
    }
}
