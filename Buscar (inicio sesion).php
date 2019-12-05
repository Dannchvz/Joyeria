<?php

//buscar producto

 include 'conexion.php';
$codigo=$_get['codigo'];

$consulta="SELECT * FROM usuario WHERE correo_electronico='' and contraseña=''"
$resultado=$conexion->query($consulta);

while($fila=$resultado -> fetch_array()){
   $producto[]= array_map('utf8_encode', $fila);
}
echo json_encode($producto);
$resultado->close();

?>
