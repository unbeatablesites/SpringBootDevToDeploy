package frank.in.restEndPointGet.Controller;


import org.springframework.web.bind.annotation.RestController;

@RestController
public class REstEndPoint {

    public Course getEndPoint(){
        return Course(name,chapterCount);
    }


}
