package com.example.ResponseUtils;

import com.example.ResponseUtils.response.BaseApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class TestController {

    //이런식으로 사용
//    @ApiOperation(value = "태그로 코스 조회",
//            httpMethod = "GET",
//            response = BaseApiResponse.class,
//            notes = "태크로 코스 조회 API"
//    )
//    @ApiResponses({
//            @ApiResponse(code = 200, message = "태크로 코스 조회 성공"),
//            @ApiResponse(code = 400, message = "잘못된 태그")
//    })
//    @GetMapping("/search/tag")
//    public BaseApiResponse<Object> searchCoursesByTag(@RequestParam("tag") String tag) {
//
//        List<CourseToViewDto> foundCourses = courseService.findCourseViewByTag(tag);
//
//        return new BaseApiResponse<>("Tag " + tag + " 코스 조회 완료", foundCourses);
//    }
}
