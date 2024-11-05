//最安全的单例方法
public enum SingletonEnum {
    INSTANCE;

    // 添加实例方法
    public void doSomething() {
        System.out.println("Doing something...");
    }
}
