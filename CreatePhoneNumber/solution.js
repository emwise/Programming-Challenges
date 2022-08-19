function createPhoneNumber(numbers){
  var ans = "(";
  
  numbers.forEach((numb, index)=>{
    if(index===2){
      ans+=numb;
      ans+=") "
    }
    else if(index===5){
      ans+=numb;
      ans+="-"
    }
    else{
      ans+=numb;
    }
  })
  return ans;
}