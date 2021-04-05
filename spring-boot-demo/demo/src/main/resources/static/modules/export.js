/**
 * 
 */

// 배열 내보내기
let months = ['Jan', 'Feb', 'Mar','Apr', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec'];

// 상수 내보내기
const MODULES_BECAME_STANDARD_YEAR = 2015;

// 함수 내보내기
function sayHi(user) {
    alert(`Hello, ${user}!`);
  }
  

// 클래스 내보내기
class User {
  constructor(name) {
    this.name = name;
  }
}

export { months, MODULES_BECAME_STANDARD_YEAR as year, sayHi, User };