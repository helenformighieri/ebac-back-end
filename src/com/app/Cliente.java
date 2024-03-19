package com.app;

public class Cliente {
    public static void main(String[] args) {
        FabricaDeCarros fabricaDeSedan = new FabricaDeSedan();
        Carro sedan = fabricaDeSedan.criarCarro();
        sedan.exibirInformacao();

        FabricaDeCarros fabricaDeSUV = new FabricaDeSUV();
        Carro suv = fabricaDeSUV.criarCarro();
        suv.exibirInformacao();
    }
}
