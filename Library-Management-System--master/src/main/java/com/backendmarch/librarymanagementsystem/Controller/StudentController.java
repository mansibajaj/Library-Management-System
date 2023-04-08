package com.backendmarch.librarymanagementsystem.Controller;

import com.backendmarch.librarymanagementsystem.DTO.StudentRequestDto;
import com.backendmarch.librarymanagementsystem.DTO.StudentResponseDto;
import com.backendmarch.librarymanagementsystem.DTO.StudentUpdateEmailRequestDto;
import com.backendmarch.librarymanagementsystem.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public String addStudent(@RequestBody StudentRequestDto studentRequestDto){
        studentService.addStudent(studentRequestDto);
        return "Student has been Added";

    }

    @GetMapping("/find_by_email")
    public String findStudentByEmail(@RequestParam("email") String email){
        return studentService.findByEmail(email);

    }
    //GET STUDENT OF PARTICULAR AGE

    @PutMapping("/update_email")
    public StudentResponseDto updateEmail(@RequestBody StudentUpdateEmailRequestDto studentUpdateEmailRequestDto){
        return studentService.updateEmail(studentUpdateEmailRequestDto);
    }
}
