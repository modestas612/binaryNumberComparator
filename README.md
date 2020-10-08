## binaryNumberComparator

## It is a console application that accepts two numeric parameters (A and B) and a number of comparisons.
### Application operation process:
•	Initial numbers are application parameters;
•	The number is multiplied by a coefficient; (generator A coefficient is 16807, generator B coefficient is 48271);
•	The result is divided by 2147483647;
•	Divided result becomes the starting number of the next iteration;
•	The process is repeated according to the specified number of comparisons;
•	the application takes one number from each generator, convert it to a binary number, subtract the last 8 digits from each result, and compare whether their last 8 digits match;
## Application output - a number indicating how many times the comparison gave a positive result.
