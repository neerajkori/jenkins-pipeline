import java.io.File 
class Example { 
   static void main(String[] args) { 
      new File("C:/Example.txt").eachLine {  
         line -> println "line : $line"; 
      } 
   } 
}