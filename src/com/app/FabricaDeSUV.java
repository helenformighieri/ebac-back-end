package com.app;

public class FabricaDeSUV implements FabricaDeCarros{
    @Override
    public Carro criarCarro() {
        return new SUV();
    }
}
