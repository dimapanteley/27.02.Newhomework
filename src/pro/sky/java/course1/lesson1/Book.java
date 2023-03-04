package pro.sky.java.course1.lesson1;

public class Book{
    private String name;// Объявили свойство name (имя)
    private Author author;
    private int age; // Объявили свойство age (год выпуска)
    public Book (String name, Author author, int age) {
        this.name=name;
        this.author=author;
        this.age=age;
    }
    public String getBookName (){
        return this.name;
    }
    public int getBookAge () {
        return this.age;
    }
    public void setAge (int age) {
        this.age= age;
        }

    }

