package com.anvigudach

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@EnableEurekaClient
@SpringBootApplication
class BonesApplication

fun main(args: Array<String>) {
    SpringApplication.run(BonesApplication::class.java, *args)
}
