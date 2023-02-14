$(function(){
	switch(menu){
		case 'Services':
		  $('#services').addClass('active');
		  break;	
		case 'About':
		  $('#about').addClass('active');
		  break;	
		case 'Contact':
		  $('#contact').addClass('active');
		  break;	
	    default:
		  $('#home').addClass('active');
		  break;	

	}		

	
});