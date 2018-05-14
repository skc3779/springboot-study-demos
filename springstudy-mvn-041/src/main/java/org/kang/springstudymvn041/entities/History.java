package org.kang.springstudymvn041.entities;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="histories")
public class History {

    private  Integer id;

    private  User user;

    private  Book book;

    private  HistoryActionType actionType;

    private  Date insertDate;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="user_id", nullable=false)
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="book_id", nullable=false)
    public Book getBook() {
        return book;
    }
    public void setBook(Book book) {
        this.book = book;
    }

    @Enumerated(EnumType.ORDINAL)
    @Column(name="action_type")
    public HistoryActionType getActionType() {
        return actionType;
    }
    public void setActionType(HistoryActionType actionType) {
        this.actionType = actionType;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="insert_date")
    public Date getInsertDate() {
        return insertDate;
    }
    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }


}