package com.zqy.stage.preparelesson.interfaces;

import com.zqy.stage.preparelesson.model.LessonBean;

public interface IPrepareLesson {

    /**
     * 根据课程id获取课程信息
     * @param id
     */
    LessonBean getLessonById(Long id);
}
