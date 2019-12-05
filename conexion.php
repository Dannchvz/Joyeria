<?php
$hostname = '189.189.222.130';
$database = 'joyeria';
$username = 'batista';
$password = 'codesql';
$conexion = mysqli_connect($hostname,$username,$password,$database,3306);

	if (!$conexion) {
    	die('No pudo conectarse: ');
	}
	echo 'Conectado satisfactoriamente';
 
#Puerto 3306

 ?>

