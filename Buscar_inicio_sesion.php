<?php

//buscar producto

include 'conexion.php';

$codigo =$_POST['user'];
$codigo2 = $_POST['pass'];

$consulta="SELECT * FROM usuario
  WHERE corrreo_electronico LIKE '$codigo' AND contrasena LIKE '$codigo2'";
$resultado=mysqli_query($conexion,$consulta);

if(mysqli_num_rows($resultado) > 0){
  echo "Usuario encontrado";
}else{
  echo "Usuario o contraseña incorrecta";
}

mysqli_close($conexion);

?>
