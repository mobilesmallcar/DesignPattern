package com.shaw.proxy._01Movie;

public class ProxyTest {
    public static void main(String[] args){
        Movie movie = new RealMovie();
        Cinema cinema = new Cinema(movie);
        cinema.play();
    }
}

