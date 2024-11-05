public class MercedesFactory implements Factory{
    @Override
    public Sedan createSedan() {
        return new MercedesSedan();
    }

    @Override
    public SUV createSUV() {
        return new MercedesSUV();
    }
}
