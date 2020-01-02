<?php
include 'conexion.php';

$stmt=$conn->prepare("SELECT id_producto, id_tipo_producto, id_tipo_material, precio_venta, precio_fabrica, nombre, foto, descripcion, existencia,id_tipo_status FROM productos;");
$stmt->execute();

$stmt->bind_result($id_producto, $id_tipo_producto, $id_tipo_material, $precio_venta, $precio_fabrica, $nombre, $foto, $descripcion, $existencia,$id_tipo_status);
$gamers = array();

while($stmt->fetch()){
$temp=array();
$temp['id']=$id_producto;
$temp[]=$id_tipo_producto;
$temp[]=$id_tipo_material;
$temp[]=$precio_venta;
$temp[]=$precio_fabrica;
$temp[]=$nombre;
$temp[]=$foto;
$temp[]=$descripcion;
$temp[]=$existencia;
$temp[]=$id_tipo_status;
array_push($gamers, $temp);

echo json_encode($gamers);
?>