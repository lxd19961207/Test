package com.education.contant;

import org.springframework.jdbc.core.JdbcTemplate;

import com.education.util.JdbcUtils;

public interface Contant {
   JdbcTemplate   jdbcTemplate=new JdbcTemplate(JdbcUtils.getDataSource());
}
