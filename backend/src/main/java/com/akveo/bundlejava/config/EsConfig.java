//package com.akveo.bundlejava.config;
//
//import org.elasticsearch.client.Client;
//import org.elasticsearch.client.transport.TransportClient;
//import org.elasticsearch.common.settings.Settings;
//import org.elasticsearch.common.transport.TransportAddress;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Lazy;
//import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
//import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
//import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
//
//import java.net.InetAddress;
//
////http://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-nosql.html#boot-features-connecting-to-elasticsearch-spring-data
////https://github.com/spring-projects/spring-boot/tree/master/spring-boot-samples/spring-boot-sample-data-elasticsearch/src/main/java/sample/data/elasticsearch
////http://docs.spring.io/spring-data/elasticsearch/docs/current/reference/html/#elasticsearch.repositories
////http://geekabyte.blogspot.my/2015/08/embedding-elasticsearch-in-spring.html
////https://github.com/spring-projects/spring-data-elasticsearch/wiki/Spring-Data-Elasticsearch---Spring-Boot---version-matrix
//@Configuration
//@EnableElasticsearchRepositories(basePackages = "com.akveo.bundlejava.search")
//public class EsConfig {
//
////    @Value("${elasticsearch.host}")
////    private String EsHost;
////
////    @Value("${elasticsearch.port}")
////    private int EsPort;
////
////    @Value("${elasticsearch.clustername}")
////    private String EsClusterName;
//
////    @Bean
////    public Client client() throws Exception {
////
////        Settings esSettings = Settings.builder()
////                .put("cluster.name", "docker-cluster")
////                .build();
////
////        //https://www.elastic.co/guide/en/elasticsearch/guide/current/_transport_client_versus_node_client.html
////        TransportClient client = new PreBuiltTransportClient(esSettings)
////                .addTransportAddress(new TransportAddress(InetAddress.getByName("163.172.100.227"), 9300));
////        return client;
////    }
//
////    @Bean
////    public ElasticsearchOperations elasticsearchTemplate() throws Exception {
////        return new ElasticsearchTemplate(client());
////    }
//
//    //Embedded Elasticsearch Server
////    @Bean
////    public ElasticsearchOperations elasticsearchTemplate() {
////        return new ElasticsearchTemplate(nodeBuilder().local(true).node().client());
////    }
//
//}
