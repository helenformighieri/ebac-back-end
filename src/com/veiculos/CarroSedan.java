package com.veiculos;

public class CarroSedan extends Carro{
    public CarroSedan(String modelo) {
        super(modelo);
    }

    @Override
    public void acelerar() {
        System.out.println("O carro sedan " + getModelo() + " esta acelerando suavemente");
    }
}
