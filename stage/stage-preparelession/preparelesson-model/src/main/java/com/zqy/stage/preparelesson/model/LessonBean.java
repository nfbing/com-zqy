package com.zqy.stage.preparelesson.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * 课程类
 *
 * created by nfbing 2018-8-28
 */
@Data
public class LessonBean implements Serializable {

    /**
     * 课程编号
     */
    private Long id;

    /**
     * 课程名称
     */
    private String lessonName;
}
