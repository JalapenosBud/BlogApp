$( document ).ready(function() {

    // SUBMIT FORM
    $("#blogpostForm").submit(function(event) {
        // Prevent the form from submitting via the browser.
        event.preventDefault();
        ajaxPost();
    });


    function ajaxPost(){

        // PREPARE FORM DATA
        var formData = {
            id : $("#id").val(),
            title : $("#title").val(),
            author :  $("#author").val(),
            creation_date : $("#creation_date").val(),
            blog_post_text : $("#blog_post_text").val()
           // ,tags : $("#tags").val()
        }

        // DO POST
        $.ajax({
            type : "POST",
            contentType : "application/json",
            url : window.location + "blogposts/save",
            data : JSON.stringify(formData),
            dataType : 'json',
            success : function(result) {
                if(result.status == "Done"){
                    $("#postResultDiv").html("<p style='background-color:#7FA7B0; color:white; padding:20px 20px 20px 20px'>" +
                        "Post Successfully! <br>" +
                        "---> Blogpost's Info: Title = " + result.data.title +
                        " ,Author = " + result.data.author +
                        ", creation date = " + result.data.creation_date +
                        ", text = " + result.data.blog_post_text +
                        "</p>");
                }else{
                    $("#postResultDiv").html("<strong>Error</strong>");
                }
                console.log(result);
            },
            error : function(e) {
                alert("Error!")
                console.log("ERROR: ", e);
            }
        });

        // Reset FormData after Posting
        resetData();

    }

    function resetData(){
        $("#title").val("");
        $("#author").val("");
    }
})