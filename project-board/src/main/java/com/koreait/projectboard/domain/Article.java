package com.koreait.projectboard.domain;

import java.time.LocalDateTime;

public class Article {
    private Long id;
    private String title;
    private String content;
    private String hashtag; // 해시태그

    private LocalDateTime createdAt; // 생성일 시
    private String createdBy;   // 생성자
    private LocalDateTime modifiedAt;   // 수정일시
    private String modifiedBy; // 수정자
}
