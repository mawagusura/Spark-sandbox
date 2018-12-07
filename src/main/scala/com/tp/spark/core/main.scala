package com.tp.spark.core
import org.apache.spark.{SparkConf, SparkContext, sql}
import org.apache.spark.rdd.RDD
import org.apache.spark.sql.{DataFrame, SparkSession}
 

object Program {
  def main(args: Array[String]) = {
    val conf = new SparkConf()
      .setAppName("my-app")
      .setMaster("local")

    val sc = new SparkContext(conf)

    Logger.getLogger("org").setLevel(Level.Error)
    
    // Exerice 0
    //Ex0WordcountDF.wordcount.show
    //println(Ex0WordcountDF.filterOnWordcount)

    // Exercice 1
    //println(Ex1UserMining.topTenTwitterers)

    //exercice 2
    println(Ex2TweetMining.mentionOnTweet)

  }
}