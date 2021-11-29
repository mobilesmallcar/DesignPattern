package com.shaw.proxy._01Movie;

public class RealMovie implements Movie{
    @Override
    public void play() {
        System.out.println("你正在观看电影《肖申克的救赎》");
    }
}
