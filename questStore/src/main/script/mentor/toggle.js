function toggleToGrade() {
    var x = document.getElementById("gradeSection");
    var y = document.getElementById("classSection");
    var z = document.getElementById("toDoSection");
        
    if ((x.style.display === "none") && (y.style.display === "none") && (z.style.display === "none")) {
        x.style.display = "block";
        y.style.display = "none";
        z.style.display = "none";

    }else if((x.style.display === "block") && (y.style.display == "none") && (z.style.display == "none")){
        x.style.display = "none";
        y.style.display = "none";
        z.style.display = "none";

    }else if((x.style.display === "none") && ((y.style.display == "block") || (z.style.display == "block"))){
        x.style.display = "block";
        y.style.display = "none";
        y.style.display = "none";
    }
}

function toggleClass() {
    var x = document.getElementById("classSection");
    var y = document.getElementById("gradeSection");
    var z = document.getElementById("toDoSection");
        
    if ((x.style.display === "none") && (y.style.display === "none") && (z.style.display === "none")) {
        x.style.display = "block";
        y.style.display = "none";
        z.style.display = "none";
        
    }else if((x.style.display === "block") && (y.style.display == "none") && (z.style.display == "none")){
        x.style.display = "none";
        y.style.display = "none";
        z.style.display = "none";

    }else if((x.style.display === "none") && ((y.style.display == "block") || (z.style.display == "block"))){
        x.style.display = "block";
        y.style.display = "none";
        y.style.display = "none";
    }
}

    function toggleToDo() {
        var x = document.getElementById("toDoSection");
        var y = document.getElementById("classSection");
        var z = document.getElementById("classSection");
            
        if ((x.style.display === "none") && (y.style.display === "none") && (z.style.display === "none")) {
            x.style.display = "block";
            y.style.display = "none";
            z.style.display = "none";
            
        }else if((x.style.display === "block") && (y.style.display == "none") && (z.style.display == "none")){
            x.style.display = "none";
            y.style.display = "none";
            z.style.display = "none";

        }else if((x.style.display === "none") && ((y.style.display == "block") || (z.style.display == "block"))){
            x.style.display = "block";
            y.style.display = "none";
            y.style.display = "none";
        }
    }

