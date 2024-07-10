public class Main {

    public static void main(String[] args) {

        Author firstBookAuthor = new Author("Nikolay", "Gogol");
        Author secondBookAuthor = new Author("Fedor", "Dostoevski");
        Book one = new Book("Nose", firstBookAuthor, 1836);
        Book two= new Book ("Idiot", secondBookAuthor, 1869);
        System.out.println("Название книги: " + one.getBookName() + ". Автор: " + firstBookAuthor.getFirstName() + " " + firstBookAuthor.getLastName() + ". Год издания: " + one.getYearOfPublication());
        System.out.println("Название книги: " + two.getBookName() + ". Автор: " + secondBookAuthor.getFirstName() + " " + secondBookAuthor.getLastName() + ". Год издания: " + two.getYearOfPublication());
        one.setYearOfPublication(1833);
        System.out.println("Название книги: " + one.getBookName() + ". Автор: " +  firstBookAuthor.getFirstName() + " " + firstBookAuthor.getLastName() +  ". Год издания (изменённый): " + one.getYearOfPublication());



    }
}