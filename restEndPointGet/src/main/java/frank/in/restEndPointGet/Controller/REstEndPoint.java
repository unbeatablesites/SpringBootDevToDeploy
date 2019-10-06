package frank.in.restEndPointGet.Controller;


import frank.in.restEndPointGet.CourseConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class REstEndPoint {

    @Value("${default.course.name}")
    private String cName;

    @Value("${default.course.chapterCount}")
    private int chaptersCount;

    @Autowired
    private CourseConfiguration courseConfiguration;


    @RequestMapping("/defaultCourse")
    public HashMap<String, Object> getDefaultCourse(@RequestParam(value = "name",required = false)String name,
                                    @RequestParam(value = "chapterCount", defaultValue = "2",required = false)int chapterCount
    ){
        HashMap<String, Object> map = new HashMap<>();

        map.put("name",courseConfiguration.getName());
        map.put("chapterCount",courseConfiguration.getChapterCount());
        map.put("rating",courseConfiguration.getRating());
        map.put("author",courseConfiguration.getAuthor());

        return map;
    }

    @RequestMapping("/gethierchical")
    public Course getAnnotatedProperties(@RequestParam(value = "name",required = false)String name,
                              @RequestParam(value = "chapterCount", defaultValue = "2",required = false)int chapterCount
    ){
        return new Course(cName,chaptersCount);
    }


    @RequestMapping("/course")
    public Course getEndPoint(@RequestParam(value = "name", defaultValue = "Spring Boot",required = false)String name,
                              @RequestParam(value = "chapterCount", defaultValue = "2",required = false)int chapterCount
                              ){
        return new Course(name,chapterCount);
    }



@RequestMapping(method = RequestMethod.POST, value = "/register/course")
    public String saveCourse(@RequestBody Course course){

    return "Your course named " + course.getName() + " with " + course.getChapterCount() + " chapters saved";
    }

}
