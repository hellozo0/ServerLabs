/* -------------------- */
/*   1. JSON 객체 실습    */
/* -------------------- */

const sopt = {
    name: "WE SOPT",
    slogan: "우리가 SOPT입니다",
    part: ["plan", "design", "android", "iOS", "server", "web"],
    number: 199,
    printName: function () {
        console.log("name : ", this.name);
    },
    printNum: function () {
        console.log("number : ", this.number);
    },
};

console.log("typeof sopt : " + typeof sopt); //typeof sopt : object

// + 와 , 의 차이가 무엇인지 직접 작성하면서 알아보세요 ~.~
console.log("sopt : " + sopt); //sopt : [object Object]
console.log("sopt : ", sopt); //객체가 출력
console.log("sopt :" + JSON.stringify(sopt)); //string 같이 출력..?

sopt.printName(); //name : WE SOPT
sopt.number = 190;
sopt.printNum(); //number : 190

/* -------------------- */
/*   2. JSON 배열 실습    */
/* -------------------- */

const dogs = [{
        name: "식빵",
        family: "웰시코기",
        age: 1,
        weight: 2.14
    },
    {
        name: "콩콩",
        family: "포메라니안",
        age: 3,
        weight: 2.5
    },
    {
        name: "두팔",
        family: "푸들",
        age: 7,
        weight: 3.1
    },
];

console.log("dogs : " + dogs); //dogs : [object Object], [object Object], [object Object]
console.log("dogs : ", dogs); // 객체 전체다 출력
console.log("dogs :" + JSON.stringify(dogs)); //한 줄로 출력

// 식빵이는 @고 , 나이가 1세 입니다 ~ 콩콩이는 ~ 두팔이는 ~
dogs.forEach(dog =>
    console.log(
        dog.name +
        "이는 종이 " +
        dog.family +
        "이고, 나이가 " +
        dog.age +
        "세입니다 ~",
    ),
);