function predictMethod() {
    var timePicked=document.getElementById("time_picker").value;
    var platePicked=document.getElementById("plateNumber").value;
    var dayWeek = new Date(dayPicked);
    console.log(dayPicked);
    console.log(timePicked);
    console.log(dayWeek.getDay());
    console.log(platePicked);

    switch(dayWeek.getDay()) {
        case 1:
        createSwalYes();
          break;
        case 2:
            createSwalYes();
          break;
        default:
            createSwalNo();
      }

}

function createSwalYes() {

       swal({
         title: "Car can be on road!",
         icon: "success",
         button: "Accept",
       });
      
    
   }

   function createSwalNo() {
    swal({
      
        title: "Car can't be on road!",
        icon: "error",
        button: "Accept",
      });

}



