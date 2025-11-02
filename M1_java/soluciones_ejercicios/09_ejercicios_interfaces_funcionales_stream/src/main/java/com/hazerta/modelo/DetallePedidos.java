package com.hazerta.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class DetallePedidos {
    private int id;
    private int productId;
    private double precio;
    private int cantidad;


}
