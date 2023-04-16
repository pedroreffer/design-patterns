package com.dio.estrutural;

public abstract class CafeDecorator implements Cafe {

    private final Cafe cafe;

    public CafeDecorator(Cafe cafe) {
        this.cafe = cafe;
    }

    @Override
    public double getPreco() {
        return cafe.getPreco();
    }

    @Override
    public String getComplementos() {
        return cafe.getComplementos();
    }
}
