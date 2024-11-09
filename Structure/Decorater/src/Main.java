public class Main {
    public static void main(String[] args) {
        Video movie = new Movie();
        movie.play();

        Video movieWithSubtitles = new SubtitleDecorator(movie);
        movieWithSubtitles.play();
    }
}