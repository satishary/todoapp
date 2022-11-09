<%@page import="java.sql.ResultSet"%>
<%@page import="javax.naming.spi.DirStateFactory.Result"%>
<%@page import="databasepackage.DbConnect"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="utilitiespackage.Utilities"%>
<%@include  file="header.jsp" %>
<title>Task Entry</title>
</head>
<body>
    <%@include  file="menu.jsp" %>
    <%
        boolean ispostback = Utilities.isPostBack(request);
        System.err.println(ispostback);

        String task = "", description = "", dateoftask = "", status = "", sno = "";
        System.out.println("ispostback");
        if (!ispostback) {
            sno = request.getParameter("sno");
            PreparedStatement ps = DbConnect.connect().prepareStatement("select sno,task,description,to_char(dateoftask,'yyyy-mm-dd') as dateoftask,status from todo where sno=?");
            ps.setString(1, sno);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                task = "" + rs.getObject("task");
                description = "" + rs.getObject("description");;
                dateoftask = "" + rs.getObject("dateoftask");;

                status = "" + rs.getObject("status");;
            }

        }
        if (ispostback) {
            sno = request.getParameter("sno");
            task = request.getParameter("task");
            description = request.getParameter("description");
            dateoftask = request.getParameter("dateoftask");
            status = request.getParameter("status");
            PreparedStatement ps = DbConnect.connect().prepareStatement("update todo SET task=?,description=?,dateoftask=to_date(?,'yyyy-mm-dd'),status=? where sno= ?");
            ps.setString(1, task);
            ps.setString(2, description);
            ps.setString(3, dateoftask);
            ps.setString(4, status);
            ps.setString(5, sno);
            int n = ps.executeUpdate();
           // out.println(n + "," + sno);

        }


    %>
    <div class="container">
        <div class="row">
            <div class="col-md-3"></div>
            <div class="col-md-6">
                <form method="post">
                    <input type="hidden" name="check">
                    <input type="hidden" name="sno" value="<%=sno%>">
                    <div class="form-floating">
                        <input type="text" class="form-control" value="<%=task%>" id="lbltask" name="task" placeholder="task">
                        <label for="lbltask">task</label>
                    </div>
                    <div class="form-floating">
                        <input type="text" class="form-control" value="<%=description%>" id="lbdescription" name="description" placeholder="description">
                        <label for="lbdescription">description</label>
                    </div>
                    <div class="form-floating">
                        <input type="date" class="form-control" value="<%=dateoftask%>" id="lbdateoftask" name="dateoftask" placeholder="dateoftask">
                        <label for="lbdateoftask">dateoftask</label>
                    </div>




                    <div class="form-floating">
                        <input type="text" class="form-control" value="<%=status%>" id="lbstatus" name="status" placeholder="status">
                        <label for="lbstatus">status</label>
                    </div>


                    <div class="form-floating">
                        <input value="Submit" type="submit" class="form-control btn btn-primary" id="lbsubmit" placeholder="status">

                    </div>
                </form>
            </div>

            <div class="col-md-3"></div>
        </div>
        <div class="row">
            <div class="col-md-2"></div>
            <div class="col-md-8">
                <%=Utilities.getTodoListInTable()%>

            </div>
            <div class="col-md-2"></div>
        </div>
    </div>



    <%@include  file="footer.jsp" %>