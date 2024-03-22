package com.veiculos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new CarroEsportivo("Lamborguine"));
        listaCarros.add(new CarroSedan("Fusion"));

        for (Carro carro : listaCarros){
            carro.acelerar();
        }
    }
}
