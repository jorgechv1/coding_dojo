//1    
function printAverage(arreglo){
var sum = 0;
for( var i=0; i<arreglo.length; i++){
    sum = sum + arreglo[i];
}
    return (sum/arreglo.length);     
}
y = printAverage([1,2,3]); //1+2+3=6/3=2
console.log(y); // should log 2
  
y = printAverage([2,5,8]);
console.log(y); // should log 5

//2
function returnOddArray(){
var arr = [];
for( var i=1; i<=255; i++){
    if(i%2 ==1){
    arr.push(i);
    }
}
    return arr;
}
y = returnOddArray();
console.log(y); // should log [1,3,5,...,253,255]

//3
function cuadrado(x){
    array=[];
    for(var i=0; i< x.length; i++){          
        array.push(x[i] * x[i];);
    }
    return array;
}

console.log(cuadrado([1,2,3,4,5,6,7,8,9,10]))