package com.spring.mongodb.groceries.util;

/**
 * @author P.V. UdayKiran
 * @version 1, created on Tue 01-Sep-2020 22:13
 */
public interface GroceriesConstants {
	
	/**
	 * <a href="https://beginnersbook.com/2014/07/final-keyword-java-final-variable-method-class/">We cannot extend a final class.</a>
	 * <h1>Points to Remember:</h1>
	 * <ol>
	 * 	<li>A constructor cannot be declared as final.</li>
	 * 	<li>Local final variable must be initializing during declaration.</li>
	 * 	<li>All variables declared in an interface are by default final.</li>
	 * 	<li>We cannot change the value of a final variable.</li>
	 * 	<li>A final method cannot be overridden.</li>
	 * 	<li>A final class not be inherited.</li>
	 * 	<li>If method parameters are declared final then the value of these parameters cannot be changed.</li>
	 * 	<li>It is a good practice to name final variable in all CAPS.</li>
	 * 	<li>final, finally and finalize are three different terms. finally is used in exception handling and finalize is a method that is called by JVM during garbage collection.</li>
	 * </ol>
	 * @author P.V. UdayKiran
	 * @version 1, created on Tue 01-Sep-2020 22:28
	 */
	public final class Config {
		public static final String CONTEXT_PATH = "/groceries"; 
	}
}
