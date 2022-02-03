/* -------------------- */
/*   1. 배열 실습    */
/* -------------------- */

var arr1 = [];
console.log(arr1); //[]
console.log(typeof arr1); //object

var arr2 = new Array(1, 2, 3, 4, 5);
console.log(arr2); //[1,2,3,4,5]
console.log(typeof arr2); //object

var arr3 = ["김우영", 1, 2, 3, null, { name: "wooyeong", age: 25 }];
console.log(arr3); //["김우영", 1, 2, 3, null, { name: "wooyeong", age: 25 }]
console.log(typeof arr3); //object

/* -------------------------- */
/*   2. 배열 prototype 메서드    */
/* -------------------------- */

console.log("\n\n**** Array 기본 함수들을 알아보자 ****");
var arr = [1, 2, 3, 4];

// 2-1, length
console.log(`arr의 길이: ${arr.length}`); //4

// 2-2, push, pop
arr.push("new item"); 
console.log("arr push:", arr); // [1,2,3,4, 'new item]
arr.pop();
console.log("arr pop:", arr); //[1,2,3,4]

// 2-3 shift(배열에서 첫번째 요소를 제거하고, 제거된 요소를 반환), unshift(새로운 요소를 맨 앞에 추가하기)
arr.unshift("first item"); 
console.log("arr unshift:", arr); // ['first item' ,1,2,3,4 ]
arr.shift(); 
console.log("arr shift:", arr); // [1,2,3,4]

// 2-4 includes : 들어 있는지, 아닌지
console.log("arr.includes(4):", arr.includes(4)); //true
console.log("arr.includes(1000):", arr.includes(1000)); //false

// 2-5 indexOf : 해당 요소의 인덱스값
console.log("arr.indexOf(4):", arr.indexOf(4)); //3
console.log("arr.indexOf(100):", arr.indexOf(100)); //-1(없음)

// 2-6 concat  배열을 합쳐줌,
var arr1 = [1, 2, 3];
var arr2 = [4, 5, 6];
var concatArr = arr1.concat(arr2);
console.log("arr1.concat(arr2):", concatArr); //[1,2,3,4,5,6]

// 2-7 join : 배열 요소들 사이사이에 string 넣기
var location = ["서울", "대전", "대구", "부산"];
console.log(location.join("-> ")); // 서울 -> 대전 -> 대구 -> 부산

// 2-8 reverse : 반대로 정렬
console.log(location.reverse().join("-> ")); //부산 -> 대구 -> 대전 -> 서울

// 2-9 sort
var countries = ["Österreich", "Andorra", "Vietnam"];
console.log(countries.sort((a, b) => (a > b ? 1 : -1))); // Andorra, Vietnam, Österreich (제대로 정렬이 되지 않았습니다.)
console.log(
  countries.sort(function (a, b) {
    return a.localeCompare(b); // b가 a 보다 정렬상 앞에 있으면 양수, b 가 a보다 정렬상 뒤에 있으면 음수, 동등한 경우에는 0을 반환
  }),
); // Andorra,Österreich,Vietnam (제대로 정렬되었네요!) 유니코드 기준으로 문자 정렬
console.log( //1,2,3,4,5,6
  "오름차순 정렬:",
  concatArr.sort((a, b) => a - b),
);
console.log( //6,5,4,3,2,1
  "내림차순 정렬:",
  concatArr.sort(function (a, b) {
    return b - a;
  }),
);

// 2-10 filter 필터는 배열 요소 전체를 대상으로 조건을 걸어서 그 조건을 충족하는 결과를 새로운 배열을 반환해줌.
var number = [100, 234, -125, 1, 23, -637, -123, 99, 2, 3, 4, 5];
var minusNumber = number.filter(item => item < 0);
console.log("minusNumber: ", minusNumber); //-125, -637, -123

// 2-11 map  map은 배열 요소 전체를 대상으로 함수를 호출하고, 그 결과를 새로운 배열을 반환할때 주로 사용
var countries = ["Österreich", "Andorra", "Vietnam", "Korea", "China"];
var countriesLengths = countries.map(item => item.length);
console.log("countriesLengths: ", countriesLengths); //10,7,7,5,5

// 2-12 reduce map은 배열을 반환할때 사용했지만 reduce는 값 하나를 반환할때 주로 사용 대표적인 예시로 1 ~ n 까지 더하기
var number = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
var sum = number.reduce((previousValue, currentValue) => {
  console.log(`previousValue: ${previousValue}, currentValue: ${currentValue}`);
  return previousValue + currentValue;
});

console.log("sum = ", sum); //55

/* -------------------- */
/*   3. 배열 순회    */
/* -------------------- */

var serverPart = [
  "강한희",
  "고성용",
  "구건모",
  "권세훈",
  "김영권",
  "김은지",
  "김진욱",
];
var serverIndexStr = '서버파트 여러분 번호 한번 세겠습니다. "';
var serverPartMemberNameStr = '서버파트 여러분 이름 한번씩만 불러주세요~ "';

//in이면 인덱스로 가져오네..
for (var item in serverPart) { 
  serverIndexStr += item + "! ";
}
console.log(serverIndexStr);

//of면 값을 가져온다..!
for (var item of serverPart) { 
  serverPartMemberNameStr += item + "! ";
}
console.log(serverPartMemberNameStr);

//forEach :  각각의 요소를 출력
serverPart.forEach(item => {
  console.log(item);
});