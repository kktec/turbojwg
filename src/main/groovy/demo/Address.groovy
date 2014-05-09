package demo

import groovy.transform.Immutable

@Immutable
class Address {
	
	private static final ZIP_REGEX = /\d{5}/
	
	String address1
	
	String address2
	
	String city
	
	String state
	
	String zip
	
	Date asOf
	
	
	
	
	
	
	
	
	// NOTE: only supports zip short form at this time
	Map validate() {
		Map errors = [:]
		if (!zip) { errors.zip = 'blank' }
		else if (zip.size() < 5) { errors.zip = 'minSize' }
		else if (zip.size() > 5) { errors.zip = 'maxSize' }
		else { 
			if (!(zip ==~ ZIP_REGEX)) { errors.zip = 'matches' }
		}
		errors
	} 
	
	// This is what a Grails validator that does the same thing similar would look like
	static constraints = {
		zip(blank: false, minSize: 5, maxSize: 5, matches: ZIP_REGEX)
	}
}
