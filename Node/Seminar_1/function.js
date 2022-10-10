/* -------------------- */
/*   1. 함수 선언식 실습    */
/* -------------------- */

function add1(x, y) {
  return x + y;
}
console.log(add1(2, 3)); //5

/* -------------------- */
/*   2. 함수 표현식 실습    */
/* -------------------- */

const addStr = function (x, y) {
  return x + y;
};
console.log(addStr("안녕", "하세요")); //안녕하세요

/* -------------------- */
/*   3. 함수 표현식 실습    */
/*     - 화살표 함수 -     */
/* -------------------- */

const add2 = (x, y) => {
  return x + y;
};

const add3 = x => {
  return x;
};

const add4 = () => {
  return 1;
};

// 로직이 한줄일때 return 문 생략 가능
const add5 = (x, y) => x + y;

// 매개변수가 하나일때 매개변수 소괄호 생략 가능
const square = x => x * x;

// 객체를 리턴하고 로직이 한줄일때는 소괄호 ( ) 로 감싸줘야함
const person1 = (name, age) => ({
  name: name,
  age: age
});

// 위의 person 화살표 함수는 아래와 동일
const person2 = function (name, age) {
  return {
    name: name,
    age: age,
  };
};