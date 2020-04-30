<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>

<head>

    <title>eletronicos - Detalhe</title>
    
    <spring:url value="/resources/css" var="css"/>
    <spring:url value="/resources/js" var="js"/>
    
    <c:set value="${pageContext.request.contextPath}" var="contextPath"/>
    
    <link href="${css}/bootstrap.css" rel="stylesheet">
    <link href="${css}/small-business.css" rel="stylesheet">

</head>

<body>
    
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li>
                        <a href="${contextPath}/eletronico">eletronicos</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>

    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <div class="well">
					
					<h2>Eletronico</h2>
					
						<div class="form-group">
							<label class="control-label" for="nome">Nome:</label>
							<b>${eletronico.nome}</b>
                        </div>
                        
                        <div class="form-group">
							<label class="control-label" for="nome">Codigo:</label>
							<label class="label label-default">${eletronico.codigo}</label>
						</div>
						
						<div class="form-group">
							<label class="control-label" for="nome">Nota:</label>
							<label class="label label-default">${eletronico.nota}</label>
						</div>
						
						<div class="form-group">
							<label class="control-label" for="mesnagem">Descrição:</label>
							<label class="label label-default">${eletronico.descricao}</label>
						</div>
						
						<div class="form-group">
							<label class="control-label" for="preco">Preço:</label>
							<label class="label label-default">${eletronico.preco}</label>
						</div>
						
						<div class="form-group">
							<label class="control-label" for="mesnagem">Características:</label>
							<label class="label label-default">${eletronico.caracteristicas}</label>
						</div>
						<hr>
						
						<a class="btn btn-default btn-lg" href="${contextPath}/eletronico">Voltar</a>
                            
                        <br>
                        <br>
					
                </div>
            </div>
        </div>
    </div>

    <!-- jQuery -->
    <script src="${js}/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="${js}/bootstrap.min.js"></script>

</body>
</html>