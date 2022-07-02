package com.Hexaware.CMS.DAO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionProvider {

	private static final String PROPS_FILE = "app.properties";
	private static ConnectionProvider _instance;
	
	private String url;
	private String uid;
	private String pwd;
	
	private ConnectionProvider() throws FileNotFoundException, IOException {
		Properties props = new Properties();
		props.load(new FileInputStream(PROPS_FILE));
		this.url = props.getProperty("db.url");
		this.uid=props.getProperty("db.uid");
		this.pwd=props.getProperty("db.pwd");
	}
	
	public static ConnectionProvider instance() throws FileNotFoundException, IOException {
		if(_instance==null)
			_instance=new ConnectionProvider();
		return _instance;
	}
	
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, uid, pwd);
	}
}
