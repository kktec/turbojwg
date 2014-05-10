package demo

import spock.lang.Specification
import spock.lang.Unroll

class AddressSpec extends Specification {
	
	def 'address1 can be properly set and is immutable'() {
		given:
		Address a = new Address(address1: '123 EZ St.')
		
		expect:
		a.address1 == '123 EZ St.'
		
		when:
		a.address1 = 'xyz'
		
		then:
		thrown(ReadOnlyPropertyException)
	}
	
	@Unroll
	def 'validation for zip value #zip yields error code #error' () {
		given:
		Address address = new Address(zip: zip)
		
		when:
		Map errors = address.validate()
		
		then:
		errors.zip == error
		
		where:
		zip      || error
		null     || 'blank'
		''       || 'blank'
		'1234'   || 'minSize'
		'12345'  || null
		'a2345'  || 'matches'
		'123456' || 'maxSize'
	}
}
