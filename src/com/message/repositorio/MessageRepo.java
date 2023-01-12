package com.message.repositorio;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.message.dominio.Mensaje;
import com.message.dominio.Usuario;

public class MessageRepo {
	
	private List<Mensaje> mensajes = new ArrayList<Mensaje>();
	private UserRepo usuario = new UserRepo();
	
	public MessageRepo() {
		Usuario raul = usuario.userId(1);
		Usuario michelle = usuario.userId(2);
		Usuario karmen = usuario.userId(3);
		Usuario luisa = usuario.userId(4);
		Usuario juan = usuario.userId(5);
		Usuario carlos = usuario.userId(6);
		Usuario javier = usuario.userId(7);
		Usuario karen = usuario.userId(8);
		Usuario susana = usuario.userId(9);
		Usuario luis = usuario.userId(10);
		
		//CONVERSACIONES DE MAURICIO//
		mensajes.add(new Mensaje(1, michelle, raul, LocalDateTime.of(2022, 11, 16, 12, 30), "Hola Rau como estas"));
		mensajes.add(new Mensaje(2, raul, michelle, LocalDateTime.of(2022, 11, 16, 12, 30), "Hola enana bien y tu como has estado"));
		
		mensajes.add(new Mensaje(3, raul, karmen, LocalDateTime.of(2022, 11, 16, 12, 30), "Oye cierto que el viernes hay un evento en la facultdad"));
		mensajes.add(new Mensaje(4, karmen, raul, LocalDateTime.of(2022, 11, 16, 12, 30), "Sii es a las 10 es obligatorio ir"));
		
		mensajes.add(new Mensaje(5, raul, luisa, LocalDateTime.of(2022, 11, 16, 12, 30), "Hola perdida"));
		mensajes.add(new Mensaje(6, luisa, raul, LocalDateTime.of(2022, 11, 16, 12, 30), "kheee perdida yo xd"));
		
		mensajes.add(new Mensaje(7, juan, raul, LocalDateTime.of(2022, 11, 16, 12, 30), "Que hay bro pilas el sabado vamos a jugar futbol"));
		mensajes.add(new Mensaje(8, raul, juan, LocalDateTime.of(2022, 11, 16, 12, 30), "Ya de una confirma si van todos"));
		
		mensajes.add(new Mensaje(9, raul, carlos, LocalDateTime.of(2022, 11, 16, 12, 30), "Como vas con el proyecto de programacion"));
		mensajes.add(new Mensaje(10, carlos, raul, LocalDateTime.of(2022, 11, 16, 12, 30), "Ya casi lo termino esta heavy jaja"));
		
		mensajes.add(new Mensaje(11, raul, javier, LocalDateTime.of(2022, 11, 16, 12, 30), "Todo bien socio confirma donde andas"));
		mensajes.add(new Mensaje(12, javier, raul, LocalDateTime.of(2022, 11, 16, 12, 30), "Aqui en caleta viendo los partidos del mundial"));
		
		mensajes.add(new Mensaje(13, karen, raul, LocalDateTime.of(2022, 11, 16, 12, 30), "Holis bobis como estas"));
		mensajes.add(new Mensaje(14, raul, karen, LocalDateTime.of(2022, 11, 16, 12, 30), "Holaaaa mocosa bien y tu"));
		
		mensajes.add(new Mensaje(14, raul, susana, LocalDateTime.of(2022, 11, 16, 12, 30), "Hola Susy"));
		mensajes.add(new Mensaje(15, susana, raul, LocalDateTime.of(2022, 11, 16, 12, 30), "Holis amiwoooo como estas"));
		
		mensajes.add(new Mensaje(16, luis, raul, LocalDateTime.of(2022, 11, 16, 12, 30), "Que mas mijin"));
		mensajes.add(new Mensaje(17, raul, luis, LocalDateTime.of(2022, 11, 16, 12, 30), "Confirma pechin"));
		
		//CONVERSACIONES DE MICHELLE//
		mensajes.add(new Mensaje(18, michelle, karmen, LocalDateTime.of(2022, 11, 16, 12, 30), "Hola amiguis como te ha ido"));
		mensajes.add(new Mensaje(19, karmen, michelle, LocalDateTime.of(2022, 11, 16, 12, 30), "Holiiiis bien horita me estoy haciendo las uñas"));
		
		mensajes.add(new Mensaje(20, michelle, luisa, LocalDateTime.of(2022, 11, 16, 12, 30), "Denisse te tengo un chisme jaja"));
		mensajes.add(new Mensaje(21, luisa, michelle, LocalDateTime.of(2022, 11, 16, 12, 30), "Aver cuenta cuenta xd"));
		
		mensajes.add(new Mensaje(22, juan, michelle, LocalDateTime.of(2022, 11, 16, 12, 30), "Hola guapa cuando nos vemos"));
		mensajes.add(new Mensaje(23, michelle, juan, LocalDateTime.of(2022, 11, 16, 12, 30), "nunca jajaja"));
		
		mensajes.add(new Mensaje(24, michelle, carlos, LocalDateTime.of(2022, 11, 16, 12, 30), "Holiiiis ayudame en programacion :c"));
		mensajes.add(new Mensaje(25, carlos, michelle, LocalDateTime.of(2022, 11, 16, 12, 30), "jaja dime en que quieres que te ayude"));
		
		mensajes.add(new Mensaje(26, michelle, javier, LocalDateTime.of(2022, 11, 16, 12, 30), "Holis amiwoooo como estas"));
		mensajes.add(new Mensaje(27, javier, michelle, LocalDateTime.of(2022, 11, 16, 12, 30), "Hola miche bien aqui trabajando y tu"));
		
		mensajes.add(new Mensaje(28, karen, michelle, LocalDateTime.of(2022, 11, 16, 12, 30), "Holis bobita oye pasame el deber de estadistica"));
		mensajes.add(new Mensaje(29, michelle, karen, LocalDateTime.of(2022, 11, 16, 12, 30), "como que bobita ya te lo paso xd"));
		
		mensajes.add(new Mensaje(30, michelle, susana, LocalDateTime.of(2022, 11, 16, 12, 30), "Holis no te olvides el dia sabado ir a la fiesta de Magaly"));
		mensajes.add(new Mensaje(31, susana, michelle, LocalDateTime.of(2022, 11, 16, 12, 30), "Si amiga ahi voy a estar"));
		
		mensajes.add(new Mensaje(32, luis, michelle, LocalDateTime.of(2022, 11, 16, 12, 30), "Holis perdida como estas"));
		mensajes.add(new Mensaje(33, michelle, luis, LocalDateTime.of(2022, 11, 16, 12, 30), "jaja como que perdida si tu eres el que te pierdes"));
		
		//CONVERSACIONES DE HILARY//
		mensajes.add(new Mensaje(34, karmen, luisa, LocalDateTime.of(2022, 11, 16, 12, 30), "Denisse te tengo un chisme jaja"));
		mensajes.add(new Mensaje(35, luisa, karmen, LocalDateTime.of(2022, 11, 16, 12, 30), "Aver cuenta cuenta xd"));
		
		mensajes.add(new Mensaje(36, juan, karmen, LocalDateTime.of(2022, 11, 16, 12, 30), "Hola guapa cuando nos vemos"));
		mensajes.add(new Mensaje(37, karmen, juan, LocalDateTime.of(2022, 11, 16, 12, 30), "nunca jajaja"));
		
		mensajes.add(new Mensaje(38, karmen, carlos, LocalDateTime.of(2022, 11, 16, 12, 30), "Holiiiis ayudame en programacion :c"));
		mensajes.add(new Mensaje(39, carlos, karmen, LocalDateTime.of(2022, 11, 16, 12, 30), "jaja dime en que quieres que te ayude"));
		
		mensajes.add(new Mensaje(40, karmen, javier, LocalDateTime.of(2022, 11, 16, 12, 30), "Holis amiwoooo como estas"));
		mensajes.add(new Mensaje(41, javier, karmen, LocalDateTime.of(2022, 11, 16, 12, 30), "Hola miche bien aqui trabajando y tu"));
		
		mensajes.add(new Mensaje(42, karen, karmen, LocalDateTime.of(2022, 11, 16, 12, 30), "Holis bobita oye pasame el deber de estadistica"));
		mensajes.add(new Mensaje(43, karmen, karen, LocalDateTime.of(2022, 11, 16, 12, 30), "como que bobita ya te lo paso xd"));
		
		mensajes.add(new Mensaje(44, karmen, susana, LocalDateTime.of(2022, 11, 16, 12, 30), "Holis no te olvides el dia sabado ir a la fiesta de Magaly"));
		mensajes.add(new Mensaje(45, susana, karmen, LocalDateTime.of(2022, 11, 16, 12, 30), "Si amiga ahi voy a estar"));
		
		mensajes.add(new Mensaje(46, luis, karmen, LocalDateTime.of(2022, 11, 16, 12, 30), "Holis perdida como estas"));
		mensajes.add(new Mensaje(47, karmen, luis, LocalDateTime.of(2022, 11, 16, 12, 30), "jaja como que perdida si tu eres el que te pierdes"));
		
		//CONVERSACIONES DE DENISSE//
		mensajes.add(new Mensaje(48, juan, luisa, LocalDateTime.of(2022, 11, 16, 12, 30), "Hola guapa cuando nos vemos"));
		mensajes.add(new Mensaje(49, luisa, juan, LocalDateTime.of(2022, 11, 16, 12, 30), "nunca jajaja"));
		
		mensajes.add(new Mensaje(50, luisa, carlos, LocalDateTime.of(2022, 11, 16, 12, 30), "Holiiiis ayudame en programacion :c"));
		mensajes.add(new Mensaje(51, carlos, luisa, LocalDateTime.of(2022, 11, 16, 12, 30), "jaja dime en que quieres que te ayude"));
		
		mensajes.add(new Mensaje(52, luisa, javier, LocalDateTime.of(2022, 11, 16, 12, 30), "Holis amiwoooo como estas"));
		mensajes.add(new Mensaje(53, javier, luisa, LocalDateTime.of(2022, 11, 16, 12, 30), "Hola miche bien aqui trabajando y tu"));
		
		mensajes.add(new Mensaje(54, karen, luisa, LocalDateTime.of(2022, 11, 16, 12, 30), "Holis bobita oye pasame el deber de estadistica"));
		mensajes.add(new Mensaje(55, luisa, karen, LocalDateTime.of(2022, 11, 16, 12, 30), "como que bobita ya te lo paso xd"));
		
		mensajes.add(new Mensaje(56, luisa, susana, LocalDateTime.of(2022, 11, 16, 12, 30), "Holis no te olvides el dia sabado ir a la fiesta de Magaly"));
		mensajes.add(new Mensaje(57, susana, luisa, LocalDateTime.of(2022, 11, 16, 12, 30), "Si amiga ahi voy a estar"));
		
		mensajes.add(new Mensaje(58, luis, luisa, LocalDateTime.of(2022, 11, 16, 12, 30), "Holis perdida como estas"));
		mensajes.add(new Mensaje(59, luisa, luis, LocalDateTime.of(2022, 11, 16, 12, 30), "jaja como que perdida si tu eres el que te pierdes"));
		
		//CONVERSACIONES DE JUAN//
		mensajes.add(new Mensaje(60, juan, carlos, LocalDateTime.of(2022, 11, 16, 12, 30), "Como vas con el proyecto de programacion"));
		mensajes.add(new Mensaje(61, carlos, juan, LocalDateTime.of(2022, 11, 16, 12, 30), "Ya casi lo termino esta heavy jaja"));
		
		mensajes.add(new Mensaje(62, juan, javier, LocalDateTime.of(2022, 11, 16, 12, 30), "Todo bien socio confirma donde andas"));
		mensajes.add(new Mensaje(63, javier, juan, LocalDateTime.of(2022, 11, 16, 12, 30), "Aqui en caleta viendo los partidos del mundial"));
		
		mensajes.add(new Mensaje(64, karen, juan, LocalDateTime.of(2022, 11, 16, 12, 30), "Holis bobis como estas"));
		mensajes.add(new Mensaje(65, juan, karen, LocalDateTime.of(2022, 11, 16, 12, 30), "Holaaaa mocosa bien y tu"));
		
		mensajes.add(new Mensaje(66, juan, susana, LocalDateTime.of(2022, 11, 16, 12, 30), "Hola Susy"));
		mensajes.add(new Mensaje(67, susana, juan, LocalDateTime.of(2022, 11, 16, 12, 30), "Holis amiwoooo como estas"));
		
		mensajes.add(new Mensaje(68, luis, juan, LocalDateTime.of(2022, 11, 16, 12, 30), "Que mas mijin"));
		mensajes.add(new Mensaje(69, juan, luis, LocalDateTime.of(2022, 11, 16, 12, 30), "Confirma pechin"));
		
		//CONVERSACIONES DE CARLOS//
		mensajes.add(new Mensaje(70, carlos, javier, LocalDateTime.of(2022, 11, 16, 12, 30), "Todo bien socio confirma donde andas"));
		mensajes.add(new Mensaje(71, javier, carlos, LocalDateTime.of(2022, 11, 16, 12, 30), "Aqui en caleta viendo los partidos del mundial"));
		
		mensajes.add(new Mensaje(72, karen, carlos, LocalDateTime.of(2022, 11, 16, 12, 30), "Holis bobis como estas"));
		mensajes.add(new Mensaje(73, carlos, karen, LocalDateTime.of(2022, 11, 16, 12, 30), "Holaaaa mocosa bien y tu"));
		
		mensajes.add(new Mensaje(74, carlos, susana, LocalDateTime.of(2022, 11, 16, 12, 30), "Hola Susy"));
		mensajes.add(new Mensaje(75, susana, carlos, LocalDateTime.of(2022, 11, 16, 12, 30), "Holis amiwoooo como estas"));
		
		mensajes.add(new Mensaje(76, luis, carlos, LocalDateTime.of(2022, 11, 16, 12, 30), "Que mas mijin"));
		mensajes.add(new Mensaje(77, carlos, luis, LocalDateTime.of(2022, 11, 16, 12, 30), "Confirma pechin"));
		
		//CONVERSACIONES DE JAVIER//
		mensajes.add(new Mensaje(78, karen, javier, LocalDateTime.of(2022, 11, 16, 12, 30), "Holis bobis como estas"));
		mensajes.add(new Mensaje(79, javier, karen, LocalDateTime.of(2022, 11, 16, 12, 30), "Holaaaa mocosa bien y tu"));
		
		mensajes.add(new Mensaje(80, javier, susana, LocalDateTime.of(2022, 11, 16, 12, 30), "Hola Susy"));
		mensajes.add(new Mensaje(81, susana, javier, LocalDateTime.of(2022, 11, 16, 12, 30), "Holis amiwoooo como estas"));
		
		mensajes.add(new Mensaje(82, luis, javier, LocalDateTime.of(2022, 11, 16, 12, 30), "Que mas mijin"));
		mensajes.add(new Mensaje(83, javier, luis, LocalDateTime.of(2022, 11, 16, 12, 30), "Confirma pechin"));
		
		//CONVERSACIONES DE KAREN//
		mensajes.add(new Mensaje(84, karen, susana, LocalDateTime.of(2022, 11, 16, 12, 30), "Holis no te olvides el dia sabado ir a la fiesta de Magaly"));
		mensajes.add(new Mensaje(85, susana, karen, LocalDateTime.of(2022, 11, 16, 12, 30), "Si amiga ahi voy a estar"));
		
		mensajes.add(new Mensaje(87, luis, karen, LocalDateTime.of(2022, 11, 16, 12, 30), "Holis perdida como estas"));
		mensajes.add(new Mensaje(88, karen, luis, LocalDateTime.of(2022, 11, 16, 12, 30), "jaja como que perdida si tu eres el que te pierdes"));
		
		//CONVERSACIONES DE SUSANA//
		mensajes.add(new Mensaje(89, luis, susana, LocalDateTime.of(2022, 11, 16, 12, 30), "Holis perdida como estas"));
		mensajes.add(new Mensaje(90, susana, luis, LocalDateTime.of(2022, 11, 16, 12, 30), "jaja como que perdida si tu eres el que te pierdes"));
		
	}
	
	public List<Mensaje> getMensajes(){
		return mensajes;
	}
	
	public List<Mensaje> conversaciones(int usuario1, int usuario2) {
		List<Mensaje> resultado = new ArrayList<Mensaje>();
		for(Mensaje msj: mensajes) {
			if((msj.getUsuario1().getId() == usuario1 && msj.getUsuario2().getId() == usuario2) || (
					msj.getUsuario1().getId() == usuario2 && msj.getUsuario2().getId() == usuario1))
				resultado.add(msj);
		}
		return resultado;		
	}
	
	public Mensaje getUltimoMsj(int usuario1, int usuario2) {
		List<Mensaje> resultado = conversaciones(usuario1, usuario2);
		
		if(resultado.size() == 0)
			return null;
		return resultado.get(resultado.size()-1);		
	}
	
	public void addMensajes(Mensaje mensaje) {
		mensajes.add(mensaje);		
	}

}
