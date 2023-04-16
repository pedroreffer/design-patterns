package com.dio.application;

import com.dio.comportamental.ObraCondominio;
import com.dio.comportamental.ProprietarioCasa;
import com.dio.criacional.FerrariBuilder;
import com.dio.criacional.FordBuilder;
import com.dio.criacional.Veiculo;
import com.dio.estrutural.Cafe;
import com.dio.estrutural.CafeComCanela;
import com.dio.estrutural.CafeComChocolate;
import com.dio.estrutural.CafeComLeite;
import com.dio.estrutural.CafeSimples;


public class DesignPatterns {

    public static void main(String[] args) {
        padraoDecorator();
        padraoObserver();
        padraoBuilder();
    }

    private static void padraoDecorator() {
        Cafe cafe = new CafeSimples();
        cafe.imprimir();

        cafe = new CafeComLeite(cafe);
        cafe.imprimir();

        cafe = new CafeComCanela(cafe);
        cafe.imprimir();

        cafe = new CafeComChocolate(cafe);
        cafe.imprimir();
    }

    private static void padraoObserver() {
        var pessoa1 = new ProprietarioCasa("João");
        var pessoa2 = new ProprietarioCasa("Maria");
        var pessoa3 = new ProprietarioCasa("José");

        var condominio = new ObraCondominio(300);

        condominio.registerObserver(pessoa1);
        condominio.registerObserver(pessoa2);
        condominio.registerObserver(pessoa3);


        condominio.setConstruidas(100);
        condominio.removeObserver(pessoa2);

        condominio.setConstruidas(150);
        condominio.setConstruidas(50);
        condominio.setConstruidas(1);
    }

    private static void padraoBuilder() {
        construirFerrari(FerrariBuilder.Modelo.GTB, "Amarela", "Automática");
        construirFerrari(FerrariBuilder.Modelo.F8_TRIBUTO, "Vermelha", "Automática");
        construirFerrari(FerrariBuilder.Modelo.SP51, "Preta", "Automática");

        construirFord(FordBuilder.Modelo.RANGER, "Prata", "Automática");
        construirFord(FordBuilder.Modelo.MAVERICK, "Verde", "Manual");
        construirFord(FordBuilder.Modelo.MUSTANG, "Laranja", "Automática");
    }

    private static void construirFerrari(FerrariBuilder.Modelo modelo, String cor, String transmissao) {

        Veiculo ferrari = new FerrariBuilder()
                        .modelo(modelo)
                        .cor(cor)
                        .transmissao(transmissao)
                        .builder();

        System.out.println(ferrari);
    }

    private static void construirFord(FordBuilder.Modelo modelo, String cor, String transmissao) {

        Veiculo ford = new FordBuilder()
                        .modelo(modelo)
                        .cor(cor)
                        .transmissao(transmissao)
                        .builder();

        System.out.println(ford);
    }
}
