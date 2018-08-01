function toggleClassCreation() {
    var x = document.getElementById("createClassSection");
    var y = document.getElementById("createLevelSection");
    if ((x.style.display === "none") && (y.style.display === "none")) {
        x.style.display = "block";
        y.style.display = "none";
    }else if((x.style.display === "block") && (y.style.display == "none")){
        x.style.display = "none";
        y.style.display = "none";
    }else if((x.style.display === "none") && (y.style.display == "block")){
        x.style.display = "block";
        y.style.display = "none";
    }
}

function toggleLevelCreation() {
    var x = document.getElementById("createLevelSection");
    var y = document.getElementById("createClassSection");
    if ((x.style.display === "none") && (y.style.display === "none")) {
        x.style.display = "block";
        y.style.display = "none";
    }else if((x.style.display === "block") && (y.style.display == "none")){
        x.style.display = "none";
        y.style.display = "none";
    }else if((x.style.display === "none") && (y.style.display == "block")){
        x.style.display = "block";
        y.style.display = "none";
    }
}