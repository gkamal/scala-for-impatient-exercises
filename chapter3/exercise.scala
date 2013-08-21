//1. set a to an array of n random integers between (0..n]

val r = new scala.util.Random()
val n = 10
val a = for(i <- 0  to n) yield r.nextInt(n)

//2. loop that swaps adjacent elements of an array

val a = Array(1,2,3,4,5)
for(i <- 1 until a.length by 2) {
  val temp = a(i)
  a(i) = a(i-1)
  a(i-1) = temp
}
print(a.mkString("Array(",",",")"))

//3. solve 2, but produce new array use for/yield
val a2 = Array(1,2,3,4,5)

// need to figure out how to get rid of the math.min
for(i <- 0 until a2.length) yield { if (i % 2 == 0)  a2(math.min(i+1,a2.length-1)) else a2(i-1)}

//4. split array into positive and negative numbers, preserving original ordering

val a3 = Array(1,-2,3,-5,7,4,-4)
(for(n <- a3 if n >= 0) yield n) ++ (for(n <- a3 if n < 0) yield n)

//5. compure average of an Array[Double]
val a4 = Array(1.5,2.5,3.5,6.5)
a4.sum / a4.length

//6. array reverse sorted order, also do the same for array buffer 
val a5 = Array(5,1,3,2,7)
// need to figure out how to change sort order
scala.util.Sorting.quickSort(a5)
print(a5.mkString("Array(",",",")"))

val a6 = scala.collection.mutable.ArrayBuffer(9,4,2,8,5,7)
// need to figure out how to sort original buffer instead of creating new buffer
a6.sortWith(_ > _)

// 7. Remove duplicates from array
val a7 = Array(1,3,4,1,4,5,7,6)
a7.distinct

// 8. remove all but the first negative number from the array. 
val a8 = scala.collection.mutable.ArrayBuffer(1,3,4,-1,7,8,-9,-1,4,-3)

var j = 0
var first = true
for(i <- 0 until a8.length) {
  if (a8(i) > 0 || first) {
    a8(j) = a8(i)
    j += 1
  }
  if (a8(i) < 0) first = false 
}
a8.trimEnd(a8.length - j)
print(a8.mkString("Array(",",",")"))

//9. TODO

//10. TODO



