package pro.sky.java.course1.lesson1;

public class Author {
    private String authorName; // Объявили свойство имя автора
    private int authorAge;
    public Author (String authorName, int authorAge){
        this.authorName=authorName;
        this.authorAge=authorAge;
    }
    public String getName () {
        return this.authorName;
    }
    public int getAge() {
        return this.authorAge;
    }

}
