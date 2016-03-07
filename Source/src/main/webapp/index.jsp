<!DOCTYPE html>
<html>
<head>
    <title>Conversion Webservices</title>

    <meta charset="utf-8" />
    <meta http-equiv="Content-type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
   
   <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
	<style>

	html,body{
		height:100%;		
	}
	.container{
		background-image:url("bg.jpg");
		width:100%;
		height:100%;
		background-size:cover;
		background-position: center;
		padding-top: 25px;
	}


	.center{
		text-align: center;

	}

	.white{
		color:white;
	}
	p{
		padding-top: 15px;
		padding-bottom:15px;
	}

	button{
		margin-top: 20px;
		margin-bottom: 20px;
	}

	.alert{
		margin-top: 20px;
		display:none;
	
	}
	.whiteBackground{
		background-color:white;
		padding:20px;
		border-radius:20px;
	}
	</style>

 </head>

<body>

	<div class = "container">

			<div class = "row">

				<div class = "col-md-6 col-md-offset-3 center whiteBackground">
					<h1 class = "center ">  Conversion Web Services  </h1>
					<p class = "lead center ">Want to know your weight in kilograms? Or want to know your height in centimeters? Check below!  </p>
				<form>
					<div class = "form-group">
						<input type = "text" class = "form-control" name = "address" id = "address" 
						/>
					</div>
				<button id = "findMyKg" class = "btn btn-success btn-lg "> Convert to Kg </button>
				<button id = "findMyCm" class = "btn btn-success btn-lg "> Convert to cm </button>
				</form>

				<div id = "success"class = "alert alert-success">Success!</div>
				<div id = "fail" class = "alert alert-danger">Enter a valid city </div>
					
				<div id = "nocity" class = "alert alert-danger">Please enter a city </div>
				
			
				
				</div>

			


			</div> 
	</div>
	
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<script>

$("#findMyKg").click(function(event){
	event.preventDefault();
	$.ajax({
            type: "GET",
            url: "http://192.168.1.188:8080/messenger/webapi/ptokservice/"+$('#address').val(),
            dataType: "xml",
	        success: processJSON }); 
			
			    function processJSON(xml) {
			    	$(xml).find('ptokgservice').each(function(){
	                    var name = $(this).find("ptokgoutput").text();
	                    $("#success").fadeIn();
						$("#success").html($('#address').val()+ " pounds is equal to "+ name + " kilograms");
	                });
            }
			
        });

$("#findMyCm").click(function(event){
	event.preventDefault();
	$.ajax({
            type: "GET",
            url: "http://192.168.1.188:8080/messenger/webapi/ftocservice/"+$('#address').val(),
            dataType: "xml",
	        success: processJSON }); 
			
			    function processJSON(xml) {
			    	$(xml).find('ftocmservice').each(function(){
	                    var name = $(this).find("ftocmoutput").text();
	                    $("#success").fadeIn();
						$("#success").html($('#address').val()+ " feet is equal to "+ name + " centimeters");
	                });
            }
			
        });

 

</script>

</body>
</html>