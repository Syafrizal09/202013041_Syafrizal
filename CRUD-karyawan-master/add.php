<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style>
        body{
            background-image: url("so-white.png");
        }
    </style>
    <title>Tambah data karyawan</title>
</head>
<body>
    
    <a href="index.php">Kembali</a>
    <br/><br/>
    <form action="add.php" method="post" name="form1">
        <table width="25%" border="0">
            <tr> 
               <td>Nama</td> <td><input type="text" name="nama"></td>
            </tr>
            <tr> 
               <td>Email</td>
                <td><input type="email" name="email"></td>
            </tr>
            <tr> 
                <td>Telepon</td>
                <td><input type="number" name="telepon"></td>
            </tr>
            <tr> 
                <td>Alamat</td>
                <td><input type="text" name="alamat"></td>
            </tr>
            <tr> 
                <td>Jenis_kelamin</td>
                <td><input type="text" name="jenis_kelamin"></td>
            </tr>
            <tr> 
                <td>Tempat_lahir</td>
                <td><input type="text" name="tempat_lahir"></td>
            </tr>
            <tr> 
                <td>Tanggal_lahir</td>
                <td><input type="text" name="tanggal_lahir"></td>
            </tr>
            <tr> 
                <td></td>
                <td><input type="submit" name="Submit" value="Add"></td>
            </tr>
        </table>
    </form>

    <?php

    if(isset($_POST['Submit'])) {
        $nama = $_POST['nama'];
        $email = $_POST['email'];
        $telepon = $_POST['telepon'];
        $alamat = $_POST['alamat'];
        $jenis_kelamin = $_POST['jenis_kelamin'];
        $tempat_lahir = $_POST['tempat_lahir'];
        $tanggal_lahir = $_POST['tanggal_lahir'];
        
        include_once("koneksi.php");

        $result = mysqli_query($mysqli, "INSERT INTO karyawan(nama,email,telepon,alamat,jenis_kelamin,tempat_lahir,tanggal_lahir) VALUES('$nama','$email','$telepon','$alamat','$jenis_kelamin','$tempat_lahir','$tanggal_lahir')");

        echo "Data karyawan berhasil ditambahkan! <a href='index.php'>Lihat data karyawan</a>";
    }
    ?>

</body>
</html>