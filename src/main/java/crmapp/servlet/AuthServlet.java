package crmapp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import crmapp.util.PathUtils;
import crmapp.util.UrlUtils;

@WebServlet(name = "authServlet", urlPatterns = {
		PathUtils.LOGIN,
		PathUtils.LOGOUT,
		PathUtils.SIGNUP,
		PathUtils.FORGOT_PASSWORD
})
public class AuthServlet extends HttpServlet{
	private static final long serialVersionUID = -6096425364732430148L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		switch (req.getServletPath()) {
		case PathUtils.LOGIN:
			req.getRequestDispatcher(UrlUtils.AUTH_LOGIN).forward(req, resp);
			break;
		case PathUtils.SIGNUP:
			req.getRequestDispatcher(UrlUtils.AUTH_SIGNUP).forward(req, resp);
			break;
		default:
			break;
		}
	}
}
