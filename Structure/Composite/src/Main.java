public class Main {
    public static void main(String[] args) {
        // 创建叶子节点
        Leaf leaf1 = new Leaf("Leaf 1");
        Leaf leaf2 = new Leaf("Leaf 2");

        // 创建组合节点
        Composite composite1 = new Composite("Composite 1");
        Composite composite2 = new Composite("Composite 2");

        // 构建组合结构
        composite1.add(leaf1);
        composite1.add(leaf2);
        composite2.add(leaf1);
        composite2.add(leaf2);

        // 客户端可以统一处理叶子和组合节点
        composite1.operation();
        composite2.operation();
    }
}