<?php

//insertar un usuario 
include 'conexion.php';
$json=array();
   if(isset($_GET["id_usuario"])&&($_GET["id_codigo_postal])&&($_GET["curp"])&&($_GET["id_tipo_usuario"])&&($_GET["corrreo_electronico"])&&($_GET["telefono"])&&($_GET["nombre"])&&($_GET["apellido_paterno"])&&($_GET["apellido_materno"])&&($_GET["contrasena"])

 $consulta="INSERT INTO `usuario` (`id_usuario`, `id_codigo_postal`, `curp`, `id_tipo_usuario`, `corrreo_electronico`, `telefono`, `nombre`, `apellido_paterno`, `apellido_materno`, `contrasena`) 
VALUES (NULL, '', '', '', '', '', '', '', '', '')"

mysqli_query($conexion,$consulta) or die (mysqli_error());
mysqli_close
?>
