//print 1 to x
function printUpTo(x) {
  if (x<0){
  console.log("numero negativo");
  return false;
}

  for (var i=1; i<=x;i++) {
    console.log(i);
    }
}
printUpTo(1000);
y = printUpTo(-10); 
console.log(y);

//print sum
function printSum(x) {
    var sum = 0;
    
    for(var i=0; i<x;i++){
        sum+=i;
        console.log(i, sum);
    }

    return sum
  }
  y = printSum(255) // debería imprimir todos los enteros de 0 a 255 y que cada entero imprima la suma parcial.
  console.log(y) // // debería imprimir 32640

  //printSumArray
  function printSumArray(x) {
    var sum = 0;
    for(var i=0; i<x.length; i++) {
        sum += x[i];
    }
    return sum;
  }
  console.log( printSumArray([1,2,3]) ); // debería imprimir 6
  
  