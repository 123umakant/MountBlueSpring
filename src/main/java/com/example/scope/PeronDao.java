package com.example.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class PeronDao {	
	
	@Autowired
	JdbcConnection JdbcConnection;

	public JdbcConnection getJdbcConnection() {
		return JdbcConnection;
	}

	public void setJdbcConnection(JdbcConnection jdbcConnection) {
		JdbcConnection = jdbcConnection;
	}
	

}
