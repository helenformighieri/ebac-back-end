package com.veiculos;

public class CarroEsportivo extends Carro{
    public CarroEsportivo(String modelo) {
        super(modelo);
    }

    @Override
    public void acelerar() {
        System.out.println("O carro esportivo " + getModelo() + " está acelerando rápidamente!");
    }
}
