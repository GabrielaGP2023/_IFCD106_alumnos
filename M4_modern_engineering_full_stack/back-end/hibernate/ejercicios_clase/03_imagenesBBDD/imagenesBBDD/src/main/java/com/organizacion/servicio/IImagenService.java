package com.organizacion.servicio;


import com.organizacion.modelo.Imagen;

public interface IImagenService {

	int guardar(Imagen imagen);
	byte[] leerImagen(Integer idImagen);
}
