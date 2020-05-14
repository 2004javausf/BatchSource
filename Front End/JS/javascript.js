//JavaScript is NOT related to Java
//not compiled- interpreted
//Loosely-typed= variable types are assigned are runtime
var a=10;
console.log(a);
a="chaos"
console.log(a);
var b,c,d,e,f,g,h,e;
b="10";
c=true;
d= {}; //object
e= null;
g= (0/0);
h= []; //array
i= function(){};
j=4;
/*
Datatypes
    Primitives
        undefined
        boolean
               true or false
                ALSO have truthy and falsy
                    Falsy
                        -0
                        0
                        undefined
                        null
                        false
                        ""
                        NaN
                    Truthy
                        True
                        1
                        Object
                        Everything else that isn't falsey
        number
        string
        bigint-ES10
        Symbol-ES6
        null-  Special primitive type having additional usage for it's value:
             if object is not inherited, then null is shown;
        
    Not Primitives
        object
        function

*/
//typeof()

let variable= 'color';
console.log(typeof(variable));

variable=123;
console.log(typeof(variable));

variable = 3>5;
console.log(typeof(variable));

variable = null;
console.log(typeof(variable));

variable = (0/0);
console.log(typeof(variable));
console.log(variable);

//Type Coercion
console.log(5==5);
console.log(5=='5');
console.log(5==='5');
console.log(false==1);
console.log(false==0);
console.log(true==12);//false
console.log(-0===0);
console.log(7+7+7);
console.log(7+7+"7");
console.log("7"+7+7);//WINNER
console.log(7+"7"+7);

//Objects in JS
// property value pairs

//object literal
var person= {
    "name":'Jimmy',
    "age": 74
};

//Constructor
function Human(name,age){
    this.name=name;
    this.age=age;
}

//MAker Function
function makeHuman(name,age){
    var h={};
    h.name=name;
    h.age=age;
    return h;
}
//Another Maker Function
function makeHuman2(name,age){
    var p={
        "name":name,
        "age":age

    }
    return p;
}
//Arrays
var arr= [10,20,30];
arr[9]=5;
arr[50]= "why";
arr[3]= [10,34,"hotdog"];

//Functions- 3 invocations

//function form -"this" refers to the global object
//in browser it is "window"
function divideByZero(kitty,kat){
    console.log("hey kitty kitty");
    return (kitty+kat);
}
//no overloading!
//Constructor Form - "this" refers to the object being made
var conFunc=  function(a,b){
    return a*b;
}

//Method form - "this" refer to the object its based off
person.getInfo= function(){
    return this.age;
}

crazy=function (at,least,three){
    var cake;
    pizza="pineapple";
    console.log(at);
    console.log(least);
    console.log(three);
    console.log(arguments[5]);
}
/*Scopes
    Function scope
        Things that are declared inside a function
        use the "var" keyword
        if we leave out the "var" keyword- creates an implicit global
    Global Scope
        anything declared outside of a function
        accessible anywhere
    Shadowing
        if multiple variables have the same name,
         JS will use the one that was declared the most recently.
        Variable name clashes are bad. Difficult to debug and test.
    "let" does not escape blocks, "var" does
Hositing- moving declarations to top of scope
*/

let funstuff=function(a,b){
    var c,d;
    let e,f;
    var g=4;
    if(a>b){
        var g=3;
        let h=10;
        i;

    }
}

//Closure- an inner function that has access to the outer function's variable(scope chain)
// closure mimics encapsulation
//has 3 scope chains:
//1. it has access to its own scope( variables defined between its curly braces)
//2. it has acess the outer function's varibles
//3. it has access to the global variables

//Build a reusable conunter
/*var count=0;
function add(){
    count++;
    return count;
}

function add(){
    var count=0;
    count++;
    return count;
}

function add(){
    var count =0;
    return function plus(){
        count +=1;
        return plus;
    }

}*/
//With Closure!
var add= function(){
    var count=0;
     return function (){
         count+=1;
         return count;
     }
 }();
 /*JSON
 {Key : value,
Key : value,
Key : { key : value }
}
From JSON to JS object- JSON.parse([json]);
From JS object to JSON- JSObject.stringify();
 */