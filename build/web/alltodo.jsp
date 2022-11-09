<%@page import="javax.naming.spi.DirStateFactory.Result"%>
<%@page import="databasepackage.DbConnect"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="utilitiespackage.Utilities"%>
<%@include  file="header.jsp" %>
<title>All Todo</title>
</head>
<body>
    <%@include  file="menu.jsp" %>
    <%
      

    %>
    <div class="container">
                        <div class="row">
                            <div class="col-md-2"></div>
                            <div class="col-md-8">
                                <%=Utilities.getTodoListInTable()%>
                                
                            </div>
                            <div class="col-md-2"></div>
                        </div>
    </div>



    <%@include  file="footer.jsp" %>