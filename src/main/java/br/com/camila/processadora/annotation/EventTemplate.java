package br.com.camila.processadora.annotation;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.*;

/**
 * Anotação para RabbitTemplate bean de eventos de proposta.
 */
@Documented
@Inherited
@Qualifier("processadora-events-rabbit-template")
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface EventTemplate {

}

