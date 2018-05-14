package org.kang.springstudymvn041.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="books")
public class Book {

    private int id;

    private String name;

    private String author;

    private Date publishDate;

    private String comment;

    private BookStatus bookStatus;

    private User rentUser;

    private Set<History> histories = new HashSet<History>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    @Column(name="name")
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Column(name="author")
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="publish_date")
    public Date getPublishDate() {
        return publishDate;
    }
    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }
    @Column(name="comment")
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    @Enumerated(EnumType.ORDINAL)
    @Column(name="status")
    public BookStatus getBookStatus() {
        return bookStatus;
    }
    public void setBookStatus(BookStatus bookStatus) {
        this.bookStatus = bookStatus;
    }
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="rentuser_id", nullable=false)
    public User getRentUser() {
        return rentUser;
    }
    public void setRentUser(User rentUser) {
        this.rentUser = rentUser;
    }

    @OneToMany(mappedBy="book", cascade=CascadeType.ALL, orphanRemoval=true)
    public Set<History> getHistories() {
        return histories;
    }
    public void setHistories(Set<History> histories) {
        this.histories = histories;
    }
}
