package com.example.recycler_post;

public class Post {

    public int id;
    public String title;
    public int image;
    public int like;



    public Post(int id,String title, int image, int like) {

        this.title = title;
        this.image = image;
        this.like = like;
        this.id = id;

    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public int getImage() {

        return image;
    }

    public void setImage(int image) {

        this.image = image;
    }

    public int getLike() {

        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }
}
