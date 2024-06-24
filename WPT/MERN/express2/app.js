const express=require("express");
const app=express();
var bodyparser=require("body-parser");

app.use(bodyparser.urlencoded({extended:false}));



app.get("/",function(req,resp){
    console.log("received request : "+req.url+"------->"+req.method);
    resp.sendFile("public/index.html",{root:__dirname})
})

app.get("/submit_data",function(req,resp){
var num1=req.query.n1;
// in case of post method we cannot retrieve data from url querystring we have to retrieve it from body so we use ----> first we will change app.post("/sumbit_data",function(req,resp){  var num1= req1.body.n1; }) 
var num2=req.query.n2;
resp.send("n1 "+num1+"n2 "+num2);
})

app.listen(3000);
console.log("listening at 3000");