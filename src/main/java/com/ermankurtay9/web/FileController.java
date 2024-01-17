package com.ermankurtay9.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ermankurtay9.service.FileService ;

@RestController
public class FileController {  

	@Autowired
    private FileService fileService;

  

    @GetMapping("/message")
    public String msg() {
     
        return fileService.getMessage();
    }
}
