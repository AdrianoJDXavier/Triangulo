<%-- 
    Document   : index
    Created on : 17/06/2019, 22:02:05
    Author     : Adriano
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="css/Style.css" rel="stylesheet" type="text/css"/>
        <title>Triângulo</title>
        <link rel="shortcut icon" href="img/favicon.ico">
    </head>
    <body>
        <div class="container register">
            <div class="row">
                <div class="col-md-12">
                    <div class="tab-content" id="myTabContent">
                        <div class="tab-pane fade show active text-align form-new" id="home" role="tabpanel" aria-labelledby="home-tab">
                            <h3 class="register-heading">Teste Triângulo</h3>
                            <div class="row register-form">
                                <div class="col-md-12">
                                    <form method="get" action="TrianguloServlet">
                                        <div class="form-group">
                                            <input type="number" name="lado1" class="form-control" placeholder="Lado 1 *" required=""/>
                                        </div>
                                        <div class="form-group">
                                            <input type="number" name="lado2" class="form-control" placeholder="Lado 2 *" required=""/>
                                        </div>
                                        <div class="form-group">
                                            <input type="number" name="lado3" class="form-control" placeholder="Lado 3 *" required=""/>
                                        </div>
                                        <div class="form-group">
                                            <input type="submit" class="btnContactSubmit" value="Testar" />
                                        </div>
                                    </form>
                                    <div>
                                        <%
                                            String msg = request.getParameter("result");
                                        if(msg != null){
                                        %>
                                        
                                        <center><h4><% out.print(msg); %></h4></center>
                                        <center><img src="img/<%out.print(msg);%>.png" width=100 height=100></center>
                                    <% } %>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>