//define express obj
var express=require("express");
var app=express();

//var cookieparser=require("cookie-parser")
//for setting to specify path
var path=require("path");
var bodyParser=require("body-parser");
var routes=require("./routes/routers");
//mongodb connectivity
var mongoose=require("mongoose");
const { log } = require("console");
//to asign nodejs promise object to mongoose promise 
//promise object acceppts two functions if succes and if failure
mongoose.promise=global.promise;

//connect to mongodb url

const url='mongodb://localhost:27017/test'

//to make connection asyncly
mongoose.connect(url,{
    useMongoClient:true,
    connectTimeoutMS:1000
},function(err,result){
    if(err){
        console.log("Error in connecting to db");
    }
    else{
        console.log("Connected to db");
    }
});

//configure setting

app.set("views",path.join(__dirname,"views"))
app.set("view engine",'jade')

//defiine middleware
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({extended:false}));
app.use(express.static(path.join(__dirname,"pubic")))

//define al routes
//routing will be handled by route.js file
app.use("/",routes);

//start server
app.listen(3000);
console.log("server running at 3000");
module.exports=app;