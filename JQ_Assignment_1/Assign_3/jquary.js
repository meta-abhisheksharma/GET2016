$(document).ready(function(){
			$("button").css('font-weight','bold	');
			
				$(".selectBoxError").click(function (){
				
				});
				
				$(".span").click(function (){
				$(".message").addClass('msgCss');
				});
				
				$(".firstDiv").click(function (){
				$("div:first").addClass('boxCss');
				});
				
				$(".showImg").click(function (){
				$(".msgImg").css('display','inline');
				});
				
				$("#myDiv input[type='text']").css('font-style','italic');
				$("[name^=txt]").css('color','blue');
				
				$("p:not('.box')").css('color','red');
				
				$("div.box ,div.error").css('background-color','red');
				$("div.box.error").css('background-color','green');
				
				$("div#myDiv span.info").css('background-color','blue');
				
			});