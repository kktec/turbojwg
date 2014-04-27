import groovy.sql.Sql

import javax.sql.DataSource

import org.h2.tools.Server

Server server = Server.createTcpServer().start()

//Sql db = new Sql(dataSource)

Sql db =  Sql.newInstance url: 'jdbc:h2:tcp://localhost/./db/demo', user: 'sa', password: '', driver: 'org.h2.Driver'

//db.execute new File('./db/scripts/SalesOrdersTables.sql').text
//db.execute new File('./db/scripts/SalesOrdersData.sql').text


List customers = db.rows 'select * from Customers'
println customers
println customers.size() + '\n'

//println customers.collect { it.CUSTOMERID }
//println customers*.CUSTOMERID
//
//List allCustomers = customers.collect {
//	[id: it.CUSTOMERID, firstName: it.CUSTFIRSTNAME, lastName: it.CUSTLASTNAME, state: it.CUSTSTATE]
//}
//println allCustomers
//
//List waCustomers = allCustomers.findAll { it.CUSTSTATE == 'WA' }
//println waCustomers.size()


//String customerByStateSql = '''
//select
//	CUSTOMERID as "id",
//	CUSTFIRSTNAME as "firstName",
//	CUSTLASTNAME as "lastName"
//from Customers
//where CUSTSTATE = :state
//'''
//List waCustomers = db.rows customerByStateSql, [state: 'WA']
//println "$waCustomers\n"

//@ToString(includeNames = true)
//class Customer {
//	Integer id
//	String firstName
//	String lastName
//}
//println waCustomers.collect { new Customer(it) }

//String customerByIdSql = '''
//select
//	CUSTOMERID as "id",
//	CUSTFIRSTNAME as "firstName",
//	CUSTLASTNAME as "lastName"
//from Customers
//where CUSTOMERID = ?
//'''
//Customer cust1003 = new Customer(db.firstRow(customerByIdSql, 1003))
//print

server.stop()
