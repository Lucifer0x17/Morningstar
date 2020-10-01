class UI{
  constructor(){
    this.profile = document.getElementById('profile');
  }

  showProfile(user){
this.profile.innerHTML = `
<style>
body{
 overflow-x:hidden;
 overflow-y:scroll;
}
.details{
  box-shadow: 20px 20px 30px 10px grey;
  border-radius: 30px;
  font-weight: bolder;
  background: #000;
  margin:auto;
  width: 600px;
  height:1000px;
}
.updated .created{
  font-size:1.3rem;
}
.box{
  height:auto;
  width:auto;
}
.work{
  border-top:#fff solid 2px;
  display:flex;
  flex-direction:row;
  justify-content:space-between;
  align-items:center;
}

.row3{
  display:flex;
  flex-direction:column;
  align-items:center;
}
.img{
  margin-top:40px;
  border-radius:170px;
  height: 350px;
  width:auto;
}
.followers{
  margin-top:20px;
  border-radius:10px; 
  background:#333;
  color:#fff;
  font-weight:bolder;
  padding:18px;

}
span{
  color:#48AAAD;
}
.reps{
  background:#333;
  margin-top:50px;
  display:flex;
  flex-direction:column;
  text-align:center;
}
.repos{ 
  color:#fff;
  font-weight:bolder;
  padding:4px;

}
.gists{ 
  color:#fff;
  font-weight:bolder;
  padding:4px;

}
h3{
  color:#48AAAD;
}
.update{
  margin-bottom: 20px;
}
.following{
  margin-top:20px;
  border-radius:10px;
  background:#333;
  color:#fff;
  font-weight:bolder;
  padding:18px;
}
.btn{
  margin-top:20px;
  margin-left:20px;
  margin-right:20px;
  text-decoration:none;
  background:#333;
  border-radius:10px;
  color:#fff;
  font-weight:bolder;
  padding:18px;
}

@media(max-width:760px){
.details{
  width:auto;
  height:auto;
  overflow-x:hidden;
  overflow-y: scroll;
  margin:auto;
  padding:auto;
}
.btn a:hover{
  background:white;
  color:black;
}
.work{
  display:flex;
  flex-direction:column;
}
};
</style>
<div class = "box">
 <div class="details">
   <div class = "row3">
     <img class="img" src="${user.avatar_url}">
     <h1 class="name">${user.name}</h1>
     <h3 class="id"><span>@</span>${user.login}</h3>
     <div class="update">
     <div class="created">Created On: ${user.created_at}</div>
     <div class="updated">Last Updated: ${user.updated_at}</div>
     </div>
     <div class="work">
        <div class="followers">Followers: ${user.followers}</div>
        <a href = "${user.html_url}" target="_blank" class = "btn">View Profile</a>
        <div class="followers">Following: ${user.following}</div>
      </div>
    </div>
    <div class="reps">
      <div class="repos">Public Repositories: ${user.public_repos}</div>
      <div class="gists">Public Gists: ${user.public_gists}</div>
    </div>
  </div>
  
</div>
`;
document.querySelector('.footer').style.display = 'block';
}

}