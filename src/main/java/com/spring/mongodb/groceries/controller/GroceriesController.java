/**
 * 
 */
package com.spring.mongodb.groceries.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author P.V. UdayKiran
 * @version 1, created on Mon 31-Aug-2020 13:43
 */
@RestController
@RequestMapping(path = {"", "/tracking/custom"})
public class GroceriesController {
	
	/**
	 * default method without URL. </br>
	 * &nbsp; &nbsp; Ex: http://localhost:8080/
	 * @return
	 * @author P.V. UdayKiran
	 * @since created on Mon 31-Aug-2020 21:57
	 */
	@RequestMapping("")
	String defaulteMethod() {
		return "Welcome !!.";
	}
	
	/**
	 *  @RequestParam is a Spring annotation used to bind a web request parameter to a method parameter.

		It has the following optional elements:
		<ul> 
			<li>defaultValue - used as a fallback when the request parameter is not provided or has an empty value</li>
			<li>name - name of the request parameter to bind to</li>
			<li>required - tells whether the parameter is required</li>
			<li>value - alias for name</li>
		</ul>
	    The @RequestParam annotation can be used with or without a value. </br>
	    &nbsp;&nbsp; Ex: http://localhost:8080/groceries/tracking/custom/welcome?name=udaykiran

		@PathVariable
		<p>@PathVariable works differently from @RequestParam. You use @RequestParam to obtain the values of the query parameters from the URI. On the other hand, you use @PathVariable to obtain the parameter values from the URI template.</p>
		&nbsp;&nbsp; Ex: http://localhost:8080/groceries/tracking/custom/welcome/pulipati
		
		@RequestMapping You can have multiple request mappings for a method. For that add one @RequestMapping annotation with a list of values. </br> 
		&nbsp;&nbsp; Ex: @RequestMapping(value = {"/welcome", "/welcome/{nameof}"}), </br> 
		&nbsp;&nbsp; URL: http://localhost:8080/groceries/tracking/custom/welcome, </br> 
		&nbsp;&nbsp; URL: http://localhost:8080/groceries/tracking/custom/welcome/pulipati, </br> 
		&nbsp;&nbsp; URL: http://localhost:8080/groceries/tracking/custom/welcome/pulipati?name=udaykiran, </br> 

	 * @param name
	 * @return welcomeMessage
	 * @author P.V. UdayKiran
	 * @since created on Mon 31-Aug-2020 21:07
	 */
	@GetMapping(value = {"/welcome", "/welcome/{nameof}"})
	public String welcome(@RequestParam(defaultValue = "", value = "name", required = false) String name,
			@PathVariable(name = "nameof", required = false) String nameof) {
		return String.format("%s %s %s", "Welcome to Groceries Project !!. ", name, nameof != null ? nameof : "");
	}
}
