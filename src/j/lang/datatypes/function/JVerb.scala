package j.lang.datatypes.function

import j.lang.datatypes.JTypeMacros._
import j.lang.datatypes.array._
import j.lang.datatypes.array.JArrayType._

abstract class JVerb[T: JArrayType, V: JArrayType]
		(rep: String, val dom: JType) extends JFunc(rep) {

}