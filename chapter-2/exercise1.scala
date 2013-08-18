
// 1. 
def signum(x : Int) = if (x>0) 1 else if (x<1) -1 else 0

println("signum(100) = " + signum(100))
println("signum(-100) = " + signum(-100))
println("signum(0) = " + signum(0))

// 2. value of empty block {}  - is it () / Unit

println("value of empty block is", {})

//3. come up with one situation where the assignment x=y=1 is valied in scala. 
// TODO - find out

// 4. Write scala equirvalent for the java loop
// for(int i=10; i>=0;i--) System.out.println(i)
for(i <- 10 to 0 by -1) println(i)

// 5. Write a procedure countdown(n: Int) that prints the numbers from n to 0

def countdown(n: Int) = for(i <- n to 0 by -1) println(i)

print("countdown(10)")
countdown(10)

// 6. Write for loop for computing the product of the Unicode codes of all letters in a string
def productUnicodeOfLetters(s: String) = {
  var result=1l;
  for(c <- s) result = result * c.toInt 
  result
}

print("productUnicodeOfLetters(Hello)=",productUnicodeOfLetters("Hello"));

// 7. Solve 6. without writing a loop

def productUnicodeOfLettersWithoutLoop(s: String) = {
  var result=1l;
  def accumulate(x: Char) = result = result * x.toInt
  s.foreach(accumulate)
  result
}

// 8. write a product(s: String) that coputes the product as described 
// - already done

// 9. Make the function of the preceding exercise a recursive function.
def product(s: String) = {
  def productInner(s:String, acc:Long) : Long = {
    if (s.isEmpty) acc else productInner(s.tail, acc * s.head.toInt)
  }
  productInner(s,1l)
}

//10. Write a function that computres x**n where n is an integer

def power(x:Double, n:Int) : Double = {
  def isEven(n:Int) = n%2 == 0
  def square(x:Double) = x*x

  if (n == 0) {
    1
  } else if (n < 0) {
    1 / power(x,-1*n)
  } else if (isEven(n)) { 
    square(power(x,n/2)) 
  } else { 
    x * power(x,n-1)
  }
}

print("power(2,0)=", power(2,0))
print("power(2,1)=", power(2,1))
print("power(2,3)=", power(2,3))
print("power(2,4)=", power(2,4))

print("power(2,-4)=", power(2,-4))




