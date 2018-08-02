function toggleViewAllGroups() {
    var x = document.getElementById("viewAllGroupsSection");
    var y = document.getElementById("viewMyGroupsSection");
    var z = document.getElementById("createGroupSection");
        
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

function toggleViewMyGroups() {
        var x = document.getElementById("viewAllGroupsSection");
        var y = document.getElementById("viewMyGroupsSection");
        var z = document.getElementById("createGroupSection");
            
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

    function toggleCreateGroupSection() {
        var x = document.getElementById("viewAllGroupsSection");
        var y = document.getElementById("viewMyGroupsSection");
        var z = document.getElementById("createGroupSection");
            
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

