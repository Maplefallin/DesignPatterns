public class BMWFactory implements Factory{
    @Override
    public Sedan createSedan() {
        return new BMWSedan();
    }

    @Override
    public SUV createSUV() {
        return new BMWSUV();
    }
}
