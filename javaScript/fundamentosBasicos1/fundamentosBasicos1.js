//1 Obtén del 1 al 255: Escribe una función que devuelve un array con todos los números del 1 al 255.

function print255() {
    for (var i = 0; i <= 255; i++) {
        console.log(i);
    }
}

console.log(print255())

//2 Consigue pares hasta 1000: Escribe una función que entregue la suma de todos los números pares del 1 al 1000 - 
//Puedes usar un operador de módulo para este ejercicio. 


function pares() {
    var sum = 0
    for (var i = 1; i <= 1000; i++) {

        if (i % 2 == 0) {
            console.log("pares i: ", i);
            sum = sum + i;
            console.log("sum: ", sum);
        }
    }

}

pares()

//3 Suma impares hasta 5000: Escribe una función que devuelva la suma de todos los números impares entre 1 y 5000 
//(ej: 1+3+5+...+4997+4999).


function impares() {
    var sum = 0
    for (var i = 1; i <= 5000; i++) {
        if (i % 2 == 1) {
            sum = sum + i;
            console.log("sum: ", sum);
        }
    }
}

impares()

//4 Itera un array: Escribe una función que devuelva la suma de todos los valores dentro de un array 
//(ej:  [1,2,5] retorna 8. [-5,2,5,12] retorna 14). 

function sumaArray(x) {
    var sum = 0
    for (let i = 0; i < x.length; i++) {
        sum = sum + x[i];
    }
    return sum
}

console.log(sumaArray([1, 2, 5]))
console.log(sumaArray([-5, 2, 5, 12]))

//5 Encuentra el mayor (max): Dado un array con múltiples valores, 
//escribe una función que devuelva el número mayor (ej: para [-3,3,5,7] el número mayor (max) es 7). 

function encontrarMayor(x) {
    var max = x[0];
    for (let i = 0; i < x.length; i++) {
        if (x[i] > max) {
            max = x[i];
        }
    }
    return max
}

arreglo = [-3, 3, 5, 7];
console.log(encontrarMayor(arreglo));

//6 Encuentra el promedio (avg): Dado un array con múltiples valores, escribe una función que devuelva el promedio
// de los valores (ej: para [1,3,5,7,20] el promedio es 7.2).

function sacarPromedio(x) {
    var sum = 0;
    var avg = 0;
    for (let i = 0; i < x.length; i++) {
        sum = sum + x[i];
        avg = sum / x.length;
    }
    return avg
}

console.log(sacarPromedio([1, 3, 5, 7, 20]));

//7 Array de impares: Escribe una función que devuelva un array de todos los números impares
// entre 1 y 50 (ej: [1,3,5, …, 47,49]). Pista: Usa el método ‘push’.


function imparesArray() {
    var sum = 0;
    var array2 = [];
    for (var i = 1; i <= 50; i++) {
        if (i % 2 == 1) {
            sum = sum + i;
            array2.push(i);
        }
    }
    return array2
}

console.log(imparesArray());

//8 Mayor que Y: Dado un valor Y, escribe una función que toma un array y devuelve los valores mayores que Y. 
//Por ejemplo, si arr = [1,3,5,7] y Y = 3, tu función devolverá 2 (hay 2 números en el array mayores que 3, esto son 5 y 7). 

function mayoresY(x) {
    var y = 3;
    var sum = 0;
    for (let i = 0; i < x.length; i++) {
        if (x[i] > y) {
            sum = sum + 1;
        }
    }
    return sum
}
console.log(mayoresY([1, 3, 5, 7, 8]));

//9 Cuadrados: Dado un array con múltiples valores, escribe una función que reemplace cada valor por el cuadrado del mismo valor 
//(ej: [1,5,10,-2] será [1,25,100,4]).

function cuadrados(x) {
    var arreglo2 = [];
    for (let i = 0; i < x.length; i++) {
        arreglo2.push(x[i] * x[i]);
    }
    return arreglo2
}

console.log(cuadrados([1, 5, 10, -2]));

//opcion 2 

function cuadrados(x) {
    for (let i = 0; i < x.length; i++) {
        x[i] = x[i] * x[i];
    }
    return x
}

console.log(cuadrados([1, 5, 10, -2]));

//10 Negativos: Dado un array con múltiples valores, escribe una función que reemplace cualquier número negativo dentro del array por 0.
// Cuando el programa esté listo, el array no debiera contener números negativos (ej: [1,5,10,-2] se convertirá en [1,5,10,0]).

function reemplazarNegativos(x) {
    for (let i = 0; i < x.length; i++) {
        if (x[i] < 0) {
            x[i] = 0;
        }
    }
    return x
}
console.log(reemplazarNegativos([1, 5, 10, -2]));

//11 Max/Min/Avg: Dado un array con múltiples valores, escribe una función que devuelva un nuevo array que solo contenga el valor mayor (max),
// menor (min) y promedio (avg) del array original (ej: [1,5,10,-2] devolverá [10,-2,3.5]).

function maxMinAvg(x) {
    var arreglo2 = [];
    var max = x[0];
    var min = x[0];
    var avg = 0;
    var sum = 0;
    for (let i = 0; i < x.length; i++) {
        sum = sum + x[i];

        if (x[i] > max) {
            max = x[i];
        }

        if (x[i] < min) {
            min = x[i];
        }
    }
    avg = sum / x.length;

    arreglo2.push(max);
    arreglo2.push(min);
    arreglo2.push(avg);

    return arreglo2
}
console.log(maxMinAvg([1, 5, 10, -2]));

//12 Intercambia Valores: Escribe una función que intercambie el primer y el último valor de cualquier array.
// La extensión mínima predeterminada del array es 2 (ej: [1,5,10,-2] será [-2,5,10,1]). 


function intercambiarValores(arr) {
    if (arr.length < 2) {
        console.log("La extension minima del arreglo es 2");
    }
    else {
        var ultimoElemento = arr[arr.length - 1];
        arr[arr.length - 1] = arr[0];
        arr[0] = ultimoElemento;
        return arr;
    }
}
console.log(intercambiarValores([1, 5, 10, -2]));

//13 De Número a String: Escribe una función que tome un array de números y reemplace cualquier valor negativo por el string ‘Dojo’.
// Por ejemplo, dado el array = [-1,-3,2], tu función devolverá [‘Dojo’,‘Dojo’,2].

function reemplazarDojo(arr) {
    for (var i = 0; i < arr.length; i++) {
        if (arr[i] < 0) {
            arr[i] = 'Dojo';
        }
    }
    return arr
}
console.log(reemplazarDojo([-1, -3, 2]))

//arreglo profe

function random(x) {
    var x2 = []
    var coincidencias = 0;
    for (var i = 0; i < 10; i++) {
        var z = Math.floor((Math.random() * 20) + 1);
        if (x2.includes(z) == false) {
            x2.push(z);
        }
        else {
            i--;
        }
    }
    for (var i = 0; i < x.length; i++) {
        if (x2.includes(x[i]) == true) {
            coincidencias++
        }
    }
    console.log("coincidencias= ", coincidencias);
    console.log("x= ", x);
    return x2

}
console.log(random([19, 3, 17, 1, 6, 12, 8, 11, 15, 20]));