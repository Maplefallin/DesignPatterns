public class ArticleMemento {
    private String title;
    private String content;
    private String image;

    public ArticleMemento(String title, String content, String image) {
        this.title = title;
        this.content = content;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getImage() {
        return image;
    }

    @Override
    public String toString() {
        return "ArticleMemento{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", image='" + image + '\'' +
                '}';
    }

}
