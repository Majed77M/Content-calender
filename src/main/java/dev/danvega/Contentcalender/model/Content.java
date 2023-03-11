package dev.danvega.Contentcalender.model;

import jdk.jshell.Snippet;

import java.time.LocalDateTime;


public record Content(
    Integer id,
    String title,
    String desc,
    Status status,
    Type ContentType,
    LocalDateTime dateCreated,
    LocalDateTime Update,
    String url
){};
