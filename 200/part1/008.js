let x=5;//숫자형(Number)
let y='five';//문자형(String)
let isTrue=true;//불린형(boolean)
let empty=null;
let nothing
let sym=Symbol('me');

let item ={
    price: 5000,
    count: 10
};
let fruits=['apple','orange','kiwi'];
let addFruit=function (fruit) {
    fruits.push(fruit);
}
addFruit('watermelon');
console.log(fruits);