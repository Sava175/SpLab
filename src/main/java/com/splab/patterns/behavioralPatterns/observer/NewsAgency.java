package com.splab.patterns.behavioralPatterns.observer;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class NewsAgency {
    private String news;
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setNews(String news) {
        this.news = news;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(news);
        }
    }
}
