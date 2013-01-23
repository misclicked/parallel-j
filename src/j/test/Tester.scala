 package j.test

import j.lang._
import j.lang.JLexer._
import java.io.File

import scala.io.Source

object Tester {
	def main(args:Array[String]) {

	}
	
	def testArrays {
	  
	}
	
	def testLexerfromFile(ijs: File) {
	  Source.fromFile(ijs).getLines.map(sequentialMachine).foreach(
	     (l: List[JLexeme]) => println(l mkString("\n"))) 
	}
	
	def testLexer {
	  var input = "sum =:+/_6.95*i.3 4 2"
	  var erin  = "\'"
	  val classes = input.map(CharWClass.charClassify)
	  classes.foreach(println)
	  
	  println()
	  
	  smLookUpTable.foreach(x => {
	    println("[" + x.mkString(",") + "]")
	  })
	  println()
	  
	  println(sequentialMachine(input).mkString("\n"))
	  
	  testLexerfromFile(new File("/home/christopher/j701-user/temp/game_of_life.ijs") )
	  
//	  println(tokenize(input).mkString("\n"))
//	  tokenize(erin)	  
	}
}