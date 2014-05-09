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
	def 'validation #scenario scenario for zip value #zip yields error code #error' () {
		given:
		Address address = new Address(zip: zip)
		
		expect:
		Map errors = address.validate()
		errors.zip == error
		
		where:
		scenario    | zip      || error
		'NULL'      | null     || 'blank'
		'BLANK'     | ''       || 'blank'
		'TOO SHORT' | '1234'   || 'minSize'
		'VALID'     | '12345'  || null
		'HAS ALPHA' | 'a2345'  || 'matches'
		'TOO LONG'  | '123456' || 'maxSize'
	}
}
