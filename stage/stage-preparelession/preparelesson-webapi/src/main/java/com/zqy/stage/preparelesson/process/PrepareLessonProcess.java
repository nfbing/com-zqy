package com.zqy.stage.preparelesson.process;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zqy.stage.preparelesson.interfaces.IPrepareLesson;
import com.zqy.stage.preparelesson.model.LessonBean;
import org.springframework.stereotype.Component;

@Component
public class PrepareLessonProcess {

    @Reference(version = "1.0.0")
    private IPrepareLesson prepareLesson;

    public LessonBean getPrepareLesson(Long id){
        LessonBean lessonBean = prepareLesson.getLessonById(id);

        return lessonBean;
    }
}
