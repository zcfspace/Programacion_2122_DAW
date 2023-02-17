use carrera;

/*COCHES*/
INSERT INTO coche (idcoche, marca, modelo, peso, potencia)
       VALUES ('fer001', 'ferrari', '001', '1350' , '1500');
INSERT INTO coche (idcoche, marca, modelo, peso, potencia)
       VALUES ('fer002', 'ferrari', '002', '1500' , '1000');
INSERT INTO coche (idcoche, marca, modelo, peso, potencia)
       VALUES ('fer003', 'ferrari', '003', '1450' , '900');
INSERT INTO coche (idcoche, marca, modelo, peso, potencia)
       VALUES ('fer004', 'ferrari', '004', '1850' , '650');
INSERT INTO coche (idcoche, marca, modelo, peso, potencia)
       VALUES ('fer005', 'ferrari', '005', '1300' , '550');
INSERT INTO coche (idcoche, marca, modelo, peso, potencia)
       VALUES ('fer006', 'ferrari', '006', '1000' , '700');
INSERT INTO coche (idcoche, marca, modelo, peso, potencia)
       VALUES ('fer007', 'ferrari', '007', '1410' , '800');
INSERT INTO coche (idcoche, marca, modelo, peso, potencia)
       VALUES ('fer008', 'ferrari', '008', '1820' , '600');
INSERT INTO coche (idcoche, marca, modelo, peso, potencia)
       VALUES ('toyrav', 'toyota', 'rav4', '1800' , '210');
INSERT INTO coche (idcoche, marca, modelo, peso, potencia)
       VALUES ('mcl720', 'McLaren', '720S', '1500' , '700');

/*RUEDAS*/
INSERT INTO ruedas (idruedas,marca,modelo,dimensiones,peso,componente,estado,coche_idcoche,fecha,sesion)
       VALUES ('Dun1AA1', 'Dunlop', '1AA', '19' , '9', 'componente1', 'nuevo', 'fer001', '2018-01-29', '1');
INSERT INTO ruedas (idruedas,marca,modelo,dimensiones,peso,componente,estado,coche_idcoche,fecha,sesion)
       VALUES ('Dun2AA1', 'Dunlop', '1AA', '19' , '9', 'componente1', 'nuevo', 'fer001', '2018-01-29', '1');
INSERT INTO ruedas (idruedas,marca,modelo,dimensiones,peso,componente,estado,coche_idcoche,fecha,sesion)
       VALUES ('Dun3AA1', 'Dunlop', '1AA', '19' , '9', 'componente1', 'nuevo', 'fer001', '2018-01-29', '1');
INSERT INTO ruedas (idruedas,marca,modelo,dimensiones,peso,componente,estado,coche_idcoche,fecha,sesion)
       VALUES ('Dun4AA1', 'Dunlop', '1AA', '19' , '9', 'componente1', 'nuevo', 'fer001', '2018-01-29', '1');

INSERT INTO ruedas (idruedas,marca,modelo,dimensiones,peso,componente,estado,coche_idcoche,fecha,sesion)
       VALUES ('Dun1AA2', 'Dunlop', '2AA', '19' , '9', 'componente2', 'nuevo', 'fer002', '2018-04-29', '1');
INSERT INTO ruedas (idruedas,marca,modelo,dimensiones,peso,componente,estado,coche_idcoche,fecha,sesion)
       VALUES ('Dun2AA2', 'Dunlop', '2AA', '19' , '9', 'componente2', 'nuevo', 'fer002', '2018-04-29', '1');
INSERT INTO ruedas (idruedas,marca,modelo,dimensiones,peso,componente,estado,coche_idcoche,fecha,sesion)
       VALUES ('Dun3AA2', 'Dunlop', '2AA', '19' , '9', 'componente2', 'nuevo', 'fer002', '2018-04-29', '1');
INSERT INTO ruedas (idruedas,marca,modelo,dimensiones,peso,componente,estado,coche_idcoche,fecha,sesion)
       VALUES ('Dun4AA2', 'Dunlop', '2AA', '19' , '9', 'componente2', 'nuevo', 'fer002', '2018-04-29', '1');

INSERT INTO ruedas (idruedas,marca,modelo,dimensiones,peso,componente,estado,coche_idcoche,fecha,sesion)
       VALUES ('Dun1AA3', 'Dunlop', '3AA', '19' , '9', 'componente3', 'nuevo', 'fer003', '2018-05-20', '1');
INSERT INTO ruedas (idruedas,marca,modelo,dimensiones,peso,componente,estado,coche_idcoche,fecha,sesion)
       VALUES ('Dun2AA3', 'Dunlop', '3AA', '19' , '9', 'componente3', 'nuevo', 'fer003', '2018-05-20', '1');
INSERT INTO ruedas (idruedas,marca,modelo,dimensiones,peso,componente,estado,coche_idcoche,fecha,sesion)
       VALUES ('Dun3AA3', 'Dunlop', '3AA', '19' , '9', 'componente3', 'nuevo', 'fer003', '2018-05-20', '1');
INSERT INTO ruedas (idruedas,marca,modelo,dimensiones,peso,componente,estado,coche_idcoche,fecha,sesion)
       VALUES ('Dun4AA3', 'Dunlop', '3AA', '19' , '9', 'componente3', 'nuevo', 'fer003', '2018-05-20', '1');
       
INSERT INTO ruedas (idruedas,marca,modelo,dimensiones,peso,componente,estado,coche_idcoche,fecha,sesion)
       VALUES ('Dun1AA4', 'Dunlop', '4AA', '19' , '9', 'componente4', 'nuevo', 'fer004', '2020-05-10', '1');       
INSERT INTO ruedas (idruedas,marca,modelo,dimensiones,peso,componente,estado,coche_idcoche,fecha,sesion)
       VALUES ('Dun2AA4', 'Dunlop', '4AA', '19' , '9', 'componente4', 'nuevo', 'fer004', '2020-05-10', '1');       
INSERT INTO ruedas (idruedas,marca,modelo,dimensiones,peso,componente,estado,coche_idcoche,fecha,sesion)
       VALUES ('Dun3AA4', 'Dunlop', '4AA', '19' , '9', 'componente4', 'nuevo', 'fer004', '2020-05-10', '1');       
INSERT INTO ruedas (idruedas,marca,modelo,dimensiones,peso,componente,estado,coche_idcoche,fecha,sesion)
       VALUES ('Dun4AA4', 'Dunlop', '4AA', '19' , '9', 'componente4', 'nuevo', 'fer004', '2020-05-10', '1');       
 
INSERT INTO ruedas (idruedas,marca,modelo,dimensiones,peso,componente,estado,coche_idcoche,fecha,sesion)
       VALUES ('Dun1AA5', 'Dunlop', '5AA', '21' , '9', 'componente5', 'nuevo', 'fer005', '2020-01-10', '1');       
INSERT INTO ruedas (idruedas,marca,modelo,dimensiones,peso,componente,estado,coche_idcoche,fecha,sesion)
       VALUES ('Dun2AA5', 'Dunlop', '5AA', '21' , '9', 'componente5', 'nuevo', 'fer005', '2020-01-10', '1');       
INSERT INTO ruedas (idruedas,marca,modelo,dimensiones,peso,componente,estado,coche_idcoche,fecha,sesion)
       VALUES ('Dun3AA5', 'Dunlop', '5AA', '21' , '9', 'componente5', 'nuevo', 'fer005', '2020-01-10', '1');       
INSERT INTO ruedas (idruedas,marca,modelo,dimensiones,peso,componente,estado,coche_idcoche,fecha,sesion)
       VALUES ('Dun4AA5', 'Dunlop', '5AA', '21' , '9', 'componente5', 'nuevo', 'fer005', '2020-01-10', '1');       
 
INSERT INTO ruedas (idruedas,marca,modelo,dimensiones,peso,componente,estado,coche_idcoche,fecha,sesion)
       VALUES ('Dun1AA6', 'Dunlop', '6AA', '21' , '9', 'componente6', 'nuevo', 'fer006', '2020-03-15', '1');       
INSERT INTO ruedas (idruedas,marca,modelo,dimensiones,peso,componente,estado,coche_idcoche,fecha,sesion)
       VALUES ('Dun2AA6', 'Dunlop', '6AA', '21' , '9', 'componente6', 'nuevo', 'fer006', '2020-03-15', '1');       
INSERT INTO ruedas (idruedas,marca,modelo,dimensiones,peso,componente,estado,coche_idcoche,fecha,sesion)
       VALUES ('Dun3AA6', 'Dunlop', '6AA', '21' , '9', 'componente6', 'nuevo', 'fer006', '2020-03-15', '1');       
INSERT INTO ruedas (idruedas,marca,modelo,dimensiones,peso,componente,estado,coche_idcoche,fecha,sesion)
       VALUES ('Dun4AA6', 'Dunlop', '6AA', '21' , '9', 'componente6', 'nuevo', 'fer006', '2020-03-15', '1');       

INSERT INTO ruedas (idruedas,marca,modelo,dimensiones,peso,componente,estado,coche_idcoche,fecha,sesion)
       VALUES ('Dun1AA7', 'Dunlop', '7AA', '21' , '9', 'componente7', 'nuevo', 'fer007', '2020-04-25', '1');       
INSERT INTO ruedas (idruedas,marca,modelo,dimensiones,peso,componente,estado,coche_idcoche,fecha,sesion)
       VALUES ('Dun2AA7', 'Dunlop', '7AA', '21' , '9', 'componente7', 'nuevo', 'fer007', '2020-04-25', '1');       
INSERT INTO ruedas (idruedas,marca,modelo,dimensiones,peso,componente,estado,coche_idcoche,fecha,sesion)
       VALUES ('Dun3AA7', 'Dunlop', '7AA', '21' , '9', 'componente7', 'nuevo', 'fer007', '2020-04-25', '1');       
INSERT INTO ruedas (idruedas,marca,modelo,dimensiones,peso,componente,estado,coche_idcoche,fecha,sesion)
       VALUES ('Dun4AA7', 'Dunlop', '7AA', '21' , '9', 'componente7', 'nuevo', 'fer007', '2020-04-25', '1');       

INSERT INTO ruedas (idruedas,marca,modelo,dimensiones,peso,componente,estado,coche_idcoche,fecha,sesion)
       VALUES ('Dun1AA8', 'Dunlop', '8AA', '21' , '9', 'componente8', 'nuevo', 'fer008', '2022-03-14', '1');       
INSERT INTO ruedas (idruedas,marca,modelo,dimensiones,peso,componente,estado,coche_idcoche,fecha,sesion)
       VALUES ('Dun2AA8', 'Dunlop', '8AA', '21' , '9', 'componente8', 'nuevo', 'fer008', '2022-03-14', '1');       
INSERT INTO ruedas (idruedas,marca,modelo,dimensiones,peso,componente,estado,coche_idcoche,fecha,sesion)
       VALUES ('Dun3AA8', 'Dunlop', '8AA', '21' , '9', 'componente8', 'nuevo', 'fer008', '2022-03-14', '1');       
INSERT INTO ruedas (idruedas,marca,modelo,dimensiones,peso,componente,estado,coche_idcoche,fecha,sesion)
       VALUES ('Dun4AA8', 'Dunlop', '8AA', '21' , '9', 'componente8', 'nuevo', 'fer008', '2022-03-14', '1');       

INSERT INTO ruedas (idruedas,marca,modelo,dimensiones,peso,componente,estado,coche_idcoche,fecha,sesion)
       VALUES ('Dun1AA9', 'Dunlop', '9AA', '19' , '9', 'componente9', 'nuevo', 'toyrav', '2022-03-30', '1');
INSERT INTO ruedas (idruedas,marca,modelo,dimensiones,peso,componente,estado,coche_idcoche,fecha,sesion)
       VALUES ('Dun2AA9', 'Dunlop', '9AA', '19' , '9', 'componente9', 'nuevo', 'toyrav', '2022-03-30', '1');
INSERT INTO ruedas (idruedas,marca,modelo,dimensiones,peso,componente,estado,coche_idcoche,fecha,sesion)
       VALUES ('Dun3AA9', 'Dunlop', '9AA', '19' , '9', 'componente9', 'nuevo', 'toyrav', '2022-03-30', '1');
INSERT INTO ruedas (idruedas,marca,modelo,dimensiones,peso,componente,estado,coche_idcoche,fecha,sesion)
       VALUES ('Dun4AA9', 'Dunlop', '9AA', '19' , '9', 'componente9', 'nuevo', 'toyrav', '2022-03-30', '1');
       
INSERT INTO ruedas (idruedas,marca,modelo,dimensiones,peso,componente,estado,coche_idcoche,fecha,sesion)
       VALUES ('Dun1AA10', 'Dunlop', '10AA', '19' , '9', 'componente10', 'nuevo', 'McLaren', '2022-04-30', '1');
INSERT INTO ruedas (idruedas,marca,modelo,dimensiones,peso,componente,estado,coche_idcoche,fecha,sesion)
       VALUES ('Dun2AA10', 'Dunlop', '10AA', '19' , '9', 'componente10', 'nuevo', 'McLaren', '2022-04-30', '1');
INSERT INTO ruedas (idruedas,marca,modelo,dimensiones,peso,componente,estado,coche_idcoche,fecha,sesion)
       VALUES ('Dun3AA10', 'Dunlop', '10AA', '19' , '9', 'componente10', 'nuevo', 'McLaren', '2022-04-30', '1');
INSERT INTO ruedas (idruedas,marca,modelo,dimensiones,peso,componente,estado,coche_idcoche,fecha,sesion)
       VALUES ('Dun4AA10', 'Dunlop', '10AA', '19' , '9', 'componente10', 'nuevo', 'McLaren', '2022-04-30', '1');

/*PILOTOS*/
INSERT INTO piloto (idpiloto,dni ,nombre ,edad ,sexo ,direccion, coche_idcoche )
       VALUES ('pil99H', '20669499H', 'piloto10', '20' , 'M', 'calle 9', 'toyrav'); 
INSERT INTO piloto (idpiloto,dni ,nombre ,edad ,sexo ,direccion, coche_idcoche )
       VALUES ('pil90H', '20669490H', 'piloto9', '18' , 'M', 'calle 10', 'mcl720'); 
INSERT INTO piloto (idpiloto,dni ,nombre ,edad ,sexo ,direccion, coche_idcoche )
       VALUES ('pil91H', '20669491H', 'piloto1', '27' , 'M', 'calle 1', 'fer001'); 	
INSERT INTO piloto (idpiloto,dni ,nombre ,edad ,sexo ,direccion, coche_idcoche )
       VALUES ('pil92H', '20669492H', 'piloto2', '28' , 'M', 'calle 2', 'fer002'); 	
INSERT INTO piloto (idpiloto,dni ,nombre ,edad ,sexo ,direccion, coche_idcoche )
       VALUES ('pil93H', '20669493H', 'piloto3', '19' , 'F', 'calle 3', 'fer003'); 	
INSERT INTO piloto (idpiloto,dni ,nombre ,edad ,sexo ,direccion, coche_idcoche )
       VALUES ('pil94H', '20669494H', 'piloto4', '26' , 'M', 'calle 4', 'fer004'); 	
INSERT INTO piloto (idpiloto,dni ,nombre ,edad ,sexo ,direccion, coche_idcoche )
       VALUES ('pil95H', '20669495H', 'piloto5', '25' , 'M', 'calle 5', 'fer005'); 	
INSERT INTO piloto (idpiloto,dni ,nombre ,edad ,sexo ,direccion, coche_idcoche )
       VALUES ('pil96H', '20669496H', 'piloto6', '24' , 'M', 'calle 6', 'fer006'); 	
INSERT INTO piloto (idpiloto,dni ,nombre ,edad ,sexo ,direccion, coche_idcoche )
       VALUES ('pil97H', '20669497H', 'piloto7', '19' , 'M', 'calle 7', 'fer007'); 	
INSERT INTO piloto (idpiloto,dni ,nombre ,edad ,sexo ,direccion, coche_idcoche )
       VALUES ('pil98H', '20669498H', 'piloto8', '20' , 'M', 'calle 8', 'fer008'); 	

/*CAMPEONATOS*/
INSERT INTO campeonato (idcampeonato, nombre, anio, numpilotos, numcircuitos, piloto_ganador)
       VALUES ('ca2022', 'campeonato', '2022', '20' , '2', 'piloto1');
INSERT INTO campeonato (idcampeonato, nombre, anio, numpilotos, numcircuitos, piloto_ganador)
       VALUES ('ca2020', 'campeonato', '2020', '30' , '3', 'piloto5');
INSERT INTO campeonato (idcampeonato, nombre, anio, numpilotos, numcircuitos, piloto_ganador)
       VALUES ('ca2018', 'campeonato', '2018', '80' , '5', 'piloto4');  

/*CIRCUITOS*/
INSERT INTO  circuitos (idcircuitos, nombre, ciudad, pais, longitud, recordVuelta, numCurvas)
       VALUES ('franparis1', 'circuitos1', 'paris', 'francia' , '6','10', '5' );
INSERT INTO  circuitos (idcircuitos, nombre, ciudad, pais, longitud, recordVuelta, numCurvas)
       VALUES ('franparis2', 'circuitos2', 'paris', 'francia' , '5','10', '5' );
INSERT INTO  circuitos (idcircuitos, nombre, ciudad, pais, longitud, recordVuelta, numCurvas)
       VALUES ('franparis3', 'circuitos3', 'paris', 'francia' , '6','6', '4' );
INSERT INTO  circuitos (idcircuitos, nombre, ciudad, pais, longitud, recordVuelta, numCurvas)
       VALUES ('franparis4', 'circuitos4', 'paris', 'francia' , '7','10', '2' );
INSERT INTO  circuitos (idcircuitos, nombre, ciudad, pais, longitud, recordVuelta, numCurvas)
       VALUES ('franparis5', 'circuitos5', 'paris', 'francia' , '5','7', '6' );
INSERT INTO  circuitos (idcircuitos, nombre, ciudad, pais, longitud, recordVuelta, numCurvas)
       VALUES ('franparis6', 'circuitos6', 'paris', 'francia' , '6','10', '5' );
INSERT INTO  circuitos (idcircuitos, nombre, ciudad, pais, longitud, recordVuelta, numCurvas)
       VALUES ('franparis7', 'circuitos7', 'paris', 'francia' , '8','9', '5' );
INSERT INTO  circuitos (idcircuitos, nombre, ciudad, pais, longitud, recordVuelta, numCurvas)
       VALUES ('franparis8', 'circuitos8', 'paris', 'francia' , '5','10', '8' );
INSERT INTO  circuitos (idcircuitos, nombre, ciudad, pais, longitud, recordVuelta, numCurvas)
       VALUES ('franparis9', 'circuitos9', 'paris', 'francia' , '7','8', '6' );
INSERT INTO  circuitos (idcircuitos, nombre, ciudad, pais, longitud, recordVuelta, numCurvas)
       VALUES ('franpari10', 'circuitos10', 'paris', 'francia' , '6','10', '10' );
INSERT INTO  circuitos (idcircuitos, nombre, ciudad, pais, longitud, recordVuelta, numCurvas)
       VALUES ('franpari11', 'circuitos11', 'paris', 'francia' , '6','10', '5' );
INSERT INTO  circuitos (idcircuitos, nombre, ciudad, pais, longitud, recordVuelta, numCurvas)
       VALUES ('franpari12', 'circuitos1', 'paris', 'francia' , '6','10', '5' );


/*CARRERAS*/
INSERT INTO  carreras (idcarreras, numvueltas, vueltarapida,numaccidentes ,fecha, circuitos_idcircuitos, campeonato_idcampeonato)
       VALUES ('1carr2018', '10', '20', '5' ,'2018-04-30', 'franparis1', 'ca2018' );
INSERT INTO  carreras (idcarreras, numvueltas, vueltarapida,numaccidentes ,fecha, circuitos_idcircuitos, campeonato_idcampeonato)
       VALUES ('2carr2018', '8', '25.1', '5' ,'2018-04-30', 'franparis2', 'ca2018' );
INSERT INTO  carreras (idcarreras, numvueltas, vueltarapida,numaccidentes ,fecha, circuitos_idcircuitos, campeonato_idcampeonato)
       VALUES ('3carr2018', '10', '20.1', '5' ,'2018-04-30', 'franparis3', 'ca2018' );
INSERT INTO  carreras (idcarreras, numvueltas, vueltarapida,numaccidentes ,fecha, circuitos_idcircuitos, campeonato_idcampeonato)
       VALUES ('4carr2018', '9', '30', '5' ,'2018-04-30', 'franparis4', 'ca2018' );
INSERT INTO  carreras (idcarreras, numvueltas, vueltarapida,numaccidentes ,fecha, circuitos_idcircuitos, campeonato_idcampeonato)
       VALUES ('5carr2020', '10', '20.1', '5' ,'2020-04-30', 'franparis5', 'ca2020' );
INSERT INTO  carreras (idcarreras, numvueltas, vueltarapida,numaccidentes ,fecha, circuitos_idcircuitos, campeonato_idcampeonato)
       VALUES ('6carr2020', '10', '20.1', '5' ,'2020-04-30', 'franparis6', 'ca2020' );
INSERT INTO  carreras (idcarreras, numvueltas, vueltarapida,numaccidentes ,fecha, circuitos_idcircuitos, campeonato_idcampeonato)
       VALUES ('7carr2020', '10', '20.1', '5','2020-04-30', 'franparis7', 'ca2020' );
INSERT INTO  carreras (idcarreras, numvueltas, vueltarapida,numaccidentes ,fecha, circuitos_idcircuitos, campeonato_idcampeonato)
       VALUES ('8carr2020', '5', '20.1', '5','2020-04-30', 'franparis8', 'ca2020' );
INSERT INTO  carreras (idcarreras, numvueltas, vueltarapida,numaccidentes ,fecha, circuitos_idcircuitos, campeonato_idcampeonato)
       VALUES ('9carr2020', '10', '20.1', '5' ,'2020-04-30', 'franparis9', 'ca2020' );
INSERT INTO  carreras (idcarreras, numvueltas, vueltarapida,numaccidentes ,fecha, circuitos_idcircuitos, campeonato_idcampeonato)
       VALUES ('10carr2022', '10', '20.1', '5' ,'2022-04-30', 'franpari10', 'ca2022' );
INSERT INTO  carreras (idcarreras, numvueltas, vueltarapida,numaccidentes ,fecha, circuitos_idcircuitos, campeonato_idcampeonato)
       VALUES ('11carr2022', '10', '50', '5' ,'2022-04-30', 'franpari11', 'ca2022' );
INSERT INTO  carreras (idcarreras, numvueltas, vueltarapida,numaccidentes ,fecha, circuitos_idcircuitos, campeonato_idcampeonato)
       VALUES ('12carr2022', '15', '20.1', '5' ,'2022-04-30', 'franpari12', 'ca2022' );
INSERT INTO  carreras (idcarreras, numvueltas, vueltarapida,numaccidentes ,fecha, circuitos_idcircuitos, campeonato_idcampeonato)
       VALUES ('13carr2018', '11', '24.5', '5' ,'2018-04-30', 'franparis1', 'ca2018' );
INSERT INTO  carreras (idcarreras, numvueltas, vueltarapida,numaccidentes ,fecha, circuitos_idcircuitos, campeonato_idcampeonato)
       VALUES ('14carr2018', '10', '20.1', '5' ,'2018-04-30', 'franparis2', 'ca2018' );
INSERT INTO  carreras (idcarreras, numvueltas, vueltarapida,numaccidentes ,fecha, circuitos_idcircuitos, campeonato_idcampeonato)
       VALUES ('15carr2018', '10', '20.1', '5' ,'2018-04-30', 'franparis3', 'ca2018' );

/*carreras_has_piloto*/
INSERT INTO carreras_has_piloto (carreras_idcarreras, piloto_idpiloto, vueltarapida)
       VALUES ('1carr2018','pil90H','20');
INSERT INTO  carreras_has_piloto  (carreras_idcarreras, piloto_idpiloto, vueltarapida)
       VALUES ('2carr2018','pil91H','19');
INSERT INTO  carreras_has_piloto (carreras_idcarreras, piloto_idpiloto, vueltarapida)
       VALUES ('3carr2018','pil91H','20.5');
INSERT INTO  carreras_has_piloto (carreras_idcarreras, piloto_idpiloto, vueltarapida)
       VALUES ('4carr2018','pil91H','19');
INSERT INTO  carreras_has_piloto (carreras_idcarreras, piloto_idpiloto, vueltarapida)
       VALUES ('5carr2020','pil91H','18');
INSERT INTO  carreras_has_piloto (carreras_idcarreras, piloto_idpiloto, vueltarapida)
       VALUES ('6carr2020','pil91H','19');
INSERT INTO  carreras_has_piloto (carreras_idscarreras, piloto_idpiloto, vueltarapida)
       VALUES ('7carr2020','pil98H','19');
INSERT INTO  carreras_has_piloto (carreras_idcarreras, piloto_idpiloto, vueltarapida)
       VALUES ('8carr2020','pil91H','19');



