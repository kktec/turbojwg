package demo

import groovyx.gpars.GParsExecutorsPool

import com.google.gson.Gson

class Jokes {
	
	static final URL JOKE_URL = 'http://api.icndb.com/jokes/random?limitTo=[nerdy]&escape=javascript'.toURL()
	
	static void main(String[] args) {
		int numberOfJokes = 10
		long start = System.currentTimeMillis()
		List jokes = fetchJokes numberOfJokes
		long end = System.currentTimeMillis()
		jokes.each { println "$it\n" }
		println "Fetching $numberOfJokes jokes took ${(end - start) / 1000.0} sec."
	}
	
	static Collection fetchJokes(int number) {
		(1..number).collect { fetchJoke it }
	} 

	static String fetchJoke(int index) {
		String response = JOKE_URL.text
		Map joke = new Gson().fromJson response, Map
		"${index}. $joke.value.joke"
	}

	static Collection fetchJokesParallel(int number) {
		GParsExecutorsPool.withPool {
			(1..number).collectParallel { fetchJoke it }
		}
	} 

}
