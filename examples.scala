val intRDD = sc.parallelize(Array(1,4,5,6,7,10,15))
val evenNumbersRDD=intRDD.filter(i => (i%2==0))
val sum =evenNumbersRDD.sum

val file=sc.textFile("C:/spark/spark-2.4.0-bin-hadoop2.7/examples/src/main/resources/people.txt")
val flattenFile = file.flatMap(s =>s.split(", "))
flattenFile.collect