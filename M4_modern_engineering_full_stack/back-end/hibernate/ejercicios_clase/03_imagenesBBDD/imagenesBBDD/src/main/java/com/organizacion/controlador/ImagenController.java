package com.organizacion.controlador;

import com.organizacion.modelo.Imagen;
import com.organizacion.servicio.IImagenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.io.IOException;
@RestController
@RequestMapping("/imagenes")
@CrossOrigin(origins = "http://localhost:4200")
public class ImagenController {

	@Autowired
	private IImagenService serviceImagen;


	@PostMapping(value = "/subirImagen", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
	public ResponseEntity<Integer> guardarImagen(@RequestParam("adjunto") MultipartFile file) throws Exception{
		int rpta = 0;
		Imagen img = new Imagen();
		img.setFiletype(file.getContentType());
		img.setFilename(file.getOriginalFilename());
		img.setValue(file.getBytes());
		rpta = serviceImagen.guardar(img);
		return new ResponseEntity<Integer>(rpta, HttpStatus.OK);
	}

	@GetMapping(value = "/leerImagen/{idImagen}", produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
	public ResponseEntity<byte[]> leerImagen(@PathVariable("idImagen") Integer idArchivo) throws IOException {
		byte[] arr = serviceImagen.leerImagen(idArchivo);
		return new ResponseEntity<>(arr, HttpStatus.OK);
	}
}
