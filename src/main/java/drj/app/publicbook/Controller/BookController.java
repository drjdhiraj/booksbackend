package drj.app.publicbook.Controller;

import drj.app.publicbook.Books.Book;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
public class BookController {

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        List<Book> books = new ArrayList<>();

        // Book 1: Romeo and Juliet by William Shakespeare
        Book book1 = new Book(
                "Romeo and Juliet",
                "William Shakespeare",
                "November 1, 1998 [eBook #1513]\nMost recently updated: June 19, 2024",
                "https://www.gutenberg.org/cache/epub/1513/pg1513-images.html"
        );
        books.add(book1);

        // Book 2: Moby Dick; Or, The Whale by Herman Melville
        Book book2 = new Book(
                "Moby Dick; Or, The Whale",
                "Herman Melville",
                "",
                "https://www.gutenberg.org/cache/epub/2701/pg2701-images.html"
        );
        books.add(book2);

        // Book 3: Middlemarch by George Eliot
        Book book3 = new Book(
                "Middlemarch",
                "George Eliot",
                "July 1, 1994 [eBook #145]\n" +
                        "Most recently updated: June 7, 2024",
                "https://www.gutenberg.org/cache/epub/145/pg145-images.html"
        );
        books.add(book3);

        // Book 4: Pride and Prejudice by Jane Austen
        Book book4 = new Book(
                "Pride and Prejudice",
                "Jane Austen",
                "January 28, 1813",
                "https://www.gutenberg.org/cache/epub/1342/pg1342-images.html"
        );
        books.add(book4);

        // Book 5: The Complete Works of William Shakespeare by William Shakespeare
        Book book5 = new Book(
                "The Complete Works of William Shakespeare",
                "William Shakespeare",
                "January 1, 1994 [eBook #100]\n" +
                        "Most recently updated: January 18, 2024",
                "https://www.gutenberg.org/cache/epub/100/pg100-images.html"
        );
        books.add(book5);



        // Book 17: Alice's Adventures in Wonderland by Lewis Carroll
        Book book17 = new Book(
                "Alice's Adventures in Wonderland",
                "Lewis Carroll",
                "1865",
                "https://www.gutenberg.org/ebooks/11"
        );
        books.add(book17);

        // Book 18: Crime and Punishment by Fyodor Dostoyevsky
        Book book18 = new Book(
                "Crime and Punishment",
                "Fyodor Dostoyevsky",
                "1866",
                "https://www.gutenberg.org/ebooks/2554"
        );
        books.add(book18);

        // Book 19: Frankenstein; Or, The Modern Prometheus by Mary Wollstonecraft Shelley
        Book book19 = new Book(
                "Frankenstein; Or, The Modern Prometheus",
                "Mary Wollstonecraft Shelley",
                "1818",
                "https://www.gutenberg.org/ebooks/84"
        );
        books.add(book19);

        // Book 20: Dracula by Bram Stoker
        Book book20 = new Book(
                "Dracula",
                "Bram Stoker",
                "1897",
                "https://www.gutenberg.org/ebooks/345"
        );
        books.add(book20);

        // Book 21: The Picture of Dorian Gray by Oscar Wilde
        Book book21 = new Book(
                "The Picture of Dorian Gray",
                "Oscar Wilde",
                "1890",
                "https://www.gutenberg.org/ebooks/174"
        );
        books.add(book21);

        // Book 22: Metamorphosis by Franz Kafka
        Book book22 = new Book(
                "Metamorphosis",
                "Franz Kafka",
                "1915",
                "https://www.gutenberg.org/ebooks/5200"
        );
        books.add(book22);

        // Book 23: Don Quijote by Miguel de Cervantes Saavedra
        Book book23 = new Book(
                "Don Quijote",
                "Miguel de Cervantes Saavedra",
                "1605",
                "https://www.gutenberg.org/ebooks/2000"
        );
        books.add(book23);



        // Book 25: The Brothers Karamazov by Fyodor Dostoyevsky
        Book book25 = new Book(
                "The Brothers Karamazov",
                "Fyodor Dostoyevsky",
                "1880",
                "https://www.gutenberg.org/ebooks/28054"
        );
        books.add(book25);



        // Book 27: War and Peace by graf Leo Tolstoy
        Book book27 = new Book(
                "War and Peace",
                "graf Leo Tolstoy",
                "1869",
                "https://www.gutenberg.org/ebooks/2600"
        );
        books.add(book27);




        // Book 29: The Great Gatsby by F. Scott Fitzgerald
        Book book29 = new Book(
                "The Great Gatsby",
                "F. Scott Fitzgerald",
                "1925",
                "https://www.gutenberg.org/ebooks/64317"
        );
        books.add(book29);

        // Book 30: Tractatus Logico-Philosophicus by Ludwig Wittgenstein
        Book book30 = new Book(
                "Tractatus Logico-Philosophicus",
                "Ludwig Wittgenstein",
                "1921",
                "https://www.gutenberg.org/ebooks/5740"
        );
        books.add(book30);

        // Book 31: A Tale of Two Cities by Charles Dickens
        Book book31 = new Book(
                "A Tale of Two Cities",
                "Charles Dickens",
                "1859",
                "https://www.gutenberg.org/ebooks/98"
        );
        books.add(book31);

        // Book 32: Ulysses by James Joyce
        Book book32 = new Book(
                "Ulysses",
                "James Joyce",
                "1922",
                "https://www.gutenberg.org/ebooks/4300"
        );
        books.add(book32);

        // Book 33: The Yellow Wallpaper by Charlotte Perkins Gilman
        Book book33 = new Book(
                "The Yellow Wallpaper",
                "Charlotte Perkins Gilman",
                "1892",
                "https://www.gutenberg.org/ebooks/1952"
        );
        books.add(book33);

        // Book 34: Adventures of Huckleberry Finn by Mark Twain
        Book book34 = new Book(
                "Adventures of Huckleberry Finn",
                "Mark Twain",
                "1884",
                "https://www.gutenberg.org/ebooks/76"
        );
        books.add(book34);

        // Book 35: A Doll's House : a play by Henrik Ibsen
        Book book35 = new Book(
                "A Doll's House : a play",
                "Henrik Ibsen",
                "1879",
                "https://www.gutenberg.org/ebooks/2542"
        );
        books.add(book35);

        // Book 36: Great Expectations by Charles Dickens
        Book book36 = new Book(
                "Great Expectations",
                "Charles Dickens",
                "1861",
                "https://www.gutenberg.org/ebooks/1400"
        );
        books.add(book36);

        // Book 37: The Prince by Niccolò Machiavelli
        Book book37 = new Book(
                "The Prince",
                "Niccolò Machiavelli",
                "1532",
                "https://www.gutenberg.org/ebooks/1232"
        );
        books.add(book37);

        // Book 38: A Modest Proposal by Jonathan Swift
        Book book38 = new Book(
                "A Modest Proposal",
                "Jonathan Swift",
                "1729",
                "https://www.gutenberg.org/ebooks/1080"
        );
        books.add(book38);

        // Book 39: Among the gnomes : by Franz Hartmann
        Book book39 = new Book(
                "Among the gnomes",
                "Franz Hartmann",
                "",
                ""
        );
        books.add(book39);



        // Book 41: The Importance of Being Earnest: A Trivial Comedy for Serious People by Oscar Wilde
        Book book41 = new Book(
                "The Importance of Being Earnest: A Trivial Comedy for Serious People",
                "Oscar Wilde",
                "1895",
                "https://www.gutenberg.org/ebooks/844"
        );
        books.add(book41);

        // Book 42: Thus Spake Zarathustra: A Book for All and None by Friedrich Wilhelm Nietzsche
        Book book42 = new Book(
                "Thus Spake Zarathustra: A Book for All and None",
                "Friedrich Wilhelm Nietzsche",
                "1885",
                "https://www.gutenberg.org/ebooks/1998"
        );
        books.add(book42);

        // Book 43: Grimms' Fairy Tales by Jacob Grimm and Wilhelm Grimm
        Book book43 = new Book(
                "Grimms' Fairy Tales",
                "Jacob Grimm and Wilhelm Grimm",
                "1812",
                "https://www.gutenberg.org/ebooks/2591"
        );
        books.add(book43);

        // Book 44: The Strange Case of Dr. Jekyll and Mr. Hyde by Robert Louis Stevenson
        Book book44 = new Book(
                "The Strange Case of Dr. Jekyll and Mr. Hyde",
                "Robert Louis Stevenson",
                "1886",
                "https://www.gutenberg.org/ebooks/42"
        );
        books.add(book44);

        // Book 45: The Kama Sutra of Vatsyayana by Vatsyayana
        Book book45 = new Book(
                "The Kama Sutra of Vatsyayana",
                "Vatsyayana",
                "2nd century CE",
                "https://www.gutenberg.org/ebooks/27827"
        );
        books.add(book45);



        // Book 47: A Christmas Carol in Prose; Being a Ghost Story of Christmas by Charles Dickens
        Book book47 = new Book(
                "A Christmas Carol in Prose; Being a Ghost Story of Christmas",
                "Charles Dickens",
                "1843",
                "https://www.gutenberg.org/ebooks/46"
        );
        books.add(book47);

        // Book 48: The Iliad by Homer
        Book book48 = new Book(
                "The Iliad",
                "Homer",
                "8th century BCE",
                "https://www.gutenberg.org/ebooks/6130"
        );
        books.add(book48);

        // Book 49: Heart of Darkness by Joseph Conrad
        Book book49 = new Book(
                "Heart of Darkness",
                "Joseph Conrad",
                "1899",
                "https://www.gutenberg.org/ebooks/219"
        );
        books.add(book49);



        // Book 51: Novo dicionário da língua portuguesa by Cândido de Figueiredo
        Book book51 = new Book(
                "Novo dicionário da língua portuguesa",
                "Cândido de Figueiredo",
                "1913",
                "https://www.gutenberg.org/ebooks/18028"
        );
        books.add(book51);

        // Book 52: The Count of Monte Cristo by Alexandre Dumas and Auguste Maquet
        Book book52 = new Book(
                "The Count of Monte Cristo",
                "Alexandre Dumas and Auguste Maquet",
                "1844",
                "https://www.gutenberg.org/ebooks/1184"
        );
        books.add(book52);

        // Book 53: Don Quixote by Miguel de Cervantes Saavedra
        Book book53 = new Book(
                "Don Quixote",
                "Miguel de Cervantes Saavedra",
                "1605",
                "https://www.gutenberg.org/ebooks/2000"
        );
        books.add(book53);

        // Book 54: Jane Eyre: An Autobiography by Charlotte Brontë
        Book book54 = new Book(
                "Jane Eyre: An Autobiography",
                "Charlotte Brontë",
                "1847",
                "https://www.gutenberg.org/ebooks/1260"
        );
        books.add(book54);






        // Book 58: Du côté de chez Swann by Marcel Proust
        Book book58 = new Book(
                "Du côté de chez Swann",
                "Marcel Proust",
                "1913",
                "https://www.gutenberg.org/ebooks/28054"
        );
        books.add(book58);

        // Book 59: The King James Version of the Bible
        Book book59 = new Book(
                "The King James Version of the Bible",
                "",
                "1611",
                "https://www.gutenberg.org/ebooks/10"
        );
        books.add(book59);

        // Book 60: The Declaration of Independence of the United States of America by Thomas Jefferson
        Book book60 = new Book(
                "The Declaration of Independence of the United States of America",
                "Thomas Jefferson",
                "1776",
                "https://www.gutenberg.org/ebooks/1"
        );
        books.add(book60);

        // Book 61: A Study in Scarlet by Arthur Conan Doyle
        Book book61 = new Book(
                "A Study in Scarlet",
                "Arthur Conan Doyle",
                "1887",
                "https://www.gutenberg.org/ebooks/244"
        );
        books.add(book61);

        // Book 62: Wuthering Heights by Emily Brontë
        Book book62 = new Book(
                "Wuthering Heights",
                "Emily Brontë",
                "1847",
                "https://www.gutenberg.org/ebooks/768"
        );
        books.add(book62);

        // Book 63: The Odyssey by Homer
        Book book63 = new Book(
                "The Odyssey",
                "Homer",
                "8th century BCE",
                "https://www.gutenberg.org/ebooks/1727"
        );
        books.add(book63);

        // Book 64: Anne of Green Gables by L. M. Montgomery
        Book book64 = new Book(
                "Anne of Green Gables",
                "L. M. Montgomery",
                "1908",
                "https://www.gutenberg.org/ebooks/45"
        );
        books.add(book64);

        // Book 65: Peter Pan by J. M. Barrie
        Book book65 = new Book(
                "Peter Pan",
                "J. M. Barrie",
                "1911",
                "https://www.gutenberg.org/ebooks/16"
        );
        books.add(book65);

        // Book 66: Beyond Good and Evil by Friedrich Wilhelm Nietzsche
        Book book66 = new Book(
                "Beyond Good and Evil",
                "Friedrich Wilhelm Nietzsche",
                "1886",
                "https://www.gutenberg.org/ebooks/4363"
        );
        books.add(book66);

        // Book 67: Meditations by Emperor of Rome Marcus Aurelius
        Book book67 = new Book(
                "Meditations",
                "Emperor of Rome Marcus Aurelius",
                "2nd century",
                "https://www.gutenberg.org/ebooks/2680"
        );
        books.add(book67);

        // Book 68: The War of the Worlds by H. G. Wells
        Book book68 = new Book(
                "The War of the Worlds",
                "H. G. Wells",
                "1898",
                "https://www.gutenberg.org/ebooks/36"
        );
        books.add(book68);

        // Book 69: Little Women by Louisa May Alcott
        Book book69 = new Book(
                "Little Women",
                "Louisa May Alcott",
                "1868-1869",
                "https://www.gutenberg.org/ebooks/514"
        );
        books.add(book69);

        // Book 70: The King in Yellow by Robert W. Chambers
        Book book70 = new Book(
                "The King in Yellow",
                "Robert W. Chambers",
                "1895",
                "https://www.gutenberg.org/ebooks/8492"
        );
        books.add(book70);

        // Book 71: Winnie-the-Pooh by A. A. Milne
        Book book71 = new Book(
                "Winnie-the-Pooh",
                "A. A. Milne",
                "1926",
                "https://www.gutenberg.org/ebooks/14407"
        );
        books.add(book71);

        // Book 72: The Adventures of Tom Sawyer, Complete by Mark Twain
        Book book72 = new Book(
                "The Adventures of Tom Sawyer, Complete",
                "Mark Twain",
                "1876",
                "https://www.gutenberg.org/ebooks/73"
        );
        books.add(book72);

        // Book 73: The Republic by Plato
        Book book73 = new Book(
                "The Republic",
                "Plato",
                "4th century BCE",
                "https://www.gutenberg.org/ebooks/1497"
        );
        books.add(book73);

        // Book 74: The divine comedy by Dante Alighieri
        Book book74 = new Book(
                "The divine comedy",
                "Dante Alighieri",
                "1320",
                "https://www.gutenberg.org/ebooks/8800"
        );
        books.add(book74);

        // Book 75: The 2001 CIA World Factbook by United States. Central Intelligence Agency
        Book book75 = new Book(
                "The 2001 CIA World Factbook",
                "United States. Central Intelligence Agency",
                "2001",
                "https://www.gutenberg.org/ebooks/2743"
        );
        books.add(book75);

        // Book 76: The Souls of Black Folk by W. E. B. Du Bois
        Book book76 = new Book(
                "The Souls of Black Folk",
                "W. E. B. Du Bois",
                "1903",
                "https://www.gutenberg.org/ebooks/408"
        );
        books.add(book76);

        // Book 77: The Scarlet Letter by Nathaniel Hawthorne
        Book book77 = new Book(
                "The Scarlet Letter",
                "Nathaniel Hawthorne",
                "1850",
                "https://www.gutenberg.org/ebooks/25344"
        );
        books.add(book77);

        // Book 78: Treasure Island by Robert Louis Stevenson
        Book book78 = new Book(
                "Treasure Island",
                "Robert Louis Stevenson",
                "1883",
                "https://www.gutenberg.org/ebooks/120"
        );
        books.add(book78);

        // Book 79: Calculus Made Easy by Silvanus P. Thompson
        Book book79 = new Book(
                "Calculus Made Easy",
                "Silvanus P. Thompson",
                "1910",
                "https://www.gutenberg.org/ebooks/33283"
        );
        books.add(book79);

        // Book 80: The Prophet by Kahlil Gibran
        Book book80 = new Book(
                "The Prophet",
                "Kahlil Gibran",
                "1923",
                "https://www.gutenberg.org/ebooks/58585"
        );
        books.add(book80);



        // Book 82: The United States Bill of Rights by United States
        Book book82 = new Book(
                "The United States Bill of Rights",
                "United States",
                "1791",
                "https://www.gutenberg.org/ebooks/19466"
        );
        books.add(book82);

        // Book 83: Les Misérables by Victor Hugo
        Book book83 = new Book(
                "Les Misérables",
                "Victor Hugo",
                "1862",
                "https://www.gutenberg.org/ebooks/135"
        );
        books.add(book83);




        // Book 86: Dubliners by James Joyce
        Book book86 = new Book(
                "Dubliners",
                "James Joyce",
                "1914",
                "https://www.gutenberg.org/ebooks/2814"
        );
        books.add(book86);



        // Book 88: The Wonderful Wizard of Oz by L. Frank Baum
        Book book88 = new Book(
                "The Wonderful Wizard of Oz",
                "L. Frank Baum",
                "1900",
                "https://www.gutenberg.org/ebooks/55"
        );
        books.add(book88);

        // Book 89: Walden, and On The Duty Of Civil Disobedience by Henry David Thoreau
        Book book89 = new Book(
                "Walden, and On The Duty Of Civil Disobedience",
                "Henry David Thoreau",
                "1854",
                "https://www.gutenberg.org/ebooks/205"
        );
        books.add(book89);

        // Book 90: Beowulf: An Anglo-Saxon Epic Poem
        Book book90 = new Book(
                "Beowulf: An Anglo-Saxon Epic Poem",
                "",
                "10th century",
                "https://www.gutenberg.org/ebooks/16328"
        );
        books.add(book90);

        // Book 91: The Adventures of Sherlock Holmes by Arthur Conan Doyle
        Book book91 = new Book(
                "The Adventures of Sherlock Holmes",
                "Arthur Conan Doyle",
                "1892",
                "https://www.gutenberg.org/ebooks/1661"
        );
        books.add(book91);

        // Book 92: Pride and Prejudice by Jane Austen
        Book book92 = new Book(
                "Pride and Prejudice",
                "Jane Austen",
                "1813",
                "https://www.gutenberg.org/ebooks/1342"
        );
        books.add(book92);

        // Book 93: The Picture of Dorian Gray by Oscar Wilde
        Book book93 = new Book(
                "The Picture of Dorian Gray",
                "Oscar Wilde",
                "1890",
                "https://www.gutenberg.org/ebooks/174"
        );
        books.add(book93);

        // Book 94: The Federalist Papers by Alexander Hamilton, John Jay, and James Madison
        Book book94 = new Book(
                "The Federalist Papers",
                "Alexander Hamilton, John Jay, and James Madison",
                "1787-1788",
                "https://www.gutenberg.org/ebooks/18"
        );
        books.add(book94);

        // Book 95: The Adventures of Huckleberry Finn, Tom Sawyer's Comrade by Mark Twain
        Book book95 = new Book(
                "The Adventures of Huckleberry Finn, Tom Sawyer's Comrade",
                "Mark Twain",
                "1885",
                "https://www.gutenberg.org/ebooks/76"
        );
        books.add(book95);

        // Book 96: The Odyssey by Homer
        Book book96 = new Book(
                "The Odyssey",
                "Homer",
                "8th century BCE",
                "https://www.gutenberg.org/ebooks/1727"
        );
        books.add(book96);

        // Book 97: Metamorphosis by Franz Kafka
        Book book97 = new Book(
                "Metamorphosis",
                "Franz Kafka",
                "1915",
                "https://www.gutenberg.org/ebooks/5200"
        );
        books.add(book97);

        // Book 98: Moby Dick; Or, The Whale by Herman Melville
        Book book98 = new Book(
                "Moby Dick; Or, The Whale",
                "Herman Melville",
                "1851",
                "https://www.gutenberg.org/ebooks/2701"
        );
        books.add(book98);

        // Book 99: Aesop's Fables by Aesop
        Book book99 = new Book(
                "Aesop's Fables",
                "Aesop",
                "6th century BCE",
                "https://www.gutenberg.org/ebooks/21"
        );
        books.add(book99);

        // Book 100: Paradise Lost by John Milton
        Book book100 = new Book(
                "Paradise Lost",
                "John Milton",
                "1667",
                "https://www.gutenberg.org/ebooks/26"
        );
        books.add(book100);

        return books;
    }
}
