//Iniit Github class
const github = new Github();

//Iniit UI class
const ui = new UI();

document.getElementById('button').addEventListener('click', function(e){
  document.getElementById('user').style.display = 'none';
  document.querySelector('.footer').style.display = 'none';
let output = document.querySelector('.input').value;
if(output!== " "){
  //Maake http call
  github.getUser(output)
  .then(data =>{
    if(data.profile.message==='Not Found'){
      //Show Alert
     ui.showAlert('User Not Found');

    }
    else{
//Show the profile
     ui.showProfile(data.profile);
    }
  } )
} else{
  //clear the profile
  ui.clearProfile();
}


  e.preventDefault();
})