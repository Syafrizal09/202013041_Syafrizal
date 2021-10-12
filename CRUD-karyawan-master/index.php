<?php

include_once("koneksi.php");
$result = mysqli_query($mysqli, "SELECT * FROM karyawan ORDER BY id_karyawan ASC");

?>

<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
    <style>
        body{
            background-image: url("bg1a.png");
            background-size: 63%;
            background-repeat: no-repeat;            
        }
        tbody{
            color: #f00c91;
        }
    </style>
    <title>Data Karyawan</title>
  </head>
  <body>
        <a href="add.php">Tambah data karyawan</a><br/><br/>
    
        <table class="table table-striped">
            <thead>
                <tr>
                    <th scope="col">Id_karyawan</th>
                    <th scope="col">Nama</th>
                    <th scope="col">Email</th>
                    <th scope="col">Telepon</th>
                    <th scope="col">Alamat</th>
                    <th scope="col">Jenis kelamin</th>
                    <th scope="col">Tempat lahir</th>
                    <th scope="col">tanggal lahir</th>
                    <th scope="col">Update</th>
                </tr>
            </thead>
            <tbody>
            <?php 
                while($user_data = mysqli_fetch_array($result)) { 
                    echo "<tr>";
                    echo "<td>".$user_data['id_karyawan']."</td>";
                    echo "<td>".$user_data['nama']."</td>";
                    echo "<td>".$user_data['email']."</td>";
                    echo "<td>".$user_data['telepon']."</td>";
                    echo "<td>".$user_data['alamat']."</td>";
                    echo "<td>".$user_data['jenis_kelamin']."</td>";
                    echo "<td>".$user_data['tempat_lahir']."</td>";
                    echo "<td>".$user_data['tanggal_lahir']."</td>"; 
                    echo "<td><a href='edit.php?id=$user_data[id_karyawan]'>Edit</a> | <a href='delete.php?id=$user_data[id_karyawan]'>Delete</a></td></tr>"; 
                }
            ?>
            </tbody>
        </table>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script>

  </body>
</html>