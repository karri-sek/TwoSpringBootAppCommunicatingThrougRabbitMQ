# TwoSpringBootAppCommunicatingThrougRabbitMQ
This repo contains two spring boot app communicating through RabbitMQ

Folder `rabbitMQSender` contains the code base for sender
Folder `rabbitMQReceiver` contains the code base for receiver.
Sender and Receiver communicating through the exchange and a queue was binding to this exchange with a key.

Steps to run:
 1) please make sure RabbitMQ server running locally, before executing this app.
 2) Download rabbitMQSender folder and run.
 3) Download rabbitMQReceiver folder and run.
 4) send a message from rabbitMQSender by copying the below line to browser address bar.
  `http://localhost:8080/britishgas-rabbitmq/producer?empName=emp3&empId=3`
  5) you should able to see this message from receiver as he was received this.
  
  
