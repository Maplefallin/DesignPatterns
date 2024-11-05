public class Singleton {
    private static Singleton instance;

    //懒汉式（线程不安全）
    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    //懒汉式（线程安全）
    //但是加锁会影响性能
//    private Singleton() {}
//
//    public static synchronized Singleton getInstance() {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }

    //懒汉式（双重校验）
    //只有在instance为空时才加锁
//    private Singleton() {}
//
//    public static Singleton getInstance() {
//        if (instance == null) {
//            synchronized (Singleton.class) {
//                if (instance == null) {
//                    instance = new Singleton();
//                }
//            }
//        }
//        return instance;
//    }

    //饿汉式
//    private Singleton() { this.instance = new Singleton(); }
//    public static Singleton getInstance() {
//        return instance;
//    }

    //静态内部类
//    // 私有构造方法，避免外部实例化
//    private Singleton() {}
//
//    // 静态内部类，JVM类加载机制保证线程安全和延迟加载
//    private static class SingletonHolder {
//        // 静态初始化器，创建唯一实例
//        private static final Singleton INSTANCE = new Singleton();
//    }
//
//    // 提供公共的访问点
//    public static Singleton getInstance() {
//        return SingletonHolder.INSTANCE;
//    }
}
