let index = {
  init: function() {
    $("#btn-register").on("click", () => {
      this.register();
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
      url:"/api/register",
      data:JSON.stringify(data),
      contentType:"application/json; charset=utf-8",
      dataType:"text"
    }).done(function(data){
        alert(data);
        location.href="/login";
    }).fail(function(){
    })

  }
}
index.init();
