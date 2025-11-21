package com.organizacion.servicio.impl;

import java.util.Optional;

import com.organizacion.modelo.Imagen;

import com.organizacion.repo.IImagenRepo;
import com.organizacion.servicio.IImagenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ImagenServiceImpl implements IImagenService {

	@Autowired
	private IImagenRepo repo;



	@Override
	public int guardar(Imagen imagen) {
		Imagen img = repo.save(imagen);
		return img.getIdImagen() > 0 ? 1 : 0;
	}

	@Override
	public byte[] leerImagen(Integer idImagen) {
		Optional<Imagen> op = repo.findById(idImagen);
		return op.isPresent() ? op.get().getValue() : new byte[0];
	}

}
