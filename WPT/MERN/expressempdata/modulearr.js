emparr=[];

exports.adddata=function(ob){
    ob=emparr.find(x=>x.empid==ob.empid);
    if(ob==null){
    emparr.push(ob);
    return "added";
    }
    else{
        return "duplicate object here"
    }
}

exports.searchdata=function(empid){
    
    return emparr.find(x=>x.empid==empid);
}