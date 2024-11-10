import java.util.Objects;

public class hw_11 {
    public static class Book {
        private String name;
        private Author author;
        private int yearPublication;


        public Book(String name, Author author, int yearPublication) {
            this.name = name;
            this.author = author;
            this.yearPublication = yearPublication;
        }

        public String getName() {
            return name;
        }

        public Author getAuthor() {
            return author;
        }

        public int getYearPublication() {
            return yearPublication;
        }

        public void setYearPublication(int yearPublication) {
            this.yearPublication = yearPublication;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "name='" + name + '\'' +
                    ", author=" + author +
                    ", yearPublication=" + yearPublication +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Book book = (Book) o;
            return yearPublication == book.yearPublication && Objects.equals(name, book.name) && Objects.equals(author, book.author);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, author, yearPublication);
        }
    }

    public static class Author {
        private String firstName;
        private String surName;

        public Author(String firstName, String surName) {
            this.firstName = firstName;
            this.surName = surName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getSurName() {
            return surName;
        }

        @Override
        public String toString() {
            return "Author{" +
                    "firstName='" + firstName + '\'' +
                    ", surName='" + surName + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Author author = (Author) o;
            return Objects.equals(firstName, author.firstName) && Objects.equals(surName, author.surName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(firstName, surName);
        }
    }

    public static class Main {
        public static void main(String[] args) {
            Author author1 = new Author("Name1", "Surname1");
            Author author2 = new Author("Name2", "Surname2");
            Book book1 = new Book("Книга1", author1, 2015);
            Book book2 = new Book("Книга2", author2, 2017);
            book1.setYearPublication(2020);
        }
    }
}
