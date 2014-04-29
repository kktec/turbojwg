import groovy.sql.Sql
import groovy.transform.ToString

import org.h2.tools.Server

Server server = Server.createTcpServer().start()

//Sql db = new Sql(dataSource)

Sql db =  Sql.newInstance url: 'jdbc:h2:tcp://localhost/./db/demo', user: 'sa', password: '', driver: 'org.h2.Driver'

//db.execute new File('ddl.sql').text
//db.execute new File('data.sql').text


List customers = db.rows 'select * from Customers'
println customers
println "\nNo. of customers: ${customers.size()}"


//@ToString(includeNames = true)
//class Customer {
//	Integer id
//	String firstName
//	String lastName
//	String state
//	String zip
//}

//String customerByIdSql = '''
//select
//	CUSTOMERID as "id",
//	CUSTFIRSTNAME as "firstName",
//	CUSTLASTNAME as "lastName",
//	CUSTSTATE as "state",
//	CUSTZIPCODE as "zip"
//from Customers
//where CUSTOMERID = ?
//'''
//
//Customer cust1001 = new Customer(db.firstRow(customerByIdSql, 1001))
//println "\n$cust1001"



//String customersByStateAndZipSql = '''
//select
//	CUSTOMERID as "id",
//	CUSTFIRSTNAME as "firstName",
//	CUSTLASTNAME as "lastName"
//from Customers
//where CUSTSTATE = :state
//and CUSTZIPCODE = :zip
//'''
//String state = 'WA'
//String zip = '98052'
//List waCustomers = db.rows customersByStateAndZipSql, [state: state, zip: zip]
//println "\n$waCustomers\n"
//
//println waCustomers.collect { new Customer(it + [state: state, zip: zip]) }



server.stop()
