<?php

//buscar producto

 include 'conexion.php';
$codigo=$_get['correo_electronico']) $codigo2 $_get[contraseña];

$consulta="SELECT * FROM usuario WHERE correo_electronico='$codigo' and contraseña='$codigo2'"
$resultado=$conexion->query($consulta);

while($fila=$resultado -> fetch_array()){
   $producto[]= array_map('utf8_encode', $fila);
}
echo json_encode($producto);
$resultado->close();

?>
