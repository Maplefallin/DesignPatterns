public class ProductBFactory implements Factory{
    @Override
    public Product createProducts() {
        return new ProductB();
    }
}
