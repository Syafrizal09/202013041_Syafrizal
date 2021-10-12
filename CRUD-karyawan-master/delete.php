<?php
include_once("koneksi.php");

$id_karyawan = $_GET['id'];

$result = mysqli_query($mysqli, "DELETE FROM karyawan WHERE id_karyawan=$id_karyawan");

header("Location:index.php");

?>