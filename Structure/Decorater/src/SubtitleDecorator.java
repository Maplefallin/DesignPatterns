public class SubtitleDecorator extends VideoDecorater{
    public SubtitleDecorator(Video video) {
        super(video);
    }

    @Override
    public void play() {
        super.play();
        action();
    }

    private void action() {
        System.out.println("Adding subtitle");
    }
}
