
//1 Tamaño Grande - Dado un array, escribe una función que cambie todos los números positivos en él, por el string “big”.
// Ejemplo: grande([-1,3,5,-5]) devuelve [-1, “big”, “big”, -5].

function grande(x) {
    for (let i = 0; i < x.length; i++) {
        if (x[i] > 0) {
            x[i] = "big";
        }
    }
    return x
}

console.log(grande([-1, 3, 5, -5]));

//2 Imprime (print) el menor, devuelve (return) el mayor - Crea una función que tome un array de números.
// La función debería imprimir (print) el menor valor del array, y devolver (return) el mayor. 

function menorMayor(x) {
    console.log(Math.min.apply(Math, x));

    return Math.max.apply(Math, x);
}

console.log(menorMayor([-10, 1, 2, 3, 9])); // print 9 y return -10

//3 Imprime (print) uno, devuelve (return) otro- Crea una función para un array de números.
// La función debería imprimir (print) el penúltimo valor y devolver (return) el primer valor impar.

function penultimoImpar(x) {
    var impar = 0;
    for (let i = 0; i < x.length; i++) {
        if (x[i] % 2 == 1) {
            impar = x[i];
            break;
        }
    }
    console.log(x[x.length - 2]);
    return impar;
}
console.log(penultimoImpar([2, 2, 3, 4, 5]))

//4 Doble Visión - Dado un array, crea una función que devuelva un nuevo array donde cada valor se duplique.
// Entonces, doble([1,2,3]) debiera devolver [2, 4, 6] sin cambiar el array original. 

function duplicarArray(x) {
    var arregloDuplicado = [];
    for (var i = 0; i < x.length; i++) {
        arregloDuplicado.push(x[i] + x[i]);
    }
    return arregloDuplicado
}
console.log(duplicarArray([1, 2, 3]));

//5 Contar Positivos -  Dado un array de números, crea una función para reemplazar el último valor con el número de valores positivos encontrados en el array.
// Ejemplo, contarPositivos([-1,1,1,1]) cambia el array original y devuelve [-1,1,1,3].

function contarPositivos(x) {
    var positivos = 0;
    for (var i = 0; i < x.length; i++) {
        if (x[i] > 0) {
            positivos++;
        }
    }
    x.push(positivos);
    return x;
}
console.log(contarPositivos([-1, 1, 1, 1]));

//6 Pares e Impares - Crea una función que acepte un array. Cada vez que ese array tenga 3 valores impares seguidos,
// imprime (print) “¡Qué imparcial!”, y cada vez que tenga 3 pares seguidos, imprime (print) “¡Es para bien!”.

function paresImpares(array) {
    var cuentaparcial = 0;
    var cuentabien = 0;

    for (var i = 0; i < array.length; i++) {
        if (array[i] % 2 === 1) {
            cuentaparcial++;

            if (cuentaparcial === 3) {
                console.log("¡Qué imparcial!");
                cuentaparcial = 0;
            }
        }
        else {
            cuentaparcial = 0;
        }

        if (array[i] % 2 === 0) {
            cuentabien++;

            if (cuentabien === 3) {
                console.log("¡Es para bien!");
                cuentabien = 0;
            }
        }
        else {
            cuentabien = 0;
        }
    }
}

paresImpares([1, 1, 1]);
paresImpares([2, 2, 2]);

//7 Incrementa los Segundos - Dado un array de números llamado arr, suma 1 a los elementos, específicamente
// a aquellos cuyo índice es impar (arr[1], arr[3], arr[5], etc). Luego, imprime (console.log) cada valor del array y devuelve el arreglo arr. 

function incrementaArr() {
    for (var i = 0; i < arr.length; i++) {
        console.log(arr[i])
        if (i % 2 == 1) {
            arr[i]++;
        }
    }
    return arr;
}
arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
console.log(incrementaArr(arr));

//8 Longitudes previas - Pasado un array (similar a decir ‘tomado un array’ o ‘dado un array’) que contiene strings, 
//reemplaza cada string con un número de acuerdo cantidad de letras (longitud) del string anterior. 
//Por ejemplo, longitudesPrevias([“programar”,“dojo”, “genial”]) debería devolver [“programar”,9, 4]. Pista: ¿For loops solo puede ir hacia adelante?

function longitudesPrevias(x) {
    for (var i = x.length - 1; i > 0; i--) {
        x[i] = x[i - 1].length;
    }
    return x;
}

console.log(longitudesPrevias(["programar", "dojo", "genial"]));

//9 Agrega Siete - Construye una función que acepte un array. Devuelve un nuevo array con todos los valores del original, pero sumando 7 a cada uno.
// No alteres el array original. Por ejemplo, agregaSiete([1,2,3) debería devolver [8,9,10] en un nuevo array. 

function agregarSiete(x) {
    var arregloNuevo = []
    for (var i = 0; i < x.length; i++) {
        arregloNuevo.push(x[i] + 7);
    }
    return arregloNuevo
}
console.log(agregarSiete([1, 2, 3]));

//10 Array Inverso - Dado un array, escribe una función que invierte sus valores en el lugar.
// Ejemplo: invertir([3,1,6,4,2)) devuelve el mismo array pero con sus valores al revés, es decir [2,4,6,1,3]. 
// Haz esto sin crear un array temporal vacío. (Pista: necesitarás intercambiar (swap) valores).

function invertir(array) {                  //No pude hacerlo yo solo, tuve que buscar la funcion lista
    var inicio = 0;
    var fin = array.length - 1;

    while (inicio < fin) {
        var temp = array[inicio];
        array[inicio] = array[fin];
        array[fin] = temp;
        inicio++;
        fin--;
    }
    return array;
}
console.log(invertir([3, 1, 6, 4, 2]));

function invertir(array) {
    var inicio = 0;
    var fin = array.length - 1;

    while (inicio < fin) {
        array[inicio] = array[inicio] ^ array[fin];
        array[fin] = array[inicio] ^ array[fin];
        array[inicio] = array[inicio] ^ array[fin];
        inicio++;
        fin--;
    }

    return array;
}

console.log(invertir([3, 1, 6, 4, 2]));

//11 Perspectiva: Negativa - Dado un array crear y devuelve uno nuevo que contenga todos los valores del array original,
// pero negativos (no simplemente multiplicando por -1). Dado [1,-3,5], devuelve [-1,-3,-5].

function arrayNegativo(x) {
    var arregloNegativo = [];
    for (var i = 0; i < x.length; i++) {
        if (x[i] > 0)
            arregloNegativo.push(-x[i]);
        else
            arregloNegativo.push(x[i]);
    }
    return arregloNegativo
}
console.log(arrayNegativo([1, -3, 5, 10, -5, 10]))

//12 Siempre hambriento - Crea una función que acepte un array e imprima (print) “yummy” cada vez que alguno de los valores sea “comida”.
// Si ningún valor es “comida”, entonces imprime “tengo hambre” una vez. 

function hambriento(x) {
    var encontrar = false;
    for (var i = 0; i < x.length; i++) {
        if (x[i] === "comida") {
            console.log("yummy");
            encontrar = true;
        }
    }
    if (!encontrar) {
        console.log("tengo hambre");
    }
}
hambriento(["nada", "comida", "nada"]);
hambriento(["agua", "refresco"]);

//13 Cambiar hacia el centro -  Dado un array, cambia el primer y último valor, el tercero con el ante penútimo, etc.
// Ejemplo: cambiaHaciaElCentro([true, 42, “Ada”, 2, “pizza”]) cambia el array a [“pizza¨, 42, “Ada”, 2, true]. 
// cambiaHaciaElCentro([1,2,3,4,5,6]) cambia el array a [6,2,4,3,5,1]. No es necesario devolver (return) el array esta vez.

function cambiaHaciaElCentro(array) {           //Tampoco pued hacerlo solo tuve que buscar la solucion.
    var longitud = array.length;
    var mitad = Math.floor(longitud / 2);       // declarar la mitad de un array 

    for (var i = 0; i < mitad; i += 2) {
        var temp = array[i];                    //variable temporal  
        array[i] = array[longitud - 1 - i];     // array[i] pasa a ser el ultimo (intercambiar primero con ultimo)
        array[longitud - 1 - i] = temp;
    }
}


var array1 = [true, 42, "Ada", 2, "pizza"];
cambiaHaciaElCentro(array1);
console.log(array1);

var array2 = [1, 2, 3, 4, 5, 6];
cambiaHaciaElCentro(array2);
console.log(array2); 



// 14 Escala el Array - Dado un array arr y un número num, multiplica todos los valores en el array arr por el número num,
// y devuelve el array arr modificado. Por ejemplo, escalaArray([1,2,3], 3] debería devolver [3,6,9].

function escalaArray(arr, num) {
    var num = 3
    for (var i = 0; i < arr.length; i++) {
        arr[i] = arr[i] * num;
    }
    return arr;
}
console.log(escalaArray([1, 2, 3]));