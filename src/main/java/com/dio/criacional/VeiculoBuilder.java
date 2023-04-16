package com.dio.criacional;

public interface VeiculoBuilder {

    public VeiculoBuilder modelo(Enum modelo);

    public VeiculoBuilder cor(String cor);

    public VeiculoBuilder transmissao(String transmissao);

    public Veiculo builder();
}
