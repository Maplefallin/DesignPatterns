public class Article {
    private String title;
    private String content;
    private String image;

    public Article(String tittle, String content, String image) {
        this.title = tittle;
        this.content = content;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * 保存信息到备忘录
     * @return
     */
    public ArticleMemento saveToMemento() {
        ArticleMemento articleMemento = new ArticleMemento(title, content, image);
        return articleMemento;
    }

    /**
     * 从备忘录恢复
     * @param articleMemento
     */
    public void undoFromMemento(ArticleMemento articleMemento) {
        this.title = articleMemento.getTitle();
        this.content = articleMemento.getContent();
        this.image = articleMemento.getImage();
    }

    @Override
    public String toString() {
        return "Article{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", image='" + image + '\'' +
                '}';
    }

}
