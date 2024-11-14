

import java.util.Stack;

/**
 * 备忘录管理类
 */
public class ArticleMementoManager {
    /**
     * 存储所有的备忘录信息
     *      在 栈 数据结构中存储 , 特点后进先出
     */
    private final Stack<ArticleMemento> mArticleMementoStack = new Stack<>();

    /**
     * 获取栈顶的备忘录信息
     * @return
     */
    public ArticleMemento getArticleMemento() {
        return mArticleMementoStack.pop();
    }

    /**
     * 备忘录信息入栈
     *      放在栈顶
     * @param articleMemento
     */
    public void setArticleMemento(ArticleMemento articleMemento) {
        mArticleMementoStack.push(articleMemento);
    }
}
