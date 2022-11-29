package utils;

public class Article {

    String title;
    String about;
    String article;

    public Article() {
    }

    public Article(String title, String about, String article) {
        this.title = title;
        this.about = about;
        this.article = article;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }
}
