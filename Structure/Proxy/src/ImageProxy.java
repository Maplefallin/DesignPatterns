public class ImageProxy implements Image{

    private RealImage realImage;
    private String filename;
    public ImageProxy( String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(this.filename);
        }
        realImage.display();
    }

    public void displayLater(){
        System.out.println("Checking if image needs to be displayed...");
        if (shouldBeDisplayed()) {
            display();
        } else {
            System.out.println("Image is not in viewport, not loading.");
        }
    }

    private boolean shouldBeDisplayed() {
        //这里可以设置一些规则，使得图片在指定区域进行加载
        //例如图片的位置与用户滚动的位置
        return true;
    }
}
