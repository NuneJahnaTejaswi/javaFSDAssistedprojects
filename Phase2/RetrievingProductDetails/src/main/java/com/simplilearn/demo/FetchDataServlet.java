package com.simplilearn.demo;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/fetch")
public class FetchDataServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		PrintWriter out= resp.getWriter();
		resp.setContentType("text/html");
		
		String  param=req.getParameter("id");
		//converting string to int
		int  id=  Integer.parseInt(param);
		Properties  props= new Properties();
		
		InputStream in=getServletContext().getResourceAsStream("/WEB-INF/application.properties");
		props.load(in);
		
		
		Connection conn= DBConfig.getConnection(props);
	
		
		
		if(conn!=null) {
			
			Statement stmt;
			try {
				stmt = conn.createStatement();
				ResultSet rs=stmt.executeQuery("select * from eproduct where id="+id);
				out.print("<h1>Displaying the Product Details...</h1>");
	            	if(rs.next()) {
	            		out.print("<table border=1 cellpadding=10 cellspacing=0> <thead><tr>");
	    				out.print("<th>ProductID</th><th>ProductName</th><th>ProductPrice</th><th>DATE</th>");
	    				out.print("<tr></thead>");
	    				out.print("<tbody>");
	            		out.print("<tr>");
						//out.print("ID:"+" "+rs.getInt(1)+"<br>"+"Name:"+" "+rs.getString(2)+"<br>"+"Price:"+" "+rs.getBigDecimal(3)+"<br>"+"Time:"+" "+rs.getTimestamp(4)+"<br>");
	            		out.print("<td>'"+rs.getInt(1)+"'</td><td>'"+rs.getString(2)+"'</td><td>'"+rs.getBigDecimal(3)+"'</td><td>'"+rs.getTimestamp(4)+"'</td>");
						
						out.print("</tr>");
					}
	            	else {
	            		out.print("<h3>************   There is no product exists with that productid   ************</h3>");
	            	}
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		else {
			
			out.print("Error While Connecting Connections");
		}
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	
	
	

}