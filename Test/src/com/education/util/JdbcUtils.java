package com.education.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.junit.Test;

import com.alibaba.druid.pool.DruidDataSourceFactory;

public class JdbcUtils {
     //定义数据源
	static  private DataSource   dataSource;
	 //初始化配置
	static {
		try {
			//加载数据库连接池配置文件到内存
			Properties  pro=new  Properties();
			ClassLoader  classLoader=JdbcUtils.class.getClassLoader();
			InputStream  is=classLoader.getResourceAsStream("druid.properties");
			pro.load(is);
			//初始化数据源
			dataSource=DruidDataSourceFactory.createDataSource(pro);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	 //获取Druid数据库连接池的接口
	 public static  Connection  getConnection() throws SQLException {
		 return  dataSource.getConnection();
	 }
	 //获取数据源的接口
	 public static  DataSource   getDataSource() {
		 return  dataSource;
	 }
	 @Test
	 public void  Test() {
		 System.out.println(getDataSource());
	 }
}
