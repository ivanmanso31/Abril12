package com.softtek.modelo;

public class IvaGeneral implements  IImpuesto{
    @Override
    public double calcularImpuesto(Producto p) {
        return p.getPrecio()*1.21;
    }
}
