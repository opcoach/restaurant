package com.opcoach.htmlgenerator

import com.opcoach.menu.MMenu
import com.opcoach.menu.MIngredient
import com.opcoach.menu.MGroup
import com.opcoach.menu.MRecipe
import com.opcoach.restaurant.MRestaurant
import java.io.FileWriter
import org.eclipse.core.resources.ResourcesPlugin

//import menu.MIngredient

class htmlGenerator {
	
	def generateMenuHtmpTemplate(MMenu menu)'''
	<!DOCTYPE html>
	
	<html>

	<title>«menu.name»</title>

	
	<head>
	<h1>«menu.name»</h1>
	</head>
	
	<body>	
	

	</body>
	
	</html>
	
	'''
	
	def generateResteaurantHtmpTemplate(MRestaurant restaurant)'''
	<!DOCTYPE html>

	<title>«restaurant.name»</title>
	
	<head>
	<h1>«restaurant.name»</h1>
	</head>
	
	<body>
	<h2>Tables</h2>
	<table border="1">
	<tr><td>Number</td><td>Capacity</td><td>Priority</td></tr>
	«FOR table : restaurant.tables»
	<tr>
	<td>«table.number»</td>
	<td>«table.capacity»</td>
	<td>«table.priority»</td>
	</tr>
	«ENDFOR»
	</table>
	&nbsp
	<h2>Waiters</h2>
	<table border="1">
	<tr><td>Waiter Name</td><td>Tables to serve</td></tr>
	«FOR waiter : restaurant.waiters»
	<tr>
	<td>«waiter.name»</td>
	<td>
	«FOR tabeleToServe : waiter.tables»
	«tabeleToServe.number» 
	«ENDFOR»
	</td>
	</tr>
	«ENDFOR»
	</table>
	&nbsp
	<h2>Customers</h2>
	<table border="1">
	<tr><td>Name</td><td>Phone</td><td>E-mail</td><td>priority</td></tr>
	«FOR customer : restaurant.customers»
	<tr>
	<td>«customer.name»</td>
	<td>«customer.phone»</td>
	<td>«customer.mail»</td>
	<td>«customer.priority»</td>
	</tr>
	«ENDFOR»
	</table>
	&nbsp
	<h2>Bookings</h2>
	<table border="1">
	<tr><td>Customer</td><td>Table</td><td>Date</td><td>duration</td></tr>
	«FOR reservation : restaurant.bookings»
	<tr>
	<td>«reservation.customer»</td>
	<td>«reservation.table»</td>
	<td>«reservation.timestamp»</td>
	<td>«reservation.duration»</td>
	</tr>
	«ENDFOR»
	</table>
	
	</body>
		
	</html>
	'''
	
	def generateCodeForMenu(MMenu menu){
		
			val FileWriter fw = new FileWriter(ResourcesPlugin.getWorkspace.root.rawLocation.toString + "/" + menu.name + ".html")
			fw.write(generateMenuHtmpTemplate(menu).toString)
			fw.close
	}
	
	def generateCodeForRestaurant(MRestaurant restaurant){
			val FileWriter fw = new FileWriter(ResourcesPlugin.getWorkspace.root.rawLocation.toString + "/" + restaurant.name + "Index.html")
			fw.write(generateResteaurantHtmpTemplate(restaurant).toString)
			fw.close
	}
}