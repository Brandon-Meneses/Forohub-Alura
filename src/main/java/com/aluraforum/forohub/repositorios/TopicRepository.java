package com.aluraforum.forohub.repositorios;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<KafkaProperties.Retry.Topic, Long> {
}
