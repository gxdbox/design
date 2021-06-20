package com.example.design.creational.abstractfactory;

public class JavaFactory implements CourseFactory{
    @Override
    public JavaVideo getVedio() {
        return new JavaVideo();
    }

    @Override
    public JavaArticle getArticle() {
        return new JavaArticle();
    }
}
