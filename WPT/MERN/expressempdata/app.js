const express=require("express");
const app=express();
var bodyparser=require("body-parser");

app.use(bodyparser.urlencoded({extended:false}));

const m1=require("./modulearr");

app.get("/",function(req,resp){
    console.log("received request : "+req.url+"------->"+req.method);
    resp.sendFile("public/index.html",{root:__dirname});
})

app.post("/submit_data",function(req,resp){
if(req.body.btn1=="add")
    {
        var empid=parseInt(req.body.empid);
        var ename=req.body.ename;
        var sal=parseFloat(req.body.sal);
        e={empid,ename,sal};
        msg=m1.adddata(e);
        resp.send(`<h4>${msg}</h4>`);
    }
    else{
        var empid=parseInt(req.body.empid);
        ob=m1.searchdata(empid);
        if(ob!=null){
        resp.send(JSON.stringify(ob));
    }
    else{
        resp.send("no such employee found");
    }
    }
})

app.listen(3000);
console.log("listening at 3000");