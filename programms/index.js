let num1, num2;

num1 = window.prompt("Enter the first number : ", "0");
num2 = window.prompt("Enter the second number : ", "0");

if (parseInt(num1, 10) > parseInt(num2, 10)) {
	console.log("The large of " + num1 + " and " + num2 + " is " + num1 + ".");
} else if (parseInt(num2, 10) > parseInt(num1, 10)) {
	console.log("The large of " + num1 + " and " + num2 + " is " + num2 + ".");
} else {
	console.log('The values ' + num1 + " and " + num2 + "are equal.");
}