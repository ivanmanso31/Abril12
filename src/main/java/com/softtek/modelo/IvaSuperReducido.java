package com.softtek.modelo;

public class IvaSuperReducido implements IImpuesto{
    @Override
    public double calcularImpuesto(Producto p) {
        return p.getPrecio()*1.04;
    }
}
