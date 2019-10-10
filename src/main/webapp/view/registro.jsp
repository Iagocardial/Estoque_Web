<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page contentType = "text/html" pageEncoding = "UTF-8" %>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="/home/mr-robot/Documents/Faculdade/lab-engenharia/estoque_Web/src/main/webapp/css/style.css">
    <link rel="stylesheet" href="/home/mr-robot/Documents/Faculdade/lab-engenharia/estoque_Web/src/main/webapp/lib/bootstrap-4.3.1-dist/css/bootstrap.min.css">

    <title>Registro de produto</title>
</head>

<body>
    <div class="container-fluid container-registro">
        <h1>Registrar Produto</h1>
        <label for="">Nome</label>
        <input type="text">
        <label for="">Código</label>
        <input type="text" name="">
        <label for="">Quantidade</label>
        <input type="number" name="">
        <label for="">Medida(Kg/L)</label>
        <input type="text" name="">
        <label for="">Valor</label>
        <input type="text" value='R$ ' name="">
        <button class="btn btn-primary" id="registrar">Registrar</button>
        <div class="alert alert-success" role="alert">
            Registrado com sucesso! <a href="/home/mr-robot/Documents/Faculdade/lab-engenharia/estoque_Web/src/main/webapp/index.html" class="alert-link"> Clique aqui
                para voltar!</a>
        </div>
    </div>



    <script src="/home/mr-robot/Documents/Faculdade/lab-engenharia/estoque_Web/src/main/webapp/lib/jquery/jquery.min.js"></script>
    <script src="/home/mr-robot/Documents/Faculdade/lab-engenharia/estoque_Web/src/main/webapp/lib/bootstrap-4.3.1-dist/js/bootstrap.min.js"></script>
    <script src="/home/mr-robot/Documents/Faculdade/lab-engenharia/estoque_Web/src/main/webapp/js/efeitos.js"></script>
</body>

</html>