abstract class VideoDecorater implements Video{
    protected Video video;

    public VideoDecorater(Video video) {
        this.video = video;
    }

    @Override
     public void play() {
         this.video.play();
     }

 }
