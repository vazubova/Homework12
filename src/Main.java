public class Main {

    public static void main(String[] args) {

        Author firstAuthor = new Author("Nikolay", "Gogol");
        Author secondAuthor = new Author("Fedor", "Dostoevski");
        Book one = new Book("Nose", firstAuthor, 1836);
        Book two= new Book ("Idiot", secondAuthor, 1869);
        System.out.println("Название книги: " + one.getBookName() + ". Автор: " + firstAuthor.getFirstName() + " " + firstAuthor.getLastName() + ". Год издания: " + one.getYearOfPublication());
        System.out.println("Название книги: " + two.getBookName() + ". Автор: " + secondAuthor.getFirstName() + " " + secondAuthor.getLastName() + ". Год издания: " + two.getYearOfPublication());
        one.setYearOfPublication(1833);
        System.out.println("Название книги: " + one.getBookName() + ". Автор: " +  firstAuthor.getFirstName() + " " + firstAuthor.getLastName() +  ". Год издания (изменённый): " + one.getYearOfPublication());



    }
}