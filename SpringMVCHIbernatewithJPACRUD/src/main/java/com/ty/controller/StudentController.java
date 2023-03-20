package com.ty.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ty.dao.StudentDao;
import com.ty.dto.Student;

@Controller
public class StudentController {

	@Autowired
	private StudentDao studentDao;

	@RequestMapping("createstudent")
	public ModelAndView createStudent() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("createstudent.jsp");
		mv.addObject("student", new Student());
		return mv;
	}

	@RequestMapping("savestudent")
	public ModelAndView saveStudent(@ModelAttribute Student student) {
		studentDao.saveStudent(student);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("message.jsp");
		mv.addObject("message", student.getName() + " is saved");
		return mv;
	}

	@RequestMapping("viewstudents")
	public ModelAndView getAllStudents() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("displaystudents.jsp");
		mv.addObject("students", studentDao.getAllStudent());
		return mv;
	}

	@RequestMapping("edit")
	public ModelAndView editStudent(@RequestParam int id) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("editstudent.jsp");
		mv.addObject("student", studentDao.getStudentById(id));
		return mv;
	}

	@RequestMapping("delete")
	public ModelAndView deleteStudent(@RequestParam int id) {
		ModelAndView mv = new ModelAndView();
		studentDao.deleteStudent(id);
		mv.setViewName("message.jsp");
		mv.addObject("message", "student is updated");
		return mv;
	}

	@RequestMapping("updatestudent")
	public ModelAndView updateStudent(@ModelAttribute Student student) {
		studentDao.updateStudent(student);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("message.jsp");
		mv.addObject("message", "student is updated");
		return mv;
	}
}
