public class Main {
    public static void main(String[] args) {
        Factory bmwFactory = new BMWFactory();
        Sedan bmwSedan = bmwFactory.createSedan();
        SUV bmwSuv = bmwFactory.createSUV();
        bmwSedan.run();
        bmwSuv.run();

        Factory mercedesFactory = new MercedesFactory();
        Sedan mercedesSedan = mercedesFactory.createSedan();
        SUV mercedesSuv = mercedesFactory.createSUV();
        mercedesSedan.run();
        mercedesSuv.run();


    }
}