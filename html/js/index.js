function predictMethod() {
    var timePicked=document.getElementById("time_picker").value;
    var platePicked=document.getElementById("plateNumber").value;
    var dayWeek = new Date(dayPicked);
    console.log(dayPicked);
    console.log(timePicked);
    console.log(dayWeek.getDay());
    console.log(platePicked);

    var lastChar = platePicked[platePicked.length -1];
    switch(dayWeek.getDay()) {
        case 1:
            if(lastChar=='1' || lastChar=='2'){
                if((timePicked<"09:30" && timePicked>="07:00") || (timePicked<"19:30" && timePicked>="16:00") )
                    createSwalNo();
                else
                createSwalYes();
            }
        else
        createSwalYes();
          break;
        case 2:
                if(lastChar=='3' || lastChar=='4'){
                    if((timePicked<"09:30" && timePicked>="07:00") || (timePicked<"19:30" && timePicked>="16:00") )
                        createSwalNo();
                    else
                    createSwalYes();
                }
            else
            createSwalYes();
              break;
          break;
          case 3:
                if(lastChar=='5' || lastChar=='6'){
                    if((timePicked<"09:30" && timePicked>="07:00") || (timePicked<"19:30" && timePicked>="16:00") )
                        createSwalNo();
                    else
                    createSwalYes();
                }
            else
            createSwalYes();
              break;
          break;
          case 4:
                if(lastChar=='7' || lastChar=='8'){
                    if((timePicked<"09:30" && timePicked>="07:00") || (timePicked<"19:30" && timePicked>="16:00") )
                        createSwalNo();
                    else
                    createSwalYes();
                }
            else
            createSwalYes();
              break;
          break;
          case 5:
                if(lastChar=='9' || lastChar=='0'){
                    if((timePicked<"09:30" && timePicked>="07:00") || (timePicked<"19:30" && timePicked>="16:00") )
                        createSwalNo();
                    else
                    createSwalYes();
                }
            else
            createSwalYes();
              break;
          break;
        default:
            createSwalYes();
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



