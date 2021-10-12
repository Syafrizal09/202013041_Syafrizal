<?php

    include_once("koneksi.php");
    if(isset($_POST['update'])){
        $id_karyawan = $_POST['id'];
        $nama = $_POST['nama'];
        $email = $_POST['email'];
        $telepon = $_POST['telepon'];
        $alamat = $_POST['alamat'];
        $jenis_kelamin = $_POST['jenis_kelamin'];
        $tempat_lahir = $_POST['tempat_lahir'];
        $tanggal_lahir = $_POST['tanggal_lahir'];

        $result = mysqli_query($mysqli, "UPDATE karyawan SET nama='$nama',email='$email',telepon='$telepon',alamat='$alamat',jenis_kelamin='$jenis_kelamin',tempat_lahir='$tempat_lahir',tanggal_lahir='$tanggal_lahir' WHERE id_karyawan=$id_karyawan");
        if($result){
            header("Location: index.php");
        }
    }

    $id_karyawan = $_GET['id'];
    $result = mysqli_query($mysqli, "SELECT * FROM karyawan WHERE id_karyawan = $id_karyawan");
    while($user_data = mysqli_fetch_array($result)){
        $nama = $user_data['nama'];
        $email = $user_data['email'];
        $telepon = $user_data['telepon'];
        $alamat = $user_data['alamat'];
        $jenis_kelamin = $user_data['jenis_kelamin'];
        $tempat_lahir = $user_data['tempat_lahir'];
        $tanggal_lahir = $user_data['tanggal_lahir']; 
    }    
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style>
        body{
            background-image: url("so-white.png")
        }

    </style>
    <title>Edit data mahasiswa</title>
</head>
<body>
<a href="index.php">Kembali</a>
    <br/><br/>
    <form action="edit.php" method="post">
        <table width="50%" border="0">
            <tr> 
               <td>Nama</td> <td><input type="text" name="nama" value="<?= $nama ?>"></td>
            </tr>
            <tr> 
               <td>Email</td>
                <td><input type="email" name="email" value="<?= $email ?>"></td>
            </tr>
            <tr> 
                <td>Telepon</td>
                <td><input type="number" name="telepon" value="<?= $telepon ?>"></td>
            </tr>
            <tr> 
                <td>Alamat</td>
                <td><input type="text" name="alamat" value="<?= $alamat ?>"></td>
            </tr>
            <tr> 
                <td>Jenis_kelamin</td>
                <td><input type="text" name="jenis_kelamin" value="<?= $jenis_kelamin ?>"></td>
            </tr>
            <tr> 
                <td>Tempat_lahir</td>
                <td><input type="text" name="tempat_lahir" value="<?= $tempat_lahir ?>"></td>
            </tr>
            <tr> 
                <td>Tanggal_lahir</td>
                <td><input type="text" name="tanggal_lahir" value="<?= $tanggal_lahir ?>"></td>
            </tr>
            <tr> 
            <td><input type="hidden" name="id" value=<?php echo $_GET['id'];?>></td>
                <td><input type="submit" name="update" value="Update Data"></td>
            </tr>
        </table>
    </form>
</body>
</html>