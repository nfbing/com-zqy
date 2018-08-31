package com.zqy.stage.preparelesson.service.lessonImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zqy.stage.preparelesson.interfaces.IPrepareLesson;
import com.zqy.stage.preparelesson.model.LessonBean;
import org.apache.zookeeper.data.Id;

// 注册为 Dubbo 服务
@Service(version = "1.0.0")
public class LessonDemoImpl implements IPrepareLesson {
    @Override
    public LessonBean getLessonById(Long id) {
        LessonBean lessonBean = new LessonBean();
        lessonBean.setId(new Long(1));
        lessonBean.setLessonName("信息专家11");


        return lessonBean;
    }
}
