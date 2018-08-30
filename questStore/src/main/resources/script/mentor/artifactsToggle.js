function toggleViewAllArtifacts() {
    var w = document.getElementById("viewAllArtifacts")
    var x = document.getElementById("addArtifact");
    var y = document.getElementById("changeArtifactData");
    var z = document.getElementById("findArtifact");
        
    if ( ((w.style.display === "none") && (x.style.display === "none") && (y.style.display === "none") && (z.style.display === "none")) ||
    ((w.style.display === "none") && (x.style.display === "block") && (y.style.display === "none") && (z.style.display === "none")) ||
    ((w.style.display === "none") && (x.style.display === "none") && (y.style.display === "block") && (z.style.display === "none")) ||
    ((w.style.display === "none") && (x.style.display === "none") && (y.style.display === "none") && (z.style.display === "block")) ){

        w.style.display = "block";
        x.style.display = "none";
        y.style.display = "none";
        z.style.display = "none";

    }else if((w.style.display === "block") && (x.style.display === "none") && (y.style.display === "none") && (z.style.display === "none")){
        
        w.style.display = "none";
        x.style.display = "none";
        y.style.display = "none";
        z.style.display = "none";
    }

}

function toggleAddArtifact() {
    var w = document.getElementById("viewAllArtifacts")
    var x = document.getElementById("addArtifact");
    var y = document.getElementById("changeArtifactData");
    var z = document.getElementById("findArtifact");
        
    if ( ((w.style.display === "block") && (x.style.display === "none") && (y.style.display === "none") && (z.style.display === "none")) ||
    ((w.style.display === "none") && (x.style.display === "none") && (y.style.display === "block") && (z.style.display === "none")) ||
    ((w.style.display === "none") && (x.style.display === "none") && (y.style.display === "none") && (z.style.display === "block")) ||
    ((w.style.display === "none") && (x.style.display === "none") && (y.style.display === "none") && (z.style.display === "none")) ){

        w.style.display = "none";
        x.style.display = "block";
        y.style.display = "none";
        z.style.display = "none";

    }else if((w.style.display === "none") && (x.style.display === "block") && (y.style.display === "none") && (z.style.display === "none")){
        
        w.style.display = "none";
        x.style.display = "none";
        y.style.display = "none";
        z.style.display = "none";
    }

}

function toggleChangeArtifactData() {
    var w = document.getElementById("viewAllArtifacts")
    var x = document.getElementById("addArtifact");
    var y = document.getElementById("changeArtifactData");
    var z = document.getElementById("findArtifact");
        
    if ( ((w.style.display === "none") && (x.style.display === "none") && (y.style.display === "none") && (z.style.display === "none")) ||
    ((w.style.display === "none") && (x.style.display === "block") && (y.style.display === "none") && (z.style.display === "none")) ||
    ((w.style.display === "none") && (x.style.display === "none") && (y.style.display === "none") && (z.style.display === "block")) ||
    ((w.style.display === "block") && (x.style.display === "none") && (y.style.display === "none") && (z.style.display === "none")) ){

        w.style.display = "none";
        x.style.display = "none";
        y.style.display = "block";
        z.style.display = "none";

    }else if((w.style.display === "none") && (x.style.display === "none") && (y.style.display === "block") && (z.style.display === "none")){
        
        w.style.display = "none";
        x.style.display = "none";
        y.style.display = "none";
        z.style.display = "none";
    }

}


function toggleFindArtifact() {
    var w = document.getElementById("viewAllArtifacts")
    var x = document.getElementById("addArtifact");
    var y = document.getElementById("changeArtifactData");
    var z = document.getElementById("findArtifact");
        
    if ( ((w.style.display === "none") && (x.style.display === "none") && (y.style.display === "none") && (z.style.display === "none")) ||
    ((w.style.display === "block") && (x.style.display === "none") && (y.style.display === "none") && (z.style.display === "none")) ||
    ((w.style.display === "none") && (x.style.display === "block") && (y.style.display === "none") && (z.style.display === "none")) ||
    ((w.style.display === "none") && (x.style.display === "none") && (y.style.display === "block") && (z.style.display === "none")) ){

        w.style.display = "none";
        x.style.display = "none";
        y.style.display = "none";
        z.style.display = "block";

    }else if((w.style.display === "none") && (x.style.display === "none") && (y.style.display === "none") && (z.style.display === "block")){
        
        w.style.display = "none";
        x.style.display = "none";
        y.style.display = "none";
        z.style.display = "none";
    }

}