public class ProductAFactory implements Factory{
    @Override
    public Product createProducts() {
        return new ProductA();
    }
}
