let index = {
  init: function() {
    $("#btn-register").on("click", () => {
      this.register();
    });
    $("#btn-login").on("click", () => {
      this.login();
    });
  },

  register: function() {
    let data={
    'username':$('#username').val(),
    'password':$('#password').val(),
    'email':$('#email').val()
    };
    $.ajax({
      type:"post",
      url:"/api/user",
      data:JSON.stringify(data),
      contentType:"application/json; charset=utf-8",
      dataType:"text"
    }).done(function(data){
        alert(data);
        location.href="/login";
    }).fail(function(){
    })

  },
   login: function() {
   let data={
     'username':$('#username').val(),
     'password':$('#password').val()
   };
    console.log(data);
    $.ajax({
    type:"post",
    url:"/api/user/login",
    data:JSON.stringify(data),
    contentType:"application/json; charset=utf-8",
    dataType:"json"
    }).done(function(data){
   console.log(data.username);
   if(data.username != null){
   location.href="/index";
   }else location.href="/login";
    }).fail(function(){
    })
  }
}
index.init();
