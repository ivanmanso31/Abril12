package com.softtek.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Orden {

    private int id;
    private int idProducto;
    private double precioUnitario;
    private int cantidad;
    private double descuento;

}
