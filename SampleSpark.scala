val s = spark.sql("select * from samples")
s.printSchema
s.count
