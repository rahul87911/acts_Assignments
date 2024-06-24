const http=require("http");

var server=http.createServer(function(req,resp){
    console.log("received request : "+req.url+"------->"+req.method);
    resp.writeHead(200,{"Content-Type":"text/html"});
    resp.write("<h1>Welcome to Node Server</h1>");
    resp.end("<h2>Response ended</h2>");
});


server.listen(3000);
console.log("Server started at port 3000");