public class Main {
    public static void main(String[] args) {
        ArticleMementoManager articleMementoManager = new ArticleMementoManager();

        // 创建并输入文档内容
        Article article = new Article("标题", "内容", "图片链接");
        // 保存备忘录信息
        ArticleMemento articleMemento = article.saveToMemento();
        // 将备忘录信息设置到 备忘录管理者
        articleMementoManager.setArticleMemento(articleMemento);
        // 打印备忘录内容
        System.out.println("文档信息 : " + article.toString());

        // 修改文档内容
        article.setTitle("标题 2");
        article.setContent("内容 2");
        article.setImage("图片链接 2");
        // 保存新的备忘录信息
        articleMemento = article.saveToMemento();
        // 将备忘录信息设置到 备忘录管理者
        articleMementoManager.setArticleMemento(articleMemento);
        // 打印备忘录内容
        System.out.println("文档信息 : " + article.toString());

        // 此时 ArticleMementoManager 中存储了 2 个存档
        // 存档 1 : Article{title='标题', content='内容', image='图片链接'}
        // 存档 2 : Article{title='标题 2', content='内容 2', image='图片链接 2'}

        // 使用备忘录回退
        // 先将栈顶的当前备忘录出栈 , 移除
        articleMementoManager.getArticleMemento();
        // 然后获取上一个备忘录 , 并设置到 Article 中
        article.undoFromMemento(articleMementoManager.getArticleMemento());
        // 打印备忘录内容
        System.out.println("文档信息 : " + article.toString());

    }
}