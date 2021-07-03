package crmapp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import crmapp.util.PathUtils;

@WebServlet(name = "userServlet", urlPatterns = {
		PathUtils.USER_PROFILE
})
public class UserServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		switch (req.getServletPath()) {
		case PathUtils.USER_PROFILE: 
			req.getRequestDispatcher(PathUtils.USER_PROFILE).forward(req, resp);
			break;
		default:
			break;
		}
	}
}
