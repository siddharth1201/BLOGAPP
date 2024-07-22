package com.example.blogApp.article.dtos;

import org.springframework.lang.Nullable;

import io.micrometer.common.lang.NonNull;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Data
@Setter(AccessLevel.NONE)
public class CreateArticleDTO {
    @NonNull
    String title;

    @NonNull
    String body;


    @Nullable
    String subtitle;
}
