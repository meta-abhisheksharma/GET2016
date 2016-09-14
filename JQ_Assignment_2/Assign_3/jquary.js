$(document).ready(function(){
	$("#start").click(function(){
		$('.simplediv').animate({marginLeft: "+=100px"},2000,'linear');
	});
	
	$("#stop").click(function(){
		$('.simplediv').stop();
	});
	
	$("#back").click(function(){
		$('.simplediv').animate({marginLeft: "-=100px"},2000,'linear');
	});
	
	$("#left").click(function(){
		$('.simplediv').animate({marginLeft: "+=50px"},1000,'linear');
		
	});
	
	$("#right").click(function(){
		$('.simplediv').animate({marginLeft: "-=50px"},1000,'linear');
	});
	
	$("#top").click(function(){
		$('.simplediv').animate({marginTop: "-=50px"},1000,'linear');
	});
	
	$("#bottom").click(function(){
		$('.simplediv').animate({marginTop: "+=50px"},1000,'linear');
	});
});