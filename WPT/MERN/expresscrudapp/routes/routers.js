var express=require("express");
var mongoose=require("mongoose");
var schema=mongoose.Schema
var router=express.Router();

//design model using mongoose schema
var empschema= new schema({
    _id:Number,
    empid:String,
    ename:{type:String,trim:true,required:true},  //this has validation inside {  }
    sal:String
})

//RETRIEVE DATA from emptab  collection and its schema is defined using empschema
//model(name, schema object, collection name)
//collection name is optional if model name and collection name is  same then there is no need 
var Emp=mongoose.model('emptab',empschema,'emptab')

//to retrieve all records and show as tables
router.get("/",function(req,resp){
    Emp.find().exec(function(err,data){
        if(err)
            {
                resp.status(500).send("no data found");
            }
            else{
                console.log(data);
                //reneder function will search index.jade in views folder 
                resp.render("index",{title:"Employee Data",empdata:data})
            }
    })
});

//to accept data in the form ad add in the db

router.get('/create',function(req,resp){
    resp.render('create',{title:'Add Employee'}); 
})



module.exports=router;