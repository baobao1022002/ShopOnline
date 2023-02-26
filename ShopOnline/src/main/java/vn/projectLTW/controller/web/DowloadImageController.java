package vn.projectLTW.controller.web;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;

import vn.projectLTW.util.Constant;


@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/image")  //?fname=abc.png
public class DowloadImageController  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fileName= req.getParameter("fname");
		File file=new File(Constant.DIR+"/"+fileName);
		
		resp.setContentType("image/jpeg");
		if(file.exists()) {
			IOUtils.copy(new FileInputStream(file), resp.getOutputStream());
		}
	}
}
