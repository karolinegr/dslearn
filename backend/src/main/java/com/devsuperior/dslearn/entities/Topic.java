package com.devsuperior.dslearn.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "tb_topic")
public class Topic implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @Column(columnDefinition = "TEXT")
    private String body;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant moment;

    @ManyToOne
    @JoinColumn(name = "lesson_id")
    private Lesson lesson;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private User author;

    @ManyToMany
    @JoinTable(name = "tb_topic_likes",
            joinColumns = @JoinColumn(name = "topic_id"),
            inverseJoinColumns = @JoinColumn(name="user_id"))
    private Set<User> likes = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "offer_id")
    private Offer offer;

    @OneToMany(mappedBy = "topic")
    private List<Reply> replies = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "reply_id")
    private Reply answer;

    public Topic() {
    }

    public Topic(Long id, String title, String body, Instant moment, Lesson lesson, User author, Offer offer) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.moment = moment;
        this.lesson = lesson;
        this.author = author;
        this.offer = offer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Offer getOffer() {
        return offer;
    }

    public void setOffer(Offer offer) {
        this.offer = offer;
    }

    public Set<User> getLikes() {
        return likes;
    }

    public List<Reply> getReplies() {
        return replies;
    }

    public Reply getAnswer() {
        return answer;
    }

    public void setAnswer(Reply answer) {
        this.answer = answer;
    }
}
