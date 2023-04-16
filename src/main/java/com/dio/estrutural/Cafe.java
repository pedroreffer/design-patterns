package com.dio.estrutural;

public interface Cafe {

    public double getPreco();

    public String getComplementos();

    default void imprimir() {
        System.out.println(String.format("\nValor Total: R$ %.2f\n%s", this.getPreco(), this.getComplementos()));
    }
}
