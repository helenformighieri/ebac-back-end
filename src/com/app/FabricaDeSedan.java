package com.app;

public class FabricaDeSedan implements FabricaDeCarros{
    @Override
    public Carro criarCarro() {
        return new Sedan();
    }
}
