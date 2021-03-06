### Kafka 
Apache Kafka is a distributed messaging and streaming platform.<br/>
It serves to move and transform a large amount of data between different systems. <br/>
### Kafka implmentation with spring boot 
1. Kafka dependencies
   ```
   <dependency>
   <groupId>org.apache.kafka</groupId>
   <artifactId>kafka-streams</artifactId>
   </dependency>
   <dependency>
   <groupId>org.springframework.kafka</groupId>
   <artifactId>spring-kafka</artifactId>
   </dependency>
   ```
2. application.properties configuration
3. Add `@EnableKafka` into the main class
### Kafka annotations
`@EnableKafka` makes it possible to connect to a topic. <br/>
`@KafkaListener(topics = topicName, groupId = group_id)` marks a method to be the target of a Kafka message listener on the specified topics,
 with the topic that you’d like to listen to, as well as a groupId. You can simply print the messages received.
### Kafka serialization 
Every Kafka Streams application must provide SerDes (Serializer/Deserializer) for the data types. We set our configuration using `ProducerConfig` object. Checking on
[ProducerConfig documentation](https://docs.confluent.io/platform/current/installation/configuration/producer-configs.html). By default, kafka serialization is by String. <br/>
[ConsumerConfig documentation](https://docs.confluent.io/platform/current/installation/configuration/consumer-configs.html). <br/>
[Medium reference](https://medium.com/geekculture/implementing-a-kafka-consumer-and-kafka-producer-with-spring-boot-60aca7ef7551).