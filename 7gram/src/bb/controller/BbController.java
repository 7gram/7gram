package bb.controller;

import java.util.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.corba.se.impl.activation.CommandHandler;
import com.sun.xml.internal.org.jvnet.fastinfoset.EncodingAlgorithmIndexes;

import bb.command.CommandHendler;
import jdk.nashorn.internal.ir.RuntimeNode.Request;
import jdk.nashorn.internal.runtime.UserAccessorProperty;
import sun.java2d.loops.ProcessPath.ProcessHandler;

public class BbController extends HttpServlet{
	
	private Map commandMap;
	
	public BbController() {
		commandMap=new HashMap<String,Object>();
	}
	/*기능을 초기화 시켜주는 메서드*/
	@Override
	public void init(ServletConfig config) throws ServletException {
		String path=config.getServletContext().getRealPath("/WEB-INF/bbCommand.properties");
		Properties prop=null;
		
			
			try {
				FileInputStream fis=new FileInputStream(path);
				prop=new Properties();
				prop.load(fis);
				fis.close();
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			Iterator keys=prop.keySet().iterator();
			while(keys.hasNext()){
				String key=(String)keys.next();
				String classPath=prop.getProperty(key);
				
				try {
					Class obj_class=Class.forName(classPath);
					Object obj=obj_class.newInstance();
					commandMap.put(key, obj);
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (InstantiationException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
			}
			
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		userProcess(req,resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		userProcess(req,resp);
	}
	
	protected void userProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String type=null;
		String userUrl=req.getRequestURI();
		if(userUrl.indexOf(req.getContextPath())==0){
			type=userUrl.substring(req.getContextPath().length());
		}
		
		CommandHendler command=(CommandHendler)commandMap.get(type);
		String goPage=null;
		
		goPage=command.process(req, resp);
		
		RequestDispatcher dis=req.getRequestDispatcher(goPage);
		dis.forward(req, resp);
	}

}
