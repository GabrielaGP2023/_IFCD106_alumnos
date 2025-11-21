package com.organizacion.modelo;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "imagenes")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Imagen {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idImagen;

	@Column(name = "filename", length = 50)
	private String filename;

	@Column(name = "filetype", length = 15)
	private String filetype;

	@Column(name = "content")
	private byte[] value;



}
