const add = require("./add");
const subtract = require("./subtract");
const multiply = require("./multiply");
const divide = require("./divide");

const result_add = add(6,3)
const result_subtract = subtract(6,3)
const result_multiply = multiply(6,3)
const result_divide = divide(6,3)

console.log("add result: ", result_add)
console.log("subtract result: ", result_subtract)
console.log("multiply result: ", result_multiply)
console.log("divide result: ", result_divide)