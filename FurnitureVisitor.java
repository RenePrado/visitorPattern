public interface FurnitureVisitor {
    double visit(Chair chair);
    double visit(Table table);
    double visit(Sofa sofa);
}
