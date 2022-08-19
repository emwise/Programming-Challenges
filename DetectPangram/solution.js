function isPangram(string){
  var string = string.toLowerCase()
  var counter = 0;

  if(string.includes("a")){
    counter++;
  }
  if(string.includes("b")){
    counter++;
  }
  if(string.includes("c")){
    counter++;
  }
  if(string.includes("d")){
    counter++;
  }
  if(string.includes("e")){
    counter++;
  }
  if(string.includes("f")){
    counter++;
  }
  if(string.includes("g")){
    counter++;
  }
  if(string.includes("h")){
    counter++;
  }
  if(string.includes("i")){
    counter++;
  }
  if(string.includes("j")){
    counter++;
  }
  if(string.includes("k")){
    counter++;
  }
  if(string.includes("l")){
    counter++;
  }
  if(string.includes("m")){
    counter++;
  }
  if(string.includes("n")){
    counter++;
  }
  if(string.includes("o")){
    counter++;
  }
  if(string.includes("p")){
    counter++;
  }
  if(string.includes("q")){
    counter++;
  }
  if(string.includes("r")){
    counter++;
  }
  if(string.includes("s")){
    counter++;
  }
  if(string.includes("t")){
    counter++;
  }
  if(string.includes("u")){
    counter++;
  }
  if(string.includes("v")){
    counter++;
  }
  if(string.includes("w")){
    counter++;
  }
  if(string.includes("x")){
    counter++;
  }
  if(string.includes("y")){
    counter++;
  }
  if(string.includes("z")){
    counter++;
  }

  if(counter === 26){
    return true;
  }else{
    return false;
  }
  
}