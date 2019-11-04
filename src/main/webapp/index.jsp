<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page contentType = "text/html" pageEncoding = "UTF-8" %>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="lib/bootstrap-4.3.1-dist/css/bootstrap.min.css">

    <title>Estoque WEB</title>
</head>

<body>
    <div class="container-fluid container-principal">
        <h1>Estoque WEB</h1>
        <div class="row">
            <div class="col-md-3 coluna-1">
                <label for="">Código</label>
                <input type="text">
                <label for="">Quantidade</label>
                <input type="number" name="" id="">
                <form href="registro" class="pull-right"> Registrar o Produto </form>
            </div>
            <div class="col coluna-2">
                <table class="table table-striped">
                    <thead>
                        <tr>
                            <th scope="col">COD</th>
                            <th scope="col">Produto</th>
                            <th scope="col">Quantidade</th>
                            <th scope="col">Valor/UN</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <th scope="row">1</th>
                            <td>Leite</td>
                            <td>4</td>
                            <td>R$3,20</td>
                        </tr>
                        <tr>
                            <th scope="row">2</th>
                            <td>Ovo</td>
                            <td>6</td>
                            <td>R$2,10</td>
                        </tr>
                        <tr>
                            <th scope="row">3</th>
                            <td>Tênis Nike</td>
                            <td>1</td>
                            <td>R$320,99</td>
                        </tr>
                    </tbody>
                </table>

                <button class="btn btn-primary" id='Finalizar'>Finalizar Compra</button>
                <div class="alert alert-success" role="alert">
                    Compra Realizada!
                </div>
            </div>
        </div>


        <script src="lib/jquery/jquery.min.js"></script>
        <script src="lib/bootstrap-4.3.1-dist/js/bootstrap.min.js"></script>
        <script src="js/efeitos.js"></script>
</body>

</html>