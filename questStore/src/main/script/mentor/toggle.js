function toggleToGrade() {
    var x = document.getElementById("gradeSection");
    var y = document.getElementById("toDoSection");
    var z = document.getElementById("classSection");
        
    if ( ( (x.style.display === "none") && (y.style.display === "none") && (z.style.display === "none")) ||
    ((x.style.display === "none") && (y.style.display ==="block") && (z.style.display === "none")) ||
    ((x.style.display === "none") && (y.style.display === "none") && (z.style.display === "block")) ){

        x.style.display = "block";
        y.style.display = "none";
        z.style.display = "none";

    }else if((x.style.display === "block") && (y.style.display === "none") && (z.style.display === "none")){
        x.style.display = "none";
        y.style.display = "none";
        z.style.display = "none";
    }

}

function toggleToDo() {
        var x = document.getElementById("gradeSection");
        var y = document.getElementById("toDoSection");
        var z = document.getElementById("classSection");
            
        if ( ((x.style.display === "none") && (y.style.display === "none") && (z.style.display === "none")) || 
        ((x.style.display === "none") && (y.style.display === "none") && (z.style.display === "block")) ||
        ((x.style.display === "block") && (y.style.display === "none") && (z.style.display === "none")) ){
            x.style.display = "none";
            y.style.display = "block";
            z.style.display = "none";
    
        }else if((x.style.display === "none") && (y.style.display ==="block") && (z.style.display === "none")){
           
            x.style.display = "none";
            y.style.display = "none";
            z.style.display = "none";
        }
}

    function toggleClass() {
        var x = document.getElementById("gradeSection");
        var y = document.getElementById("toDoSection");
        var z = document.getElementById("classSection");
            
        if ( ((x.style.display === "none") && (y.style.display === "none") && (z.style.display === "none")) ||
            ((x.style.display === "block") && (y.style.display ==="none") && (z.style.display === "none")) ||
            ((x.style.display === "none") && (y.style.display === "block") && (z.style.display === "none")) ){

            x.style.display = "none";
            y.style.display = "none";
            z.style.display = "block";
    
    
        }else if((x.style.display === "none") && (y.style.display === "none") && (z.style.display === "block")){
            
            x.style.display = "none";
            y.style.display = "none";
            z.style.display = "none";
        }

    }

