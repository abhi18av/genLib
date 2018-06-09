// Run this with ammonite shell

var files = ls!


for ( fl <- files){ 
                if(fl.isFile){ 
                var info = %%("bash", "-c", ("file " +  fl))  
                var txt = info.toString().split(" ")(2) 
                println(txt) 

                if(txt == "Mobipocket"){
            
                var str = "mv " + fl + " " + fl.toString() + "." + "mobi"
                
                println(str)
                
                %%("bash", "-c", str)

            } else {
            
                var str = " mv " + fl + " " + fl.toString() + "." + txt.toLowerCase() 
            
                println(str)

                %%("bash", "-c", str)

            }
   
}}  

