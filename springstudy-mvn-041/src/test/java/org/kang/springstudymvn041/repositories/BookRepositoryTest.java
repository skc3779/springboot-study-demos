package org.kang.springstudymvn041.repositories;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.kang.springstudymvn041.entities.Book;
import org.kang.springstudymvn041.entities.BookStatus;
import org.kang.springstudymvn041.entities.User;
import org.kang.springstudymvn041.entities.UserLevel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookRepositoryTest {

    @Autowired
    BookRepository bookRepository;
    @Autowired
    BookRepositoryDef bookRepositoryDef;
    @Autowired
    BookRepositoryBean bookRepositoryBean;

    @Autowired
    UserRepository userRepository;
    @Autowired
    HistoryRepository historyRepository;


    @Before
    public void setUp() throws Exception {

        userRepository.deleteAll();
        for(User u : getUsers()) {
            userRepository.save(u);
        }

        bookRepository.deleteAll();
        for(Book b : getBooks()) {
            bookRepository.save(b);
        }
    }

    public List<User> getUsers()
    {
        System.out.println("getUser 시작");
        User user1 = new User();
        //user1.setId(1);
        user1.setName("User01");
        user1.setPassword("User01");
        user1.setPoint(5);
        user1.setLevel(UserLevel.NORMAL);

        User user2 = new User();
        //user2.setId(2);
        user2.setName("User02");
        user2.setPassword("User02");
        user2.setPoint(10);
        user2.setLevel(UserLevel.READER);

        User user3 = new User();
        //user3.setId(3);
        user3.setName("User03");
        user3.setPassword("User03");
        user3.setPoint(25);
        user3.setLevel(UserLevel.MVP);

        List<User> users = Arrays.asList(user1,user2,user3);
        System.out.println("getUser 종료");

        return users;
    }

    public List<Book> getBooks(){
        Book book1 = new Book();
        book1.setName("Book01");
        book1.setAuthor("autor name 01");
        book1.setComment("comment01");
        book1.setPublishDate(new Date());
        book1.setBookStatus(BookStatus.CANRENT);
        book1.setRentUser(userRepository.findByName("User02").get(0));

        Book book2 = new Book();
        book2.setName("Book02");
        book2.setAuthor("autor name 02");
        book2.setComment("comment02");
        book2.setPublishDate(new Date());
        book2.setBookStatus(BookStatus.MISSING);
        book2.setRentUser(userRepository.findByName("User02").get(0));

        Book book3 = new Book();
        book3.setName("Book03");
        book3.setAuthor("autor name 03");
        book3.setComment("comment03");
        book3.setPublishDate(new Date());
        book3.setBookStatus(BookStatus.RENTNOW);
        book3.setRentUser(userRepository.findByName("User02").get(0));

        List<Book> books = Arrays.asList(book1,book2,book3);
        return books;
    }

    /**
     * JpaRepository Test
     */
    @Test
    public void findByName() {
        assertThat(bookRepository.findByName("Book01")).isNotEmpty();

    }

    /**
     * Async JpaRepository Test
     * @throws ExecutionException
     * @throws InterruptedException
     */
    @Test
    public void findByAuthor() throws ExecutionException, InterruptedException {
        CompletableFuture<Book> book = bookRepository.findByAuthor("autor name 01");
        assertThat(book.get().getAuthor()).contains("autor name 01");
    }

    /**
     * @RepositoryDefinition Test
     */
    @Test
    public void findByNameDef() {
        assertThat(bookRepositoryDef.findByName("Book01")).isNotEmpty();

    }

    /**
     * @NoRepositoryBean Test
     */
    @Test
    public void findByNameBean() {
        assertThat(bookRepositoryBean.findByName("Book01")).isNotEmpty();

    }
}