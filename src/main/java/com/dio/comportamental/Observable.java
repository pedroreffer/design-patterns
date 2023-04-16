package com.dio.comportamental;

public interface Observable {

    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();
}
