public class Main {

    public static void main(String[] args) {

        Author firstBook = new Author("Nikolay", "Gogol");
        Author secondBook = new Author("Fedor", "Dostoevski");
        Book one = new Book("Nose", firstBook, 1836);
        Book two= new Book ("Idiot", secondBook, 1869);
        System.out.println("Название книги: " + one.getBookName() + ". Автор: " + firstBook.getFirstName() + " " + firstBook.getLastName() + ". Год издания: " + one.getYearOfPublication());
        System.out.println("Название книги: " + two.getBookName() + ". Автор: " + secondBook.getFirstName() + " " + secondBook.getLastName() + ". Год издания: " + two.getYearOfPublication());
        one.setYearOfPublication(1833);
        System.out.println("Название книги: " + one.getBookName() + ". Автор: " +  firstBook.getFirstName() + " " + firstBook.getLastName() +  ". Год издания: " + one.getYearOfPublication());



    }
}