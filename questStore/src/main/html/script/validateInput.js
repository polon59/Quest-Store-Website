function classNameIsEmpty(){
    var className = document.getElementById("class-name").value;
    if (className == "") {
        return true;
    } else return false;
}

function validateClassName(){
    if (!classNameIsEmpty){
        return true;
    } else return false;
}

function toggleClassSubmitability(){
    var submitClassButton = document.getElementById("submitClass");
    if (classNameIsEmpty()) {
        submitClassButton.setAttribute("disabled", "true")
    } else
        submitClassButton.removeAttribute("disabled");
}

function showError(id){
    document.getElementById(id).style.display = "block";
}


function levelNameIsEmpty(){
    var levelName = document.getElementById("level-name").value;
    if (levelName == "") {
        return true;
    } else return false;
}

function amountIsEmpty(){
    var amount = document.getElementById("level-amount").value;
    if (amount == NaN || amount.value.length==0){
        return true
    } return false;
}


function validateLevelData(){
    var levelName = document.getElementById("level-name").value;
    if (levelName.value.length>0 && !amountIsEmpty()){
        return true;
    } else return false;
}

function toggleLevelSubmitability(){
    var submitLevelButton = document.getElementById("submitLevel");
    if (levelNameIsEmpty() && amountIsEmpty()) {
        submitLevelButton.setAttribute("disabled", "true")
    } else
        submitLevelButton.removeAttribute("disabled");
}