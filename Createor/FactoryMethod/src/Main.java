public class Main {
    public static void main(String[] args) {
        Factory factoryA = new ProductAFactory();
        Factory factoryB = new ProductBFactory();

        Product productA = factoryA.createProducts();
        Product productB = factoryB.createProducts();

        productA.show();
        productB.show();
    }
}