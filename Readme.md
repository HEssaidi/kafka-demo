### Kafka 
Apache Kafka is a distributed messaging and streaming platform.<br/>
It serves to move and transform a large amount of data between different systems. <br/>
### Kafka annotations
`@EnableKafka` makes it possible to connect to a topic. <br/>
`@KafkaListener(topics = topicName, groupId = group_id)` marks a method to be the target of a Kafka message listener on the specified topics,
 with the topic that you’d like to listen to, as well as a groupId. You can simply print the messages received.
We need to specify a deserializer for messages in application.properties