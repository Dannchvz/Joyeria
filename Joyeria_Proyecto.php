<?php
	require "conn.php";

	$FP= $_POST['FP'];
	$fecha = gmdate("Y-m-d H:i:s");
	$curpUsuario = $_POST['curpUsuario'];
	$nivelUsuario = $_POST['nivelUsuario'];



	mysqli_close($conn);
	echo json_encode($json);
?>