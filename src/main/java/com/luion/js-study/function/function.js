//1、函数的声明与函数表达式的差别
function foo(a) {
  function bar() {}
  let b = 3;
}

foo();
//函数的声明
function foo00() {
  var c = 0;
  console.log(c);
}

// foo00()可以在外部被访问 vs foo01() 只能在foo01{}里被访问???举例失败

//函数的表达式
(function foo01() {
  var d = 0;
  // foo01().d
  console.log(d);
})();

//2、匿名和具名

setTimeout(function () {
  console.log("hello,world");
}, 1000);

//3.立即执行函数表达式
var a = 2;
(function foo03() {
  var a = 3;
  console.log(a);
})();

console.log(a);

console.log("======");
//IIFE代表立即执行函数
var a = 1;
(function IIFE() {
  var a = 4;
  console.log(a);
})();

console.log(a);
