<?php

//buscar producto

 include 'conexion.php';
$codigo=$_get['nombre']

$consulta="SELECT Nombre,apellido_paterno,apellido_materno,telefono FROM usuario Where nombre=$codigo  "
$resultado=$conexion->query($consulta);

while($fila=$resultado -> fetch_array()){
   $producto[]= array_map('utf8_encode', $fila);
}
echo json_encode($producto);
$resultado->close();

?>
