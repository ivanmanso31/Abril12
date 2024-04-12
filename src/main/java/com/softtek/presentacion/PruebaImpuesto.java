package com.softtek.presentacion;

import com.softtek.modelo.Factura;
import com.softtek.modelo.IvaGeneral;
import com.softtek.modelo.IvaSuperReducido;
import com.softtek.modelo.Producto;

import java.util.ArrayList;
import java.util.List;

public class PruebaImpuesto {
    public static void main(String[] args) {
        IvaGeneral ig = new IvaGeneral();
        IvaSuperReducido isr = new IvaSuperReducido();
        Producto p1 = new Producto("PS5",499.99);
        Producto p2 = new Producto("Pan",0.75);
        Producto p3 = new Producto("Libro",15);
        List<Producto> productosList = new ArrayList<>();
        productosList.add(p1);
        productosList.add(p2);
        productosList.add(p3);
        Factura f1 = new Factura(ig,productosList);
        Factura f2 = new Factura(isr,productosList);
        System.out.println(f1.calcularTotalFactura());
        System.out.println(f2.calcularTotalFactura());
    }
}
