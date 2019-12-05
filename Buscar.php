<?php

//buscar producto

/*
	1 Anillos
	2 Pulsera
	3 Collares
	4 Aretes
	5 Cadenas

*/
 include 'conexion.php';
$codigo=$_get['codigo'];

$consulta="SELECT * FROM `producto` WHERE id_tipo_producto=''"
$resultado=$conexion->query($consulta);

while($fila=$resultado -> fetch_array()){
   $producto[]= array_map('utf8_encode', $fila);
}
echo json_encode($producto);
$resultado->close();

?>