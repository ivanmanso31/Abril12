package com.softtek.persistencia;


import com.softtek.modelo.Orden;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class AccesoOrden extends Conexion{

    public List<Orden> obtenerOrdenes() throws SQLException, ClassNotFoundException {
        PreparedStatement sentencia;
        ResultSet resultado;
        String sql = "SELECT order_id, product_id, unit_price, quantity, discount FROM order_details";
        List<Orden> ordenes = new ArrayList<>();
        abrirConexion();
        sentencia = miConexion.prepareStatement(sql);
        resultado = sentencia.executeQuery();
        while (resultado.next()){
            ordenes.add(
                    new Orden(
                            resultado.getInt("order_id"),
                            resultado.getInt("product_id"),
                            resultado.getDouble("unit_price"),
                            resultado.getInt("quantity"),
                            resultado.getDouble("discount")
                    )
            );
        }
        miConexion.close();
        return ordenes;
    }
}
