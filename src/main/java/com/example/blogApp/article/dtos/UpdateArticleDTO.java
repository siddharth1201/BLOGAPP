package com.example.blogApp.article.dtos;

import org.springframework.lang.Nullable;

import io.micrometer.common.lang.NonNull;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Data
@Setter(AccessLevel.NONE)
public class UpdateArticleDTO {
    @Nullable
    String title;

    @Nullable
    String body;


    @Nullable
    String subtitle;
}
