<?php
    if (isset($_GET['email']) && isset($_GET['password'])) {
        $email = $_GET['email'];
        $password = $_GET['password'];
        echo "your email is '$email' and your password is '$password'";
    }
?>
