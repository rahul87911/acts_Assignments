const express=require("express");
const app=express();
var bodyparser=require("body-parser");

app.use(bodyparser.urlencoded({extended:false}));



app.get("/",function(req,resp){
    console.log("received request : "+req.url+"------->"+req.method);
    resp.send("<h1>Welcome to Node Server</h1>");
})

app.get("/submit_data",function(req,resp){
    resp.send("<h1>display data</h1>")
})

app.listen(3000);
console.log("listening at 3000");