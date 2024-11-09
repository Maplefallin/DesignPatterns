public class RealImage implements Image {

    private String filename;
    public RealImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        System.out.println("Loading image from"+this.filename);

        // 模拟图片加载时间
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Image loaded.");
    }
}
