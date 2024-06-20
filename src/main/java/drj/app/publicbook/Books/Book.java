package drj.app.publicbook.Books;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Book {

    String title;

    String author;

    String Release_date;

    String link;

    public Book(String title, String author, String release_date,  String link) {
        this.link = link;
        Release_date = release_date;
        this.author = author;
        this.title = title;
    }
}
