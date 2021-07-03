package crmapp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import crmapp.util.PathUtils;
import crmapp.util.UrlUtils;

@WebServlet(name = "home Servlet", urlPatterns = {
		PathUtils.HOME
})
public class HomeServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher(UrlUtils.DASHBOARD).forward(req, resp);
	}
}
