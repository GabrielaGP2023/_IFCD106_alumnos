package com.hazerta.modelo;

import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class Producto {
    @NonNull int id;
    @NonNull String nombre;
    Integer categoriaId;
    Double precio;
    Integer cantidadExistencia;






}
