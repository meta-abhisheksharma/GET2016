$(document).ready(function(){
	$("#empNameList").change(function(){
    $.ajax({
        type : 'GET',
        dataType : 'json',
        url: 'employeeDetail.json',
        success : function(data) {
			
			console.log(data);
			var id= $('#empNameList').val();
			console.log(id);
			switch(id){
				case "first" : $('#empName').val(data.first.name) ; console.log(data.first.name);
				$('#empEmail').val(data.first.email) ; console.log(data.first.email);
				$('#empPhone').val(data.first.phone) ;
				$('#empAddress').val(data.first.address) ;
					break;
				
				case "second" :  $('#empName').val(data.second.name) ; 
				$('#empEmail').val(data.second.email) ;
				$('#empPhone').val(data.second.phone) ;
				$('#empAddress').val(data.second.address) ;
					break;
				
				case "third" :   $('#empName').val(data.third.name) ; 
				$('#empEmail').val(data.third.email) ;
				$('#empPhone').val(data.third.phone) ;
				$('#empAddress').val(data.third.address) ; 
					break;
					
				case "fourth" :   $('#empName').val(data.fourth.name) ; 
				$('#empEmail').val(data.fourth.email) ;
				$('#empPhone').val(data.fourth.phone) ;
				$('#empAddress').val(data.fourth.address) ; 
					break;
				
				case "fifth" :   $('#empName').val(data.fifth.name) ; 
				$('#empEmail').val(data.fifth.email) ;
				$('#empPhone').val(data.fifth.phone) ;
				$('#empAddress').val(data.fifth.address) ; 
					break;
			}
         
        } 
    });
	
	});
	
});

