//1 Dados un array y un valor Y, cuenta e imprime (print) el número de valores del array que sean mayores que Y. 
function printMayor(arrayX,y){
    var contador =0;
    for(let i=0; i < arrayX.length; i++){ //recorre el array
        if(arrayX[i]>y){
            contador ++;
        }
    }
    console.log(contador); 
    return contador;
}

printMayor([7,5,9,11,1,2,4,7],6)

//2 Dado un array, imprime los valores máximos (max), mínimos (min) y promedio (average) para el array.
function maxMinAvg(x){
    let max = x[0], min = x[0], sum = x[0];
    for(let i = 1; i < x.length; i++){ //recorre el array // tambien se puede usar for (let i in x) 
        if(x[i]>max){
            max = x[i];
        }
        if(x[i]<min){
            min = x[i];
        }
        sum+=x[i];
        
    }
    console.log("max: "+ max, "min: "+ min, "avg: "+ sum/x.length);
    //Math.max(...x), Math.min(...x)// y elimina las variables
} 
maxMinAvg([1,2,3,4,5]);

//3 Dado un array de números, crea una función que dé como resultado un nuevo array donde los valores negativos se reemplacen por el texto (string) ‘Dojo’. 
//Por ejemplo, reemplazarNegativos([1,2,-3,-5,5]) debiera devolver [1,2, “Dojo”, “Dojo”, 5].

function reemplazagarNegativos(arr){
    for(let i in arr){
        if (arr[i]<0){
            arr[i]='Dojo'
        }
    }
    return arr;
}
console.log(reemplazagarNegativos([1,2,-3,-5,5]))


//4 Dado un array y su respectivo índice, remueve los valores en el rango del índice dado( acortando el array).
//Por ejemplo, removerRango([20,30,40,50,60,70],2,4)debiera devolver [20,30,70].

function removerRango(arr, inicio, cant){   // arreglo, indice de splice, cantidad de valores a remover
    arr.splice(inicio, cant-inicio+1);      //splice remueve valores desde un indice hasta la cantidad pedida
    console.log(arr);
}
removerRango([20,30,40,50,60,70],2,4)
