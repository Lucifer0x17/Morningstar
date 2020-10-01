class Github{
constructor(){
  this.clientid = '272d07acf2a18acc2d93';
  this.clientpass = '83d32cebcc15101b5a01ba692bcf368f36c89b74';
  this.repocount  = 5;
  this.reposort = 'created:asc';   
}
async getUser(user){
 const profileResponse = await fetch(`https://api.github.com/users/${user}?client_id = ${this.clientid}?client_secret = ${this.clientpass}`);



 const profile = await profileResponse.json();

 return{
   profile
 }



}
}