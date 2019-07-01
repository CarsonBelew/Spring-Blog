package com.codeup.springblog.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue
    @Column(columnDefinition = "INT(11) UNSIGNED", name = "POST_ID")
    private long id;


    @JoinColumn(name = "user_id")
    private String author;

    @Column(columnDefinition = "TEXT")
    private String content;

    @Column(name = "DATE_PUBLISHED")
    private Date createdPost;

    @Column(name = "DATE_UPDATED")
    private Date updatedPost;
    private Date deletedPost;
    private String category;
    private boolean featuredPost;

    public Post(long id, String title, String body) {

    }

    public Post(String author, Date createdPost, Date updatedPost, Date deletedPost, String content, String category, boolean featuredPost) {
        this.author = author;
        this.createdPost = createdPost;
        this.updatedPost = updatedPost;
        this.deletedPost = deletedPost;
        this.content = content;
        this.category = category;
        this.featuredPost = featuredPost;
    }

    public long getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public Date getCreatedPost() {
        return createdPost;
    }

    public Date getUpdatedPost() {
        return updatedPost;
    }

    public Date getDeletedPost() {
        return deletedPost;
    }

    public String getContent() {
        return content;
    }

    public String getCategory() {
        return category;
    }

    public boolean isFeaturedPost() {
        return featuredPost;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCreatedPost(Date createdPost) {
        this.createdPost = createdPost;
    }

    public void setUpdatedPost(Date updatedPost) {
        this.updatedPost = updatedPost;
    }

    public void setDeletedPost(Date deletedPost) {
        this.deletedPost = deletedPost;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setFeaturedPost(boolean featuredPost) {
        this.featuredPost = featuredPost;
    }

}