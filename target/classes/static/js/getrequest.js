$( document ).ready(function() {

    // GET REQUEST
    $("#getAllBlogPostId").click(function(event){
        event.preventDefault();
        ajaxGet();
    });

    // DO GET
    function ajaxGet(){
        $.ajax({
            type : "GET",
            url : window.location + "blogposts/all",
            success: function(result){
                if(result.status == "Done"){
                    $('#getResultDiv ul').empty();
                    var custList = "";
                    $.each(result.data, function(i, blogpost){
                        var blogpost = "- blogpost with Id = " + i + ", title = " + blogpost.title + ", author = " + blogpost.author + "<br>";
                        $('#getResultDiv .list-group').append(blogpost)
                    });
                    console.log("Success: ", result);
                }else{
                    $("#getResultDiv").html("<strong>Error</strong>");
                    console.log("Fail: ", result);
                }
            },
            error : function(e) {
                $("#getResultDiv").html("<strong>Error</strong>");
                console.log("ERROR: ", e);
            }
        });
    }
})