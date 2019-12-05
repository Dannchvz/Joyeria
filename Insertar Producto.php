<?php 

 //insertar producto
include 'conexion.php';
$json=array();
   if(isset($_GET["id_producto"])&&($_GET["id_tipo_producto"])&&($_GET["id_tipo_material"])&&($_GET["precio_venta"])&&($_GET["nombre"])&&($_GET["foto"])&&($_GET["descripcion"])&&($_GET["existencia"])&&($_GET["id_tipo_status"])

 $consulta="INSERT INTO `producto` (`id_producto`, `id_tipo_producto`, `id_tipo_material`, `precio_venta`, `precio_fabrica`, `nombre`, `foto`, `descripcion`, `existencia`, `id_tipo_status`) 
VALUES (NULL, '', '', '', '', '', '', '', '', '')"

mysqli_query($conexion,$consulta) or die (mysqli_error());
mysqli_close
?>


?>