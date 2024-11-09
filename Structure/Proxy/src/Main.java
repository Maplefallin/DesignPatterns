public class Main {
    public static void main(String[] args) {
        Image image = new ImageProxy("example.jpg");
        ((ImageProxy) image).displayLater(); // 只有当图片需要显示时才加载
    }
}