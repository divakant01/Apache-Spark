package com.divakant

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object Demo {
  
  val conf=new SparkConf().setAppName("Demo").setMaster("local[*]").setSparkHome("/home/rock/spark-2.0.2-bin-hadoop2.7")
  val sc=new SparkContext(conf)
  
  def main(args: Array[String]): Unit = {
    println(sc.sparkUser)  
  }
  
}