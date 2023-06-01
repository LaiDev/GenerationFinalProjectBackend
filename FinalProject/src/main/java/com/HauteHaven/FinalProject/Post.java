package com.HauteHaven.FinalProject;

import com.HauteHaven.FinalProject.controller.dto.PostDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    private Long id;
    private String title;

    private String description;
    private int date;
    private String imageUrl;

    public Post(){

    }

    public Post (PostDto postDto)
    {
        this.title = postDto.getTitle();
        this.description = postDto.getDescription();
        this.date = postDto.getDate();
        this.imageUrl = postDto.getImageUrl();
    }


    public  Post(Long id, String title,String description, int date, String imageUrl){
        this.id = id;
        this.title = title;
        this.description = description;
        this.date = date;
        this.imageUrl = imageUrl;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return date == post.date && Objects.equals(id, post.id) && Objects.equals(title, post.title) && Objects.equals(description, post.description) && Objects.equals(imageUrl, post.imageUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, date, imageUrl);
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
