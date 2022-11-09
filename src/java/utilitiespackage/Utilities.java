package utilitiespackage;

import databasepackage.DbConnect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.http.HttpServletRequest;

public class Utilities {

    public static String successMessage(String message) {
        String output = "<div class=\"alert alert-success\" role=\"alert\">\n"
                + message
                + "</div>";
        return output;
    }

    public static String errorMessage(String message) {
        String output = "<div class=\"alert alert-danger\" role=\"alert\">\n"
                + message
                + "</div>";
        return output;
    }

    public static boolean isPostBack(HttpServletRequest request) {
        if (request.getParameter("check") == null) {
            return false;
        }
        return true;
    }

    public static String getTodoListInTable() {
        try {
            String output = "<center><table class='table table-striped table-hover'>\n";
            PreparedStatement ps = DbConnect.connect().prepareStatement("select sno,task,description,to_char(dateoftask,'dd-Mon-yyyy') as dateoftask,status from todo order by sno desc");
            ResultSet rs = ps.executeQuery();
            int count = 0;
            output += "<tr><th>Sno</th><th>Task</th><th>Description</th><th>Date</th><th>Status</th><th>Update</th><th>Delete</th></tr>\n";
            while (rs.next()) {
                count++;
                String task = "" + rs.getObject("task");
                String description = "" + rs.getObject("description");
                String date = "" + rs.getObject("dateoftask");
                String status = "" + rs.getObject("status");
                String sno = "" + rs.getObject("sno");
                output += "<tr><td>" + count + "</td><td>" + task + "</td><td>" + description + "</td><td>" + date + "</td><td>" + status + "</td><td><a class='btn btn-primary' href='updatetodo.jsp?sno=" + sno + "'>Update</a></td><td><a class='btn btn-danger' href='deletetodo.jsp?sno=" + sno + "'>Delete</a></td></tr>\n";
            }
            output += "</table></center>\n";
            return output;
        } catch (Exception ex) {
            System.err.println(ex);
            return "";
        }
    }

}
