public class Main {
    public static void main(String[] args) {
        Animal lionPrototype = new Animal("Lion");
        PrototypeManager.addPrototype("Lion", lionPrototype);

        // 根据原型创建新实例
        Animal clonedLion = PrototypeManager.createPrototype("Lion");

        // 打印克隆后的动物信息
        System.out.println("Original Animal: " + lionPrototype.toString());
        System.out.println("Cloned Animal: " + clonedLion.toString());
    }
}