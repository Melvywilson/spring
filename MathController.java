package net.codejava.spring;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/doMath")
public class MathController 
{
@RequestMapping(method=RequestMethod.GET)
public ModelAndView calculateSum(@RequestParam("a") int a,@RequestParam("b") int b) {
	ModelAndView model=new ModelAndView("MathResult");
	model.addObject("sum",(a+b));
	model.addObject("subtract",(a-b));
	model.addObject("multiply",(a*b));
	model.addObject("divide",(a/b));
	return model;
}
}
7.web.xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://java.sun.com/xml/ns/javaee" xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd" id="WebApp_ID" version="2.5">
  <display-name>MVC</display-name>
 <welcome-file-list>
    <welcome-file>index.html</welcome-file>
    <welcome-file>index.htm</welcome-file>
    <welcome-file>index.jsp</welcome-file>
    <welcome-file>default.html</welcome-file>
    <welcome-file>default.htm</welcome-file>
    <welcome-file>default.jsp</welcome-file>
  </welcome-file-list>
  
  <servlet>
  <servlet-name>SpringController</servlet-name>
  <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
  <init-param>
  <param-name>contextConfigLocation</param-name>
  <param-value>/WEB-INF/spring-mvc.xml</param-value></init-param>
  <load-on-startup>1</load-on-startup>
  </servlet>
  <servlet-mapping>
  <servlet-name>SpringController</servlet-name>
  <url-pattern>/</url-pattern>
  </servlet-mapping>
</web-app>
