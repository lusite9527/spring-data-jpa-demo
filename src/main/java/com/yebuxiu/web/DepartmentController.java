package com.yebuxiu.web;

import com.yebuxiu.po.Department;
import com.yebuxiu.util.ResponseResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class DepartmentController {

    @GetMapping("/department1/{id}")
    public Flux<Department> getDepartment1(@PathVariable("id") Long id){
        Department dept = new Department(id,"hello","world");
        return Flux.just(dept);
    }

    @GetMapping("/department2/{id}")
    public Mono<Department> getDepartment2(@PathVariable("id") Long id){
        Department dept = new Department(id,"hello","world");
        return Mono.just(dept);
    }

    @GetMapping("/department3/{id}")
    public Mono<ResponseResult<Department>> getDepartment3(@PathVariable("id") Long id){
        Department dept = new Department(id,"hello","world");
        ResponseResult<Department> ok = new ResponseResult(200, "ok", dept);
        return Mono.just(ok);
    }
}
