package com.shaw.proxy._01Movie;

public class Cinema implements Movie{
    Movie movie;
    public Cinema(Movie movie){
        this.movie = movie;
    }

    @Override
    public void play() {
        heihei(true);
        movie.play();
        heihei(false);
    }
    private void heihei(Boolean flag){
        if(flag){
            System.out.println("电影马上开始了，等等小花");
        }else{
            System.out.println("深情表白，'小花，做我女朋友吧'");
        }
    }
}
