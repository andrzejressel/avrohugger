/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package example.idl.array

import scala.annotation.switch

final case class ArrayIdl(var data: List[Int]) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this(List.empty)
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        scala.jdk.CollectionConverters.BufferHasAsJava({
          data map { x =>
            x
          }
        }.toBuffer).asJava
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.data = {
        value match {
          case (array: java.util.List[?]) => {
            scala.jdk.CollectionConverters.IteratorHasAsScala(array.iterator).asScala.map({ x =>
              x
            }).toList
          }
        }
      }.asInstanceOf[List[Int]]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = example.idl.array.ArrayIdl.SCHEMA$
}

object ArrayIdl {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ArrayIdl\",\"namespace\":\"example.idl.array\",\"fields\":[{\"name\":\"data\",\"type\":{\"type\":\"array\",\"items\":\"int\"}}]}")
}
