package com.atguigu.maven;
	
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

// 测试方式：
// 通过import语句将要测试的类引入当前类，引入后：
// 编译通过：可以使用，这个范围的依赖对当前类有效
// 编译失败：不能使用，则个范围的依赖对当前类无效
import com.atguigu.maven.Calculator;
	
public class HelloServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().write("hello maven web");
		
	}
	
}