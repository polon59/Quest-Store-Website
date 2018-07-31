function classNameIsEmpty(){
    var className = document.getElementById("class-name").value;
    var incorrectName = "";
    if (className == incorrectName) {
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
    var check = classNameIsEmpty();
    if (check) {
        submitClassButton.setAttribute("disabled", "true")
    } else
        submitClassButton.removeAttribute("disabled");
}

function showError(id){
    document.getElementById(id).style.display = "block";
}



function levelNameIsEmpty(){
    var levelName = document.getElementById("level-name").value;
    var incorrectName = "";
    if (levelName == incorrectName) {
        return true;
    } else return false;
}

function amountIsEmpty(){
    var amount = document.getElementById("level-amount").value;
    var incorrectAmount = NaN;
    if (amount == incorrectAmount){
        return true
    } return false;
}


function validateLevelData(){
    if (!levelNameIsEmpty && !amountIsEmpty){
        return true;
    } else return false;
}

function toggleLevelSubmitability(){
    var submitLevelButton = document.getElementById("submitLevel");
    if (validateLevelData() == true) {
        submitLevelButton.setAttribute("disabled", "true")
    } else
        submitLevelButton.removeAttribute("disabled");
}