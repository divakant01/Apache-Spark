package com.divakant

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object Demo {
  
  val conf=new SparkConf().setAppName("Demo").setMaster("local[*]")
  val sc=new SparkContext(conf)
  
  def main(args: Array[String]): Unit = {
    println(sc.sparkUser)
  }
  
}