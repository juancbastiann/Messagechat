package com.message.repositorio;

import java.util.ArrayList;
import java.util.List;

import com.message.dominio.Usuario;

public class UserRepo {

private List<Usuario> usuarios = new ArrayList<Usuario>();
	
	public UserRepo() {
		usuarios.add(new Usuario(1, "Raul", "Velez", "raul96", "https://th.bing.com/th/id/OIP.-VufqyQoeZBlhKwASGtKmwHaD4?pid=ImgDet&rs=1", "velez1234", "En linea"));
		usuarios.add(new Usuario(2, "Michelle", "Escobar", "michelle01", "https://pymstatic.com/10983/conversions/personas-introvertidas-social.jpg", "escobar123", "En linea"));
		usuarios.add(new Usuario(3, "Karmen", "Solis", "karmen23", "https://www.sapere.it/.imaging/default/dam/icone-sapere/IMMAGINI-VARIE/pillole/giornata-felicita-2/jcr:content.jpg", "solis123", "Desconectado"));
		usuarios.add(new Usuario(4, "Luisa", "Espinoza", "luisa02", "https://th.bing.com/th/id/OIP.M6YFxOa_CdfFu3gTy5yVKAHaLH?pid=ImgDet&rs=1", "espinoza123", "En linea"));
		usuarios.add(new Usuario(5, "Juan", "Vasquez", "juan10", "https://misimagenesde.com/wp-content/uploads/2012/12/foto.jpg", "j1234", "Desconectado"));
		usuarios.add(new Usuario(6, "Carlos", "Macias", "carlos98", "https://th.bing.com/th/id/OIP.5znDN5cK6beWIcW8RhHVAQAAAA?pid=ImgDet&rs=1", "c1234", "Desconectado"));
		usuarios.add(new Usuario(7, "Javier", "Hurtado", "javier95", "https://th.bing.com/th/id/OIP.IsVO1SVraMOMa2Ta-RKOUQHaFw?pid=ImgDet&rs=1", "j1234", "En linea"));
		usuarios.add(new Usuario(8, "Karen", "Gonzalez", "karen96", "https://th.bing.com/th/id/OIP.leWJJk-ZuUXBrA3nlsh4VQHaFM?pid=ImgDet&rs=1", "k1234", "Desconectado"));
		usuarios.add(new Usuario(9, "Susana", "Holguin", "susana01", "https://th.bing.com/th/id/R.ad20db62ee906cc9334513956851f0db?rik=iZeRqjP0fpa7QQ&pid=ImgRaw&r=0", "k1234", "Desconectado"));
		usuarios.add(new Usuario(10, "Luis", "Vivanco", "luis98", "https://th.bing.com/th/id/R.4871a2ed00640fe233fc86f3508a468c?rik=lEvaeIpOs6w8yQ&riu=http%3a%2f%2flavozdelmuro.net%2fwp-content%2fuploads%2f2015%2f06%2fpersonas_con_talento_10.jpg&ehk=bwFuv4ADoJr7C%2fUjr5YccBxrkkQuSnWhqqXU8O%2fb2so%3d&risl=&pid=ImgRaw&r=0", "k1234", "Desconectado"));
	}
	
	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public Usuario userId(int id) {
		for(Usuario user: usuarios) {
			if(user.getId() == id)
				return user;
		}
		return null;
	}
	
	public Usuario userName(String username) {
		for(Usuario user: usuarios) {
			if(user.getUsername().equals(username))
				return user;
		}
		return null;
	}
	
	public Usuario password(String username, String clave) {
		for(Usuario user: usuarios) {
			if(user.getUsername().equals(username) && user.getClave().equals(clave))
				return user;
		}
		return null;
	}
	
}
