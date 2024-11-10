public class Main {
    public static void main(String[] args) {
        Video movie = new Movie();
        movie.play();

        Video movieWithSubtitles = new SubtitleDecorator(movie);
        movieWithSubtitles.play();
    }
}

//decorator的本体不发生变化，装饰器和本体都实现同一个接口。