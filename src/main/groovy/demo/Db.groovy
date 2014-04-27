package demo

import groovy.sql.Sql

import org.h2.tools.Server

class Db {
	
	static void main(String[] args) {
		Server server = Server.createTcpServer("-tcpPort", "9123").start()
	}

}
