package com.zqy.stage.preparelesson.controller;

import com.zqy.stage.preparelesson.model.LessonBean;
import com.zqy.stage.preparelesson.process.PrepareLessonProcess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class PrepareLessonController {

    @Autowired
    private PrepareLessonProcess prepareLessonProcess;

    @GetMapping(path = "/getlesson")
    public LessonBean getPrepareLessonInfo(){
        LessonBean lessonBean = prepareLessonProcess.getPrepareLesson(new Long(1));
        return lessonBean;
    }
}
