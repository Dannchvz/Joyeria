<?php

//insertar un usuario
  include 'conexion.php';

  $nom = $_POST['nom'];
  $app = $_POST['app'];
  $apm = $_POST['apm'];
  $cur = $_POST['cur'];
  $cor = $_POST['cor'];
  $tel = $_POST['tel'];
  $cal = $_POST['cal'];
  $ni = $_POST['ni'];
  $ne = $_POST['ne'];
  $cp = $_POST['cp'];
  $mun = $_POST['mun'];
  $est = $_POST['est'];
  $pai = $_POST['pai'];

  $sql = "INSERT INTO usuario (id_codigo_postal,curp,id_tipo_usuario,corrreo_electronico,telefono,nombre,apellido_paterno, apellido_materno,contrasena)
  VALUES ('$cp','$cur','1','$cor','$tel','$nom','$app','$apm','123456789')";
  mysqli_query($conexion,$sql);

  $sql = "SELECT MAX(id_usuario) id_usuario FROM usuario";
  $result = mysqli_query($conexion,$sql);
  $row = mysqli_fetch_assoc($result);
  $id_usuario = $row["id_usuario"];

  echo $id_usuario;

  $sql = "INSERT INTO dirrecion (id_usuario, calle, numero_int)
  VALUES ('$id_usuario','$cal','$ni')";

  mysqli_query($conexion,$sql);


  echo mysqli_error($conexion);
?>
