package com.example.design.creational.abstractfactory;

public class PythonFactory implements CourseFactory {
    @Override
    public PythonVideo getVedio() {
        return new PythonVideo();
    }

    @Override
    public PythonArticle getArticle() {
        return new PythonArticle();
    }
}
