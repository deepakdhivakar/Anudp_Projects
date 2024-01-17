import { Component, OnInit } from '@angular/core';
import { Course } from '../Entities/course';
import { CourseService } from '../Services/course.service';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/internal/Observable';
import { FormGroup, FormBuilder } from '@angular/forms';
@Component({
  selector: 'app-course-list',
  templateUrl: './course-list.component.html',
  styleUrls: ['./course-list.component.css']
})
export class CourseListComponent implements OnInit {
 

  empDetail !: FormGroup;
  course : Course = new Course();
  courseList: Course[] = [];

  constructor(private formBuilder : FormBuilder, private courseService : CourseService) { }

  ngOnInit(): void {

    this.getAllCourse();

    this.empDetail = this.formBuilder.group({
      courseId: [''],
      courseType: [''],
      duration: ['']
    });    

  }

  addCourse() {
    console.log(this.empDetail);
    this.course.courseId= this.empDetail.value.courseId;
    this.course.courseType= this.empDetail.value.courseType;
    this.course.duration= this.empDetail.value.duration;

    this.courseService.addCourse(this.course).subscribe(res=>{
        console.log(res);
        this.getAllCourse();
    },err=>{
        console.log(err);
    });

  }

  getAllCourse() {
    this.courseService.getAllCourse().subscribe(res=>{
        this.courseList = res;
    },err=>{
      console.log("error while fetching data.")
    });
  }

  editCourse(course : Course) {
    this.empDetail.controls['courseId'].setValue(course.courseId);
    this.empDetail.controls['courseType'].setValue(course.courseType);
    this.empDetail.controls['duration'].setValue(course.duration);

  }

  updateCourse() {

    this.course.courseId = this.empDetail.value.courseId;
    this.course.courseType = this.empDetail.value.courseType;
    this.course.duration = this.empDetail.value.duration;

    this.courseService.updateCourse(this.course).subscribe(res=>{
      console.log(res);
      this.getAllCourse();
    },err=>{
      console.log(err);
    })

  }

  deleteCourse(course : Course) {

    this.courseService.deleteCourse(course).subscribe(res=>{
      console.log(res);
      alert('Deleted successfully');
      this.getAllCourse();
    },err => {
      console.log(err);
    });

  }
   
  
}
